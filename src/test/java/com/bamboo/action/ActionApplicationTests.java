package com.bamboo.action;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ActionApplicationTests {

	@Autowired
	HelloController helloController;

	@Test
	@DisplayName("Get Hello")
	void helloTest() {
		Assertions.assertThat(helloController.hello()).isEqualTo("hello");
	}

	@Test
	@DisplayName("Get World")
	void worldTest() {
		Assertions.assertThat(helloController.hello()).isEqualTo("hello");
	}

}
