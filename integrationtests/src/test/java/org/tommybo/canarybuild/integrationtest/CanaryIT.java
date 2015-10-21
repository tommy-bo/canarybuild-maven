package org.tommybo.canarybuild.integrationtest;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CanaryIT {
	@Test
	public void integrationtests_running() {
		assertThat(true).isTrue();
	}
}
