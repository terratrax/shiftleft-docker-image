package org.springframework.objenesis;

import org.springframework.objenesis.instantiator.ObjectInstantiator;

public interface Objenesis {
  <T> T newInstance(Class<T> paramClass);
  
  <T> ObjectInstantiator<T> getInstantiatorOf(Class<T> paramClass);
}


/* Location:              C:\Users\nateb\Desktop\shiftleft-docker-image-1.2.0.jar!\org\springframework\objenesis\Objenesis.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */