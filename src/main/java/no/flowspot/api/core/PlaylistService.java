package no.flowspot.api.core;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import no.flowspot.models.Track;
import no.flowspot.models.fixtures.TrackBuilder;
import no.flowspot.repository.core.PlaylistRepository;

@Path("playlist")
@Produces(MediaType.APPLICATION_JSON)
public class PlaylistService {
  private static final PlaylistRepository repository = new PlaylistRepository();

  @GET
  @Path("/top")
  public List<Track> getTopList() {
    return repository.getTopList().getTracks().getItems()
        .stream()
        .map(TrackBuilder::buildTrack)
        .collect(Collectors.toList());
  }
}