package com.example.authserver.mapper;

import com.example.authserver.model.Oauth2RegisteredClient;
import com.example.authserver.model.Oauth2RegisteredClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Oauth2RegisteredClientMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_registered_client
     *
     * @mbg.generated Thu Aug 31 10:45:16 CST 2023
     */
    long countByExample(Oauth2RegisteredClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_registered_client
     *
     * @mbg.generated Thu Aug 31 10:45:16 CST 2023
     */
    int deleteByExample(Oauth2RegisteredClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_registered_client
     *
     * @mbg.generated Thu Aug 31 10:45:16 CST 2023
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_registered_client
     *
     * @mbg.generated Thu Aug 31 10:45:16 CST 2023
     */
    int insert(Oauth2RegisteredClient row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_registered_client
     *
     * @mbg.generated Thu Aug 31 10:45:16 CST 2023
     */
    int insertSelective(Oauth2RegisteredClient row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_registered_client
     *
     * @mbg.generated Thu Aug 31 10:45:16 CST 2023
     */
    List<Oauth2RegisteredClient> selectByExample(Oauth2RegisteredClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_registered_client
     *
     * @mbg.generated Thu Aug 31 10:45:16 CST 2023
     */
    Oauth2RegisteredClient selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_registered_client
     *
     * @mbg.generated Thu Aug 31 10:45:16 CST 2023
     */
    int updateByExampleSelective(@Param("row") Oauth2RegisteredClient row, @Param("example") Oauth2RegisteredClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_registered_client
     *
     * @mbg.generated Thu Aug 31 10:45:16 CST 2023
     */
    int updateByExample(@Param("row") Oauth2RegisteredClient row, @Param("example") Oauth2RegisteredClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_registered_client
     *
     * @mbg.generated Thu Aug 31 10:45:16 CST 2023
     */
    int updateByPrimaryKeySelective(Oauth2RegisteredClient row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_registered_client
     *
     * @mbg.generated Thu Aug 31 10:45:16 CST 2023
     */
    int updateByPrimaryKey(Oauth2RegisteredClient row);
}