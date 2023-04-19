package lombok.experimental;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface NonFinal {}


/* Location:              C:\Users\nateb\Desktop\shiftleft-docker-image-1.2.0.jar!\lombok\experimental\NonFinal.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */