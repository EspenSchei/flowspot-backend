package no.flowspot.models;

import org.immutables.value.Value;

@Value.Immutable
public interface Track {
  String name();
  String artist();
}
