package com.service.electronic_service.testDeserialization;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import com.service.electronic_service.model.Category;
import com.service.electronic_service.model.Item;
import com.service.electronic_service.model.Parameter;
import static org.junit.Assert.assertTrue;


import ch.qos.logback.core.net.server.Client;

public class JsonDeserialisationTest
{

    MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();

    @Test
    public void allClassesUsedByOurControllersShouldBeDeserialisableByJackson() throws Exception
    {
        assertCanBeMapped(Item.class);
        assertCanBeMapped(Parameter.class);
        assertCanBeMapped(Category.class);
	
    	
    }

    private void assertCanBeMapped(Class<?> classToTest)
    {
    	 String message =
    	            String.format("%s is not deserialisable, check the swallowed exception in StdDeserializerProvider.hasValueDeserializerFor",
    	            classToTest.getSimpleName());
            
            
        assertTrue (message, converter.canRead(classToTest, MediaType.APPLICATION_JSON));
    }

}