package com.manoj.springsecurity;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

@SpringBootTest
class SpringSecurityApplicationTests {

	@Test
	void testEncode() {
		
		System.out.println(new BCryptPasswordEncoder().encode("123"));
		System.out.println(new Pbkdf2PasswordEncoder().encode("123"));
		System.out.println(new SCryptPasswordEncoder().encode("123"));
		
		Map<String, PasswordEncoder> encoder = new HashMap();
		encoder.put("bcrypt", new BCryptPasswordEncoder());
		encoder.put("scrypt", new SCryptPasswordEncoder());
		 
		new DelegatingPasswordEncoder("bcrypt", encoder).encode("123");

	}

}
