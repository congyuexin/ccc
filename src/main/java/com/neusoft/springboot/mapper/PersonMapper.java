package com.neusoft.springboot.mapper;

import com.neusoft.springboot.bean.Person;
import org.apache.ibatis.annotations.*;


//指定这是一个操作数据库的mapper
//@Mapper
public interface PersonMapper {

    @Select("select * from person where id=#{id}")
    public Person getPersonById(Integer id);

    @Delete("delete from person where id=#{id}")
    public int deletePersonById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into person(username) values(#{username})")
    public int insertPerson(Person department);

    @Update("update person set username=#{username} where id=#{id}")
    public int updatePerson(Person department);
}
