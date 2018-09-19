package org.nhindirect.common.tx.impl.feign.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.codec.ErrorDecoder;

@Configuration
public class DefaultFeignClientConfiguration
{
	@Bean
	public ErrorDecoder feignClientErrorDecoder()
	{
		return new DefaultErrorDecoder();
	}
}
