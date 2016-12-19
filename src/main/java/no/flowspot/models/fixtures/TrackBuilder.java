package no.flowspot.models.fixtures;

import java.util.stream.Collectors;

import no.flowspot.models.ImmutableTrack;

import com.wrapper.spotify.models.PlaylistTrack;
import com.wrapper.spotify.models.SimpleArtist;

public final class TrackBuilder {
  private TrackBuilder() {
  }

  public static ImmutableTrack buildTrack(PlaylistTrack track) {
    return ImmutableTrack.builder()
        .name(track.getTrack().getName())
        .artist(track.getTrack().getArtists()
            .stream()
            .map(SimpleArtist::getName)
            .collect(Collectors.joining(", ")))
        .build();
  }
}