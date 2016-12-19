package no.flowspot.models;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.immutables.value.Value;

@JsonSerialize
@Value.Immutable
public interface Track {

  @JsonProperty
  String name();

  @JsonProperty
  String artist();
}
