package org.demo.auth;

import com.sun.istack.internal.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by amritagarwal on 23/07/17.
 */

@RestController
@RequestMapping("/v1/")
public class TokenController {

    @RequestMapping(value = "tokens", method = RequestMethod.PATCH)
    public ResponseEntity<TokenDTO> create(@RequestBody @NotNull UserCredentialsDTO userCredentialsDTO) {
        return new ResponseEntity<TokenDTO>(new TokenDTO(userCredentialsDTO.getUsername()+userCredentialsDTO.getPassword()), HttpStatus.OK);
    }
}
