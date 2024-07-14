package jp.co.systemi.study.math_quiz.mapper;

import jp.co.systemi.study.math_quiz.domain.Examinee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ExamineeMapper {
  @Select("SELECT * FROM examinee")
  List<Examinee> findAll();

  @Insert("INSERT INTO examinee () VALUES ()")
  @Options(useGeneratedKeys = true, keyProperty = "id")
  void insert(Examinee examinee);
}
