package jp.co.systemi.study.math_quiz.mapper;

import jp.co.systemi.study.math_quiz.domain.Examinee;
import jp.co.systemi.study.math_quiz.domain.Ingestion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IngestionMapper {
  @Select("SELECT * FROM wine_ingestion_history")
  List<Ingestion> selectAll();
}
