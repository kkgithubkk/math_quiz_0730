package jp.co.systemi.study.math_quiz.domain;

import lombok.Data;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Data
public class Wine implements Serializable {
  private final int id;
  private final boolean toxic;
  private final OffsetDateTime createdDatetime;
  private final OffsetDateTime updatedDatetime;

  public static Wine create(boolean isToxic) {
    return new Wine(0, isToxic, null, null);
  }

  public static Wine create(int id) {
    return new Wine(id, false, null, null);
  }
}
