package jp.co.systemi.study.math_quiz.service;

import jp.co.systemi.study.math_quiz.mapper.IngestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngestionService {
  private final IngestionMapper ingestionMapper;

  @Autowired
  public IngestionService(IngestionMapper ingestionMapper) {
    this.ingestionMapper = ingestionMapper;
  }
}
