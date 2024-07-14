package jp.co.systemi.study.math_quiz.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.io.Serializable;

@Data
public class Examinee implements Serializable {
  @Setter(AccessLevel.NONE)
  private int id;
}
