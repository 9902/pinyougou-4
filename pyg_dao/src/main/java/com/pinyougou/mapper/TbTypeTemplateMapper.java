package com.pinyougou.mapper;

import com.pinyougou.pojo.TbTypeTemplate;
import com.pinyougou.pojo.TbTypeTemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbTypeTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    int countByExample(TbTypeTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    int deleteByExample(TbTypeTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    int insert(TbTypeTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    int insertSelective(TbTypeTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    List<TbTypeTemplate> selectByExample(TbTypeTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    TbTypeTemplate selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    int updateByExampleSelective(@Param("record") TbTypeTemplate record, @Param("example") TbTypeTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    int updateByExample(@Param("record") TbTypeTemplate record, @Param("example") TbTypeTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    int updateByPrimaryKeySelective(TbTypeTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    int updateByPrimaryKey(TbTypeTemplate record);
}