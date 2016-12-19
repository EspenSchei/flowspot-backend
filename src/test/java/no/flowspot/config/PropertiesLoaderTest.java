package no.flowspot.config;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.Optional;

import org.junit.Test;

public class PropertiesLoaderTest {
  private PropertiesLoader propertiesLoader = new PropertiesLoader();

  @Test
  public void testgetPropertyValue() throws Exception {
    assertThat(propertiesLoader.getPropertyValue("clientId"), is(notNullValue()));
    assertThat(propertiesLoader.getPropertyValue("clientSecret"), is(notNullValue()));
    assertThat(propertiesLoader.getPropertyValue("notExisting"), is(Optional.empty()));
  }
}