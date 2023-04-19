/*    */ package org.springframework.core.convert.support;
/*    */ 
/*    */ import org.springframework.core.convert.converter.Converter;
/*    */ import org.springframework.core.convert.converter.ConverterFactory;
/*    */ import org.springframework.util.NumberUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class CharacterToNumberFactory
/*    */   implements ConverterFactory<Character, Number>
/*    */ {
/*    */   public <T extends Number> Converter<Character, T> getConverter(Class<T> targetType) {
/* 45 */     return new CharacterToNumber<T>(targetType);
/*    */   }
/*    */   
/*    */   private static final class CharacterToNumber<T extends Number>
/*    */     implements Converter<Character, T> {
/*    */     private final Class<T> targetType;
/*    */     
/*    */     public CharacterToNumber(Class<T> targetType) {
/* 53 */       this.targetType = targetType;
/*    */     }
/*    */ 
/*    */     
/*    */     public T convert(Character source) {
/* 58 */       return (T)NumberUtils.convertNumberToTargetClass(Short.valueOf((short)source.charValue()), this.targetType);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\nateb\Desktop\shiftleft-docker-image-1.2.0.jar!\org\springframework\core\convert\support\CharacterToNumberFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */