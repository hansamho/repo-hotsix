package com.hotsix.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.hotsix.common.constants.Constants;
import com.hotsix.common.interceptor.CheckLoginSessionInterceptor;



@Configuration
public class WebMvcConfigurerImpl implements WebMvcConfigurer {
	
	 @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler(Constants.UPLOADED_RESSOURCE_HANDLER)
	                .addResourceLocations(Constants.UPLOADED_RESSOURCE_LOCATIONS);
	        
	    }
	    
		@Override
		public void addInterceptors(InterceptorRegistry registry) {
			
			registry.addInterceptor(new CheckLoginSessionInterceptor()) //LoginCheckInterceptor 등록
//					.order(2)
					.addPathPatterns("/**")
					.excludePathPatterns(
//							"/resources/**",
							"/adm/**",
							"/admlogin",
							"/signinAdm",
							"/signoutAdm"
//							
							
//							"/usr/infra/index/register",
//							"/usr/infra/index/usrindex"
//							"/usr/infra/index/mypage"
//							"/v1/infra/member/signoutXdmProc"
//							"/v1/infra/index/indexXdmView"
//							"/members/add", 
//							"/login", 
//							"/logout", 
					)
			;
		}
		
	}

