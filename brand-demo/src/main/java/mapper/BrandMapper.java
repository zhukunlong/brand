package mapper;

import org.apache.ibatis.annotations.*;
import pojo.Brand;

import java.util.List;

public interface BrandMapper {
//    查询所有
    @Select("select * from brand")
    List<Brand> selectAll();

//    companyDescription
    @Insert("insert into brand values (null,#{brandName},#{companyName},#{ordered},#{companyDescription},#{status})")
    void add(Brand brand);


//    根据id查询
    @Select("select * from brand where id=#{id}")

    Brand selectById(int id);

//    修改操作
    @Update("update brand set brandName=#{brandName},companyName=#{companyName},ordered=#{ordered},companyDescription=#{companyDescription},status=#{status} where id=#{id}")
    void update(Brand brand);

    @Delete(" delete from brand where id=#{id}")
    void deleteById(int id);
}
