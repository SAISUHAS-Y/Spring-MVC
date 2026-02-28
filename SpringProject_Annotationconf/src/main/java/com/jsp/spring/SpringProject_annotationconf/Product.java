package com.jsp.spring.SpringProject_annotationconf;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//the scope can also be used inside the spring.scl
//@Scope("singleton"   while using the singleton stereotype the address of each different object will be same
@Scope("prototype")// while using the prototype stereotype the address of each different object  will be different

public class Product {

}
