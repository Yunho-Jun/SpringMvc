package org.zerock.springex.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

    @Select("select now()")
    //mybatis에서는 @select 어노테이션을 이용해서 쿼리 작성이 가능.
        // jdbc와 마찬가지로 ';'를 쓰지 않도록 주의
    String getTime();
}
