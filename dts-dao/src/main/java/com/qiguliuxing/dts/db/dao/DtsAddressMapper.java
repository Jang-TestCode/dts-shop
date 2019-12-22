package com.qiguliuxing.dts.db.dao;

import com.qiguliuxing.dts.db.domain.DtsAddress;
import com.qiguliuxing.dts.db.domain.DtsAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtsAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_address
     *
     * @mbg.generated
     */
    long countByExample(DtsAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_address
     *
     * @mbg.generated
     */
    int deleteByExample(DtsAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_address
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_address
     *
     * @mbg.generated
     */
    int insert(DtsAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_address
     *
     * @mbg.generated
     */
    int insertSelective(DtsAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_address
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsAddress selectOneByExample(DtsAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_address
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsAddress selectOneByExampleSelective(@Param("example") DtsAddressExample example, @Param("selective") DtsAddress.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_address
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<DtsAddress> selectByExampleSelective(@Param("example") DtsAddressExample example, @Param("selective") DtsAddress.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_address
     *
     * @mbg.generated
     */
    List<DtsAddress> selectByExample(DtsAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_address
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsAddress selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DtsAddress.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_address
     *
     * @mbg.generated
     */
    DtsAddress selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_address
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsAddress selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_address
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DtsAddress record, @Param("example") DtsAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_address
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DtsAddress record, @Param("example") DtsAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_address
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DtsAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_address
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DtsAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_address
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") DtsAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_address
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}