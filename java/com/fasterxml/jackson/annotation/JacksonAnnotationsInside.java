package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotation
public @interface JacksonAnnotationsInside {}


/* Location:              C:\Users\nateb\Desktop\shiftleft-docker-image-1.2.0.jar!\com\fasterxml\jackson\annotation\JacksonAnnotationsInside.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */