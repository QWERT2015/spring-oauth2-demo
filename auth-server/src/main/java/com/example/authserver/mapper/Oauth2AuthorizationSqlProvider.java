package com.example.authserver.mapper;

import com.example.authserver.model.Oauth2Authorization;
import com.example.authserver.model.Oauth2AuthorizationExample.Criteria;
import com.example.authserver.model.Oauth2AuthorizationExample.Criterion;
import com.example.authserver.model.Oauth2AuthorizationExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class Oauth2AuthorizationSqlProvider {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_authorization
     *
     * @mbg.generated Thu Aug 31 10:44:16 CST 2023
     */
    public String countByExample(Oauth2AuthorizationExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("oauth2_authorization");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_authorization
     *
     * @mbg.generated Thu Aug 31 10:44:16 CST 2023
     */
    public String deleteByExample(Oauth2AuthorizationExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("oauth2_authorization");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_authorization
     *
     * @mbg.generated Thu Aug 31 10:44:16 CST 2023
     */
    public String insertSelective(Oauth2Authorization row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("oauth2_authorization");
        
        if (row.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (row.getRegisteredClientId() != null) {
            sql.VALUES("registered_client_id", "#{registeredClientId,jdbcType=VARCHAR}");
        }
        
        if (row.getPrincipalName() != null) {
            sql.VALUES("principal_name", "#{principalName,jdbcType=VARCHAR}");
        }
        
        if (row.getAuthorizationGrantType() != null) {
            sql.VALUES("authorization_grant_type", "#{authorizationGrantType,jdbcType=VARCHAR}");
        }
        
        if (row.getAuthorizedScopes() != null) {
            sql.VALUES("authorized_scopes", "#{authorizedScopes,jdbcType=VARCHAR}");
        }
        
        if (row.getState() != null) {
            sql.VALUES("state", "#{state,jdbcType=VARCHAR}");
        }
        
        if (row.getAuthorizationCodeIssuedAt() != null) {
            sql.VALUES("authorization_code_issued_at", "#{authorizationCodeIssuedAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getAuthorizationCodeExpiresAt() != null) {
            sql.VALUES("authorization_code_expires_at", "#{authorizationCodeExpiresAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getAccessTokenIssuedAt() != null) {
            sql.VALUES("access_token_issued_at", "#{accessTokenIssuedAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getAccessTokenExpiresAt() != null) {
            sql.VALUES("access_token_expires_at", "#{accessTokenExpiresAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getAccessTokenType() != null) {
            sql.VALUES("access_token_type", "#{accessTokenType,jdbcType=VARCHAR}");
        }
        
        if (row.getAccessTokenScopes() != null) {
            sql.VALUES("access_token_scopes", "#{accessTokenScopes,jdbcType=VARCHAR}");
        }
        
        if (row.getOidcIdTokenIssuedAt() != null) {
            sql.VALUES("oidc_id_token_issued_at", "#{oidcIdTokenIssuedAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getOidcIdTokenExpiresAt() != null) {
            sql.VALUES("oidc_id_token_expires_at", "#{oidcIdTokenExpiresAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getRefreshTokenIssuedAt() != null) {
            sql.VALUES("refresh_token_issued_at", "#{refreshTokenIssuedAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getRefreshTokenExpiresAt() != null) {
            sql.VALUES("refresh_token_expires_at", "#{refreshTokenExpiresAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getUserCodeIssuedAt() != null) {
            sql.VALUES("user_code_issued_at", "#{userCodeIssuedAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getUserCodeExpiresAt() != null) {
            sql.VALUES("user_code_expires_at", "#{userCodeExpiresAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getDeviceCodeIssuedAt() != null) {
            sql.VALUES("device_code_issued_at", "#{deviceCodeIssuedAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getDeviceCodeExpiresAt() != null) {
            sql.VALUES("device_code_expires_at", "#{deviceCodeExpiresAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getAttributes() != null) {
            sql.VALUES("attributes", "#{attributes,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getAuthorizationCodeValue() != null) {
            sql.VALUES("authorization_code_value", "#{authorizationCodeValue,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getAuthorizationCodeMetadata() != null) {
            sql.VALUES("authorization_code_metadata", "#{authorizationCodeMetadata,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getAccessTokenValue() != null) {
            sql.VALUES("access_token_value", "#{accessTokenValue,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getAccessTokenMetadata() != null) {
            sql.VALUES("access_token_metadata", "#{accessTokenMetadata,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getOidcIdTokenValue() != null) {
            sql.VALUES("oidc_id_token_value", "#{oidcIdTokenValue,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getOidcIdTokenMetadata() != null) {
            sql.VALUES("oidc_id_token_metadata", "#{oidcIdTokenMetadata,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getRefreshTokenValue() != null) {
            sql.VALUES("refresh_token_value", "#{refreshTokenValue,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getRefreshTokenMetadata() != null) {
            sql.VALUES("refresh_token_metadata", "#{refreshTokenMetadata,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getUserCodeValue() != null) {
            sql.VALUES("user_code_value", "#{userCodeValue,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getUserCodeMetadata() != null) {
            sql.VALUES("user_code_metadata", "#{userCodeMetadata,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getDeviceCodeValue() != null) {
            sql.VALUES("device_code_value", "#{deviceCodeValue,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getDeviceCodeMetadata() != null) {
            sql.VALUES("device_code_metadata", "#{deviceCodeMetadata,jdbcType=LONGVARBINARY}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_authorization
     *
     * @mbg.generated Thu Aug 31 10:44:16 CST 2023
     */
    public String selectByExampleWithBLOBs(Oauth2AuthorizationExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("registered_client_id");
        sql.SELECT("principal_name");
        sql.SELECT("authorization_grant_type");
        sql.SELECT("authorized_scopes");
        sql.SELECT("state");
        sql.SELECT("authorization_code_issued_at");
        sql.SELECT("authorization_code_expires_at");
        sql.SELECT("access_token_issued_at");
        sql.SELECT("access_token_expires_at");
        sql.SELECT("access_token_type");
        sql.SELECT("access_token_scopes");
        sql.SELECT("oidc_id_token_issued_at");
        sql.SELECT("oidc_id_token_expires_at");
        sql.SELECT("refresh_token_issued_at");
        sql.SELECT("refresh_token_expires_at");
        sql.SELECT("user_code_issued_at");
        sql.SELECT("user_code_expires_at");
        sql.SELECT("device_code_issued_at");
        sql.SELECT("device_code_expires_at");
        sql.SELECT("attributes");
        sql.SELECT("authorization_code_value");
        sql.SELECT("authorization_code_metadata");
        sql.SELECT("access_token_value");
        sql.SELECT("access_token_metadata");
        sql.SELECT("oidc_id_token_value");
        sql.SELECT("oidc_id_token_metadata");
        sql.SELECT("refresh_token_value");
        sql.SELECT("refresh_token_metadata");
        sql.SELECT("user_code_value");
        sql.SELECT("user_code_metadata");
        sql.SELECT("device_code_value");
        sql.SELECT("device_code_metadata");
        sql.FROM("oauth2_authorization");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_authorization
     *
     * @mbg.generated Thu Aug 31 10:44:16 CST 2023
     */
    public String selectByExample(Oauth2AuthorizationExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("registered_client_id");
        sql.SELECT("principal_name");
        sql.SELECT("authorization_grant_type");
        sql.SELECT("authorized_scopes");
        sql.SELECT("state");
        sql.SELECT("authorization_code_issued_at");
        sql.SELECT("authorization_code_expires_at");
        sql.SELECT("access_token_issued_at");
        sql.SELECT("access_token_expires_at");
        sql.SELECT("access_token_type");
        sql.SELECT("access_token_scopes");
        sql.SELECT("oidc_id_token_issued_at");
        sql.SELECT("oidc_id_token_expires_at");
        sql.SELECT("refresh_token_issued_at");
        sql.SELECT("refresh_token_expires_at");
        sql.SELECT("user_code_issued_at");
        sql.SELECT("user_code_expires_at");
        sql.SELECT("device_code_issued_at");
        sql.SELECT("device_code_expires_at");
        sql.FROM("oauth2_authorization");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_authorization
     *
     * @mbg.generated Thu Aug 31 10:44:16 CST 2023
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Oauth2Authorization row = (Oauth2Authorization) parameter.get("row");
        Oauth2AuthorizationExample example = (Oauth2AuthorizationExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("oauth2_authorization");
        
        if (row.getId() != null) {
            sql.SET("id = #{row.id,jdbcType=VARCHAR}");
        }
        
        if (row.getRegisteredClientId() != null) {
            sql.SET("registered_client_id = #{row.registeredClientId,jdbcType=VARCHAR}");
        }
        
        if (row.getPrincipalName() != null) {
            sql.SET("principal_name = #{row.principalName,jdbcType=VARCHAR}");
        }
        
        if (row.getAuthorizationGrantType() != null) {
            sql.SET("authorization_grant_type = #{row.authorizationGrantType,jdbcType=VARCHAR}");
        }
        
        if (row.getAuthorizedScopes() != null) {
            sql.SET("authorized_scopes = #{row.authorizedScopes,jdbcType=VARCHAR}");
        }
        
        if (row.getState() != null) {
            sql.SET("state = #{row.state,jdbcType=VARCHAR}");
        }
        
        if (row.getAuthorizationCodeIssuedAt() != null) {
            sql.SET("authorization_code_issued_at = #{row.authorizationCodeIssuedAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getAuthorizationCodeExpiresAt() != null) {
            sql.SET("authorization_code_expires_at = #{row.authorizationCodeExpiresAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getAccessTokenIssuedAt() != null) {
            sql.SET("access_token_issued_at = #{row.accessTokenIssuedAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getAccessTokenExpiresAt() != null) {
            sql.SET("access_token_expires_at = #{row.accessTokenExpiresAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getAccessTokenType() != null) {
            sql.SET("access_token_type = #{row.accessTokenType,jdbcType=VARCHAR}");
        }
        
        if (row.getAccessTokenScopes() != null) {
            sql.SET("access_token_scopes = #{row.accessTokenScopes,jdbcType=VARCHAR}");
        }
        
        if (row.getOidcIdTokenIssuedAt() != null) {
            sql.SET("oidc_id_token_issued_at = #{row.oidcIdTokenIssuedAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getOidcIdTokenExpiresAt() != null) {
            sql.SET("oidc_id_token_expires_at = #{row.oidcIdTokenExpiresAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getRefreshTokenIssuedAt() != null) {
            sql.SET("refresh_token_issued_at = #{row.refreshTokenIssuedAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getRefreshTokenExpiresAt() != null) {
            sql.SET("refresh_token_expires_at = #{row.refreshTokenExpiresAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getUserCodeIssuedAt() != null) {
            sql.SET("user_code_issued_at = #{row.userCodeIssuedAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getUserCodeExpiresAt() != null) {
            sql.SET("user_code_expires_at = #{row.userCodeExpiresAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getDeviceCodeIssuedAt() != null) {
            sql.SET("device_code_issued_at = #{row.deviceCodeIssuedAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getDeviceCodeExpiresAt() != null) {
            sql.SET("device_code_expires_at = #{row.deviceCodeExpiresAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getAttributes() != null) {
            sql.SET("attributes = #{row.attributes,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getAuthorizationCodeValue() != null) {
            sql.SET("authorization_code_value = #{row.authorizationCodeValue,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getAuthorizationCodeMetadata() != null) {
            sql.SET("authorization_code_metadata = #{row.authorizationCodeMetadata,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getAccessTokenValue() != null) {
            sql.SET("access_token_value = #{row.accessTokenValue,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getAccessTokenMetadata() != null) {
            sql.SET("access_token_metadata = #{row.accessTokenMetadata,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getOidcIdTokenValue() != null) {
            sql.SET("oidc_id_token_value = #{row.oidcIdTokenValue,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getOidcIdTokenMetadata() != null) {
            sql.SET("oidc_id_token_metadata = #{row.oidcIdTokenMetadata,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getRefreshTokenValue() != null) {
            sql.SET("refresh_token_value = #{row.refreshTokenValue,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getRefreshTokenMetadata() != null) {
            sql.SET("refresh_token_metadata = #{row.refreshTokenMetadata,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getUserCodeValue() != null) {
            sql.SET("user_code_value = #{row.userCodeValue,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getUserCodeMetadata() != null) {
            sql.SET("user_code_metadata = #{row.userCodeMetadata,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getDeviceCodeValue() != null) {
            sql.SET("device_code_value = #{row.deviceCodeValue,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getDeviceCodeMetadata() != null) {
            sql.SET("device_code_metadata = #{row.deviceCodeMetadata,jdbcType=LONGVARBINARY}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_authorization
     *
     * @mbg.generated Thu Aug 31 10:44:16 CST 2023
     */
    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("oauth2_authorization");
        
        sql.SET("id = #{row.id,jdbcType=VARCHAR}");
        sql.SET("registered_client_id = #{row.registeredClientId,jdbcType=VARCHAR}");
        sql.SET("principal_name = #{row.principalName,jdbcType=VARCHAR}");
        sql.SET("authorization_grant_type = #{row.authorizationGrantType,jdbcType=VARCHAR}");
        sql.SET("authorized_scopes = #{row.authorizedScopes,jdbcType=VARCHAR}");
        sql.SET("state = #{row.state,jdbcType=VARCHAR}");
        sql.SET("authorization_code_issued_at = #{row.authorizationCodeIssuedAt,jdbcType=TIMESTAMP}");
        sql.SET("authorization_code_expires_at = #{row.authorizationCodeExpiresAt,jdbcType=TIMESTAMP}");
        sql.SET("access_token_issued_at = #{row.accessTokenIssuedAt,jdbcType=TIMESTAMP}");
        sql.SET("access_token_expires_at = #{row.accessTokenExpiresAt,jdbcType=TIMESTAMP}");
        sql.SET("access_token_type = #{row.accessTokenType,jdbcType=VARCHAR}");
        sql.SET("access_token_scopes = #{row.accessTokenScopes,jdbcType=VARCHAR}");
        sql.SET("oidc_id_token_issued_at = #{row.oidcIdTokenIssuedAt,jdbcType=TIMESTAMP}");
        sql.SET("oidc_id_token_expires_at = #{row.oidcIdTokenExpiresAt,jdbcType=TIMESTAMP}");
        sql.SET("refresh_token_issued_at = #{row.refreshTokenIssuedAt,jdbcType=TIMESTAMP}");
        sql.SET("refresh_token_expires_at = #{row.refreshTokenExpiresAt,jdbcType=TIMESTAMP}");
        sql.SET("user_code_issued_at = #{row.userCodeIssuedAt,jdbcType=TIMESTAMP}");
        sql.SET("user_code_expires_at = #{row.userCodeExpiresAt,jdbcType=TIMESTAMP}");
        sql.SET("device_code_issued_at = #{row.deviceCodeIssuedAt,jdbcType=TIMESTAMP}");
        sql.SET("device_code_expires_at = #{row.deviceCodeExpiresAt,jdbcType=TIMESTAMP}");
        sql.SET("attributes = #{row.attributes,jdbcType=LONGVARBINARY}");
        sql.SET("authorization_code_value = #{row.authorizationCodeValue,jdbcType=LONGVARBINARY}");
        sql.SET("authorization_code_metadata = #{row.authorizationCodeMetadata,jdbcType=LONGVARBINARY}");
        sql.SET("access_token_value = #{row.accessTokenValue,jdbcType=LONGVARBINARY}");
        sql.SET("access_token_metadata = #{row.accessTokenMetadata,jdbcType=LONGVARBINARY}");
        sql.SET("oidc_id_token_value = #{row.oidcIdTokenValue,jdbcType=LONGVARBINARY}");
        sql.SET("oidc_id_token_metadata = #{row.oidcIdTokenMetadata,jdbcType=LONGVARBINARY}");
        sql.SET("refresh_token_value = #{row.refreshTokenValue,jdbcType=LONGVARBINARY}");
        sql.SET("refresh_token_metadata = #{row.refreshTokenMetadata,jdbcType=LONGVARBINARY}");
        sql.SET("user_code_value = #{row.userCodeValue,jdbcType=LONGVARBINARY}");
        sql.SET("user_code_metadata = #{row.userCodeMetadata,jdbcType=LONGVARBINARY}");
        sql.SET("device_code_value = #{row.deviceCodeValue,jdbcType=LONGVARBINARY}");
        sql.SET("device_code_metadata = #{row.deviceCodeMetadata,jdbcType=LONGVARBINARY}");
        
        Oauth2AuthorizationExample example = (Oauth2AuthorizationExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_authorization
     *
     * @mbg.generated Thu Aug 31 10:44:16 CST 2023
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("oauth2_authorization");
        
        sql.SET("id = #{row.id,jdbcType=VARCHAR}");
        sql.SET("registered_client_id = #{row.registeredClientId,jdbcType=VARCHAR}");
        sql.SET("principal_name = #{row.principalName,jdbcType=VARCHAR}");
        sql.SET("authorization_grant_type = #{row.authorizationGrantType,jdbcType=VARCHAR}");
        sql.SET("authorized_scopes = #{row.authorizedScopes,jdbcType=VARCHAR}");
        sql.SET("state = #{row.state,jdbcType=VARCHAR}");
        sql.SET("authorization_code_issued_at = #{row.authorizationCodeIssuedAt,jdbcType=TIMESTAMP}");
        sql.SET("authorization_code_expires_at = #{row.authorizationCodeExpiresAt,jdbcType=TIMESTAMP}");
        sql.SET("access_token_issued_at = #{row.accessTokenIssuedAt,jdbcType=TIMESTAMP}");
        sql.SET("access_token_expires_at = #{row.accessTokenExpiresAt,jdbcType=TIMESTAMP}");
        sql.SET("access_token_type = #{row.accessTokenType,jdbcType=VARCHAR}");
        sql.SET("access_token_scopes = #{row.accessTokenScopes,jdbcType=VARCHAR}");
        sql.SET("oidc_id_token_issued_at = #{row.oidcIdTokenIssuedAt,jdbcType=TIMESTAMP}");
        sql.SET("oidc_id_token_expires_at = #{row.oidcIdTokenExpiresAt,jdbcType=TIMESTAMP}");
        sql.SET("refresh_token_issued_at = #{row.refreshTokenIssuedAt,jdbcType=TIMESTAMP}");
        sql.SET("refresh_token_expires_at = #{row.refreshTokenExpiresAt,jdbcType=TIMESTAMP}");
        sql.SET("user_code_issued_at = #{row.userCodeIssuedAt,jdbcType=TIMESTAMP}");
        sql.SET("user_code_expires_at = #{row.userCodeExpiresAt,jdbcType=TIMESTAMP}");
        sql.SET("device_code_issued_at = #{row.deviceCodeIssuedAt,jdbcType=TIMESTAMP}");
        sql.SET("device_code_expires_at = #{row.deviceCodeExpiresAt,jdbcType=TIMESTAMP}");
        
        Oauth2AuthorizationExample example = (Oauth2AuthorizationExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_authorization
     *
     * @mbg.generated Thu Aug 31 10:44:16 CST 2023
     */
    public String updateByPrimaryKeySelective(Oauth2Authorization row) {
        SQL sql = new SQL();
        sql.UPDATE("oauth2_authorization");
        
        if (row.getRegisteredClientId() != null) {
            sql.SET("registered_client_id = #{registeredClientId,jdbcType=VARCHAR}");
        }
        
        if (row.getPrincipalName() != null) {
            sql.SET("principal_name = #{principalName,jdbcType=VARCHAR}");
        }
        
        if (row.getAuthorizationGrantType() != null) {
            sql.SET("authorization_grant_type = #{authorizationGrantType,jdbcType=VARCHAR}");
        }
        
        if (row.getAuthorizedScopes() != null) {
            sql.SET("authorized_scopes = #{authorizedScopes,jdbcType=VARCHAR}");
        }
        
        if (row.getState() != null) {
            sql.SET("state = #{state,jdbcType=VARCHAR}");
        }
        
        if (row.getAuthorizationCodeIssuedAt() != null) {
            sql.SET("authorization_code_issued_at = #{authorizationCodeIssuedAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getAuthorizationCodeExpiresAt() != null) {
            sql.SET("authorization_code_expires_at = #{authorizationCodeExpiresAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getAccessTokenIssuedAt() != null) {
            sql.SET("access_token_issued_at = #{accessTokenIssuedAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getAccessTokenExpiresAt() != null) {
            sql.SET("access_token_expires_at = #{accessTokenExpiresAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getAccessTokenType() != null) {
            sql.SET("access_token_type = #{accessTokenType,jdbcType=VARCHAR}");
        }
        
        if (row.getAccessTokenScopes() != null) {
            sql.SET("access_token_scopes = #{accessTokenScopes,jdbcType=VARCHAR}");
        }
        
        if (row.getOidcIdTokenIssuedAt() != null) {
            sql.SET("oidc_id_token_issued_at = #{oidcIdTokenIssuedAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getOidcIdTokenExpiresAt() != null) {
            sql.SET("oidc_id_token_expires_at = #{oidcIdTokenExpiresAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getRefreshTokenIssuedAt() != null) {
            sql.SET("refresh_token_issued_at = #{refreshTokenIssuedAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getRefreshTokenExpiresAt() != null) {
            sql.SET("refresh_token_expires_at = #{refreshTokenExpiresAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getUserCodeIssuedAt() != null) {
            sql.SET("user_code_issued_at = #{userCodeIssuedAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getUserCodeExpiresAt() != null) {
            sql.SET("user_code_expires_at = #{userCodeExpiresAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getDeviceCodeIssuedAt() != null) {
            sql.SET("device_code_issued_at = #{deviceCodeIssuedAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getDeviceCodeExpiresAt() != null) {
            sql.SET("device_code_expires_at = #{deviceCodeExpiresAt,jdbcType=TIMESTAMP}");
        }
        
        if (row.getAttributes() != null) {
            sql.SET("attributes = #{attributes,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getAuthorizationCodeValue() != null) {
            sql.SET("authorization_code_value = #{authorizationCodeValue,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getAuthorizationCodeMetadata() != null) {
            sql.SET("authorization_code_metadata = #{authorizationCodeMetadata,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getAccessTokenValue() != null) {
            sql.SET("access_token_value = #{accessTokenValue,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getAccessTokenMetadata() != null) {
            sql.SET("access_token_metadata = #{accessTokenMetadata,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getOidcIdTokenValue() != null) {
            sql.SET("oidc_id_token_value = #{oidcIdTokenValue,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getOidcIdTokenMetadata() != null) {
            sql.SET("oidc_id_token_metadata = #{oidcIdTokenMetadata,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getRefreshTokenValue() != null) {
            sql.SET("refresh_token_value = #{refreshTokenValue,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getRefreshTokenMetadata() != null) {
            sql.SET("refresh_token_metadata = #{refreshTokenMetadata,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getUserCodeValue() != null) {
            sql.SET("user_code_value = #{userCodeValue,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getUserCodeMetadata() != null) {
            sql.SET("user_code_metadata = #{userCodeMetadata,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getDeviceCodeValue() != null) {
            sql.SET("device_code_value = #{deviceCodeValue,jdbcType=LONGVARBINARY}");
        }
        
        if (row.getDeviceCodeMetadata() != null) {
            sql.SET("device_code_metadata = #{deviceCodeMetadata,jdbcType=LONGVARBINARY}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth2_authorization
     *
     * @mbg.generated Thu Aug 31 10:44:16 CST 2023
     */
    protected void applyWhere(SQL sql, Oauth2AuthorizationExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}