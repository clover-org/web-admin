package org.clover.admin.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

import static java.lang.String.format;

@ConfigurationProperties(prefix = "web-security")
public class WebSecurityProperties {

    private String pathPrefix;

    private String loginProcessingUrl;

    private String loginPage;
    private String logoutPage;

    private RememberMe rememberMe;

    private String usernameParameter;
    private String passwordParameter;

    private String sessionCookie;

    public String getPathPrefix() {
        return pathPrefix;
    }

    public void setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
    }

    public String getLoginProcessingUrl() {
        return loginProcessingUrl;
    }

    public void setLoginProcessingUrl(String loginProcessingUrl) {
        this.loginProcessingUrl = loginProcessingUrl;
    }

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }

    public String getLogoutPage() {
        return logoutPage;
    }

    public void setLogoutPage(String logoutPage) {
        this.logoutPage = logoutPage;
    }

    public String getUsernameParameter() {
        return usernameParameter;
    }

    public void setUsernameParameter(String usernameParameter) {
        this.usernameParameter = usernameParameter;
    }

    public String getPasswordParameter() {
        return passwordParameter;
    }

    public void setPasswordParameter(String passwordParameter) {
        this.passwordParameter = passwordParameter;
    }

    public RememberMe getRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(RememberMe rememberMe) {
        this.rememberMe = rememberMe;
    }

    public String getSessionCookie() {
        return sessionCookie;
    }

    public void setSessionCookie(String sessionCookie) {
        this.sessionCookie = sessionCookie;
    }

    public static class RememberMe {

        private String cookieName;
        private String parameterName;
        private String secretKey;
        private int    validitySeconds;

        public String getCookieName() {
            return cookieName;
        }

        public void setCookieName(String cookieName) {
            this.cookieName = cookieName;
        }

        public String getParameterName() {
            return parameterName;
        }

        public void setParameterName(String parameterName) {
            this.parameterName = parameterName;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }

        public int getValiditySeconds() {
            return validitySeconds;
        }

        public void setValiditySeconds(int validitySeconds) {
            this.validitySeconds = validitySeconds;
        }

        @Override
        public String toString() {
            return format("RememberMe{cookieName='%s', parameterName='%s', secretKey='%s', validitySeconds=%d}",
                    cookieName, parameterName, secretKey, validitySeconds);
        }
    }

    @Override
    public String toString() {
        return format("WebSecurityProperty{pathPrefix='%s', loginProcessingUrl='%s', loginPage='%s', logoutPage='%s', rememberMe=%s, usernameParameter='%s', passwordParameter='%s', sessionCookie='%s'}",
                pathPrefix, loginProcessingUrl, loginPage, logoutPage, rememberMe, usernameParameter, passwordParameter, sessionCookie);
    }

}
