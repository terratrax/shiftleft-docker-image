package org.springframework.jmx.export.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.jmx.support.MetricType;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ManagedMetric {
  String category() default "";
  
  int currencyTimeLimit() default -1;
  
  String description() default "";
  
  String displayName() default "";
  
  MetricType metricType() default MetricType.GAUGE;
  
  int persistPeriod() default -1;
  
  String persistPolicy() default "";
  
  String unit() default "";
}


/* Location:              C:\Users\nateb\Desktop\shiftleft-docker-image-1.2.0.jar!\org\springframework\jmx\export\annotation\ManagedMetric.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */