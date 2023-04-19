package org.springframework.web.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.core.annotation.AliasFor;

@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestAttribute {
  @AliasFor("name")
  String value() default "";
  
  @AliasFor("value")
  String name() default "";
  
  boolean required() default true;
}


/* Location:              C:\Users\nateb\Desktop\shiftleft-docker-image-1.2.0.jar!\org\springframework\web\bind\annotation\RequestAttribute.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */