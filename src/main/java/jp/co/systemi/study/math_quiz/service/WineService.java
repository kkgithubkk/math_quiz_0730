package jp.co.systemi.study.math_quiz.service;

import jp.co.systemi.study.math_quiz.domain.Wine;
import jp.co.systemi.study.math_quiz.mapper.WineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WineService {
  private final WineMapper wineMapper;

  @Autowired
  public WineService(WineMapper wineMapper) {
    this.wineMapper = wineMapper;
  }

  @Transactional
  public List<Wine> findAll() {
    return wineMapper.findAll();
  }

  @Transactional
  public Wine insert() {
    var wine = new Wine(0,false);
    wineMapper.insert(wine);
    return wine;
  }

  @Transactional
  public void delete(int id) {
    wineMapper.delete(id);
  }

}
