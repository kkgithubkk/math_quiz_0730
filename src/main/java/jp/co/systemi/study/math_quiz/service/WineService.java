package jp.co.systemi.study.math_quiz.service;

import jp.co.systemi.study.math_quiz.mapper.WineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WineService {
  private final WineMapper wineMapper;

  @Autowired
  public WineService(WineMapper wineMapper) {
    this.wineMapper = wineMapper;
  }
}
