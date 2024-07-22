package jp.co.systemi.study.math_quiz.mapper;

import jp.co.systemi.study.math_quiz.domain.Ingestion;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.OffsetDateTime;
import java.util.List;

@Mapper
public interface IngestionMapper {
  @Select("SELECT * FROM wine_ingestion_history")
  @ConstructorArgs({
          @Arg(column = "id", javaType = int.class),
          @Arg(column = "examinee_id", javaType = int.class),
          @Arg(column = "wine_id", javaType = int.class),
          @Arg(column = "ingestion_time", javaType = OffsetDateTime.class),
          @Arg(column = "created_datetime", javaType = OffsetDateTime.class),
          @Arg(column = "updated_datetime", javaType = OffsetDateTime.class)
  })
  List<Ingestion> selectAll();
}
