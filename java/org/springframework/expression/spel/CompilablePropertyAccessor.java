package org.springframework.expression.spel;

import org.springframework.asm.MethodVisitor;
import org.springframework.asm.Opcodes;
import org.springframework.expression.PropertyAccessor;

public interface CompilablePropertyAccessor extends PropertyAccessor, Opcodes {
  boolean isCompilable();
  
  Class<?> getPropertyType();
  
  void generateCode(String paramString, MethodVisitor paramMethodVisitor, CodeFlow paramCodeFlow);
}


/* Location:              C:\Users\nateb\Desktop\shiftleft-docker-image-1.2.0.jar!\org\springframework\expression\spel\CompilablePropertyAccessor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */