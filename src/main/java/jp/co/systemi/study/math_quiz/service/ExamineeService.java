package jp.co.systemi.study.math_quiz.service;

import jp.co.systemi.study.math_quiz.mapper.ExamineeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamineeService {


  private final ExamineeMapper examineeMapper;

  @Autowired
  public ExamineeService(ExamineeMapper examineeMapper) {
    this.examineeMapper = examineeMapper;
  }
}
