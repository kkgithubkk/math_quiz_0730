package jp.co.systemi.study.math_quiz.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Data
public class Ingestion implements Serializable {
  @Setter(AccessLevel.NONE)
  private int id;
  private final int examineeId;
  private final int wineId;
  private final OffsetDateTime ingestionTime;
}
