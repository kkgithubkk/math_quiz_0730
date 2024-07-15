package jp.co.systemi.study.math_quiz.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Wine implements Serializable {
  private final Integer id;
  private final Boolean toxic;
}
