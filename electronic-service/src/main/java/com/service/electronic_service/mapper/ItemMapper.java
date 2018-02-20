package com.service.electronic_service.mapper;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@Component
public class ItemMapper extends ObjectMapper{
	
	 public ItemMapper() {
		  FilterProvider filters = new SimpleFilterProvider()
		    .addFilter("itemFilter", SimpleBeanPropertyFilter.filterOutAllExcept("status","description","serialNumber","category","parameters","idItem"))
		    .addFilter("categoryFilter",  SimpleBeanPropertyFilter.filterOutAllExcept("type"))
		  	.addFilter ("parameterFilter", SimpleBeanPropertyFilter.filterOutAllExcept("descriptionParameter","value"));
		    
		  this.setFilterProvider(filters);

}
}
