package no.flowspot.api.status;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class StatusServiceTest {

  final StatusService statusService = new StatusService();

  @Test
  public void shouldRespondToPing() {
    final String ping = statusService.ping();

    assertThat(ping.contains("Server is up and running"), is(true));
  }
}