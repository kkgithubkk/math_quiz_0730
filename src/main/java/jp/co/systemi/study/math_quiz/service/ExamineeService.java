package jp.co.systemi.study.math_quiz.service;

import jp.co.systemi.study.math_quiz.domain.Examinee;
import jp.co.systemi.study.math_quiz.mapper.ExamineeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class ExamineeService {


  private final ExamineeMapper examineeMapper;

  @Autowired
  public ExamineeService(ExamineeMapper examineeMapper) {
    this.examineeMapper = examineeMapper;
  }

  @Transactional
  public List<Examinee> findAll() {
    return examineeMapper.findAll();
  }

  @Transactional
  public Examinee insert() {
    var examinee = new Examinee(0, OffsetDateTime.now(), OffsetDateTime.now());
    examineeMapper.insert(examinee);
    return examinee;
  }

  @Transactional
  public void delete(int id) {
    examineeMapper.delete(id);
  }

}
