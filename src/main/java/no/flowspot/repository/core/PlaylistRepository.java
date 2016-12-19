package no.flowspot.repository.core;

import static org.slf4j.LoggerFactory.getLogger;

import java.io.IOException;
import java.util.Optional;

import no.flowspot.adapters.spotify.SpotifyApi;

import org.slf4j.Logger;

import com.wrapper.spotify.Api;
import com.wrapper.spotify.exceptions.WebApiException;
import com.wrapper.spotify.models.Playlist;

public class PlaylistRepository {
  private static final Logger LOGGER = getLogger(PlaylistRepository.class);
  private static final String topListId = "4hOKQuZbraPDIfaGbM3lKI";

  private Api spotifyApi;

  public Playlist getTopList() {
    spotifyApi = Optional.ofNullable(spotifyApi).orElse(SpotifyApi.getSpotifyApi());
    try {
      return spotifyApi.getPlaylist("spotify", topListId).build().get();
    } catch (WebApiException | IOException e) {
      LOGGER.error("Exception calling getTopList() with id: " + topListId);
      spotifyApi.refreshAccessToken();
    }

    throw new RuntimeException("Could not find playlist");
  }
}
