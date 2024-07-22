package jp.co.systemi.study.math_quiz.domain;

import lombok.Data;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Data
public class Examinee implements Serializable {
  private final Integer id;

  private final OffsetDateTime createdDatetime;

  private final OffsetDateTime updatedDatetime;
}
