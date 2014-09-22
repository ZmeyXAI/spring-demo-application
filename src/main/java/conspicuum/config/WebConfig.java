package conspicuum.config;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.*;

/*@Configuration — собственно эта аннотация и говорит о том, что данный класс является Java Configuration;
@EnableWebMvc — эта аннотация разрешает нашему проекту использовать MVC;
@ComponentScan — аналогично тому component-scan который был в mvc-dispatcher-servlet.xml, говорит, где искать компоненты проекта.
Bean — указывает на то что это инициализация бина, и он будет создан с помощью DI.*/

@Configuration
@EnableWebMvc
@ComponentScan("conspicuum.controllers")
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/WEB-INF/pages/**").addResourceLocations("/pages/");
    }

    @Bean
    public InternalResourceViewResolver setupViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/pages/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);

        return resolver;
    }

}
