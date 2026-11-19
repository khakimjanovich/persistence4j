package io.github.org4j.persistence.c;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Note {
  @Id Long id;
  String text;
  String author;
}
