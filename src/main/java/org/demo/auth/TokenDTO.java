package org.demo.auth;

/**
 * Created by amritagarwal on 23/07/17.
 */
public class TokenDTO {
    private String Token;


    public TokenDTO(String token) {
        Token = token;
    }

    public String getToken() {

        return Token;
    }


    public void setToken(String token) {
        Token = token;
    }
}

