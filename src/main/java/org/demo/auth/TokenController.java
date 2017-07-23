package org.demo.auth;

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

	@RequestMapping(value = "tokens", method = RequestMethod.POST)
	public ResponseEntity<TokenDTO> create(@RequestBody UserCredentialsDTO userCredentialsDTO) {
		return new ResponseEntity<TokenDTO>(
				new TokenDTO(userCredentialsDTO.getUsername() + userCredentialsDTO.getPassword()), HttpStatus.OK);
	}
}
