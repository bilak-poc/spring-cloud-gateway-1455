package com.github.bilakpoc.springcloudgateway1455;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for Swagger-ui OpenApi.
 *
 * @author Lukáš Vasek
 */
@Controller
public class SwaggerUiOpenApiController {

    private static final Logger logger = LoggerFactory.getLogger(SwaggerUiOpenApiController.class);

    @Value("${server.servlet.context-path:/}")
    private String contextPath;

    @GetMapping("/api-doc")
    public String getApiDoc() {
        return String.format("redirect:/webjars/swagger-ui/index.html", contextPath.endsWith("/") ? contextPath : contextPath.concat("/"));
    }
}
