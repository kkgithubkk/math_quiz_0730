package jp.co.systemi.study.math_quiz.domain;

import lombok.Data;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Data
public class Ingestion implements Serializable {
  private final int id;
  private final int examineeId;
  private final int wineId;
  private final OffsetDateTime ingestionTime;
  private final OffsetDateTime createdDatetime;
  private final OffsetDateTime updatedDatetime;
}
