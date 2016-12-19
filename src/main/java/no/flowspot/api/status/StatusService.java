package no.flowspot.api.status;

import java.time.LocalDateTime;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ping")
@Produces(MediaType.APPLICATION_JSON)
public class StatusService {

  @GET
  public String ping() {
    return "Server is up and running @ " + LocalDateTime.now();
  }
}
