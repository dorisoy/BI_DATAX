package org.java.bi.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.java.bi.db.domain.SysUserFieldPriv;
import org.java.bi.db.domain.SysUserFieldPrivExample;

public interface SysUserFieldPrivMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_field_priv
     *
     * @mbg.generated
     */
    long countByExample(SysUserFieldPrivExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_field_priv
     *
     * @mbg.generated
     */
    int deleteByExample(SysUserFieldPrivExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_field_priv
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_field_priv
     *
     * @mbg.generated
     */
    int insert(SysUserFieldPriv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_field_priv
     *
     * @mbg.generated
     */
    int insertSelective(SysUserFieldPriv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_field_priv
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysUserFieldPriv selectOneByExample(SysUserFieldPrivExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_field_priv
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysUserFieldPriv selectOneByExampleSelective(@Param("example") SysUserFieldPrivExample example, @Param("selective") SysUserFieldPriv.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_field_priv
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<SysUserFieldPriv> selectByExampleSelective(@Param("example") SysUserFieldPrivExample example, @Param("selective") SysUserFieldPriv.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_field_priv
     *
     * @mbg.generated
     */
    List<SysUserFieldPriv> selectByExample(SysUserFieldPrivExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_field_priv
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysUserFieldPriv selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SysUserFieldPriv.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_field_priv
     *
     * @mbg.generated
     */
    SysUserFieldPriv selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_field_priv
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysUserFieldPriv selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_field_priv
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SysUserFieldPriv record, @Param("example") SysUserFieldPrivExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_field_priv
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SysUserFieldPriv record, @Param("example") SysUserFieldPrivExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_field_priv
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysUserFieldPriv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_field_priv
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysUserFieldPriv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_field_priv
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") SysUserFieldPrivExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_field_priv
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}