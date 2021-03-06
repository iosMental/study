package org.xi.quick.codebuilder.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.xi.quick.codebuilder.entity.Column;

import java.util.List;

@Mapper
public interface ColumnsMapper {

    List<Column> getColumns(@Param("databaseName") String databaseName, @Param("tableName") String tableName);
}
