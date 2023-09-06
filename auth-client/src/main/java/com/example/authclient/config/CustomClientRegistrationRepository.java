package com.example.authclient.config;

import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;

public class CustomClientRegistrationRepository implements ClientRegistrationRepository {
    @Override
    public ClientRegistration findByRegistrationId(String registrationId) {
        return getClientRegistrationBuilder(registrationId).build();
    }
    private static ClientRegistration.Builder getClientRegistrationBuilder(String registrationId) {
        // 根据 registrationId 返回相应的 ClientRegistration.Builder
        // 这里可以自定义实现来根据不同的 registrationId 返回不同的 ClientRegistration.Builder

        return ClientRegistration.withRegistrationId(registrationId)
                .clientName("oidc-client")
                .clientId("oidc-client")
                .clientSecret("{noop}secret")
                .clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
                .redirectUri("http://127.0.0.1:9003");
//                .scope("Your Scope")
//                .authorizationUri("Your Authorization URI")
//                .tokenUri("Your Token URI")
//                .userInfoUri("Your User Info URI")
//                .userNameAttributeName("Your User Name Attribute Name")
//                .jwkSetUri("Your JWK Set URI");
    }
}
