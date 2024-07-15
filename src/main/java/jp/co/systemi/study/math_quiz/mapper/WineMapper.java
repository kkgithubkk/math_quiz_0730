package jp.co.systemi.study.math_quiz.mapper;

import jp.co.systemi.study.math_quiz.domain.Wine;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface WineMapper {
  @Select("SELECT * FROM wine")
  List<Wine> findAll();

  @Insert("INSERT INTO wine (toxic) VALUES (#{toxic})")
  @Options(useGeneratedKeys = true, keyProperty = "id")
  void insert(Wine examinee);

  @Delete("DELETE FROM wine WHERE id=#{id}")
  void delete(int id);
}
