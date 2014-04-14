/**
 * 
 */
package com.dmuruli.wodemo.web.view;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * @author dmuruli
 *
 */
public class JsonViewResolver implements ViewResolver {
	private static final Logger logger = Logger.getLogger(ViewResolver.class);
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.ViewResolver#resolveViewName(java.lang.String, java.util.Locale)
	 */
	@Override
	public View resolveViewName(String viewName, Locale locale) throws Exception {
		logger.info("Creating json for view name: " + viewName);
		MappingJackson2JsonView view = new MappingJackson2JsonView();
        view.setPrettyPrint(true);
		return view;
	}

}
