/*    */ package org.springframework.expression;
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
/*    */ public class EvaluationException
/*    */   extends ExpressionException
/*    */ {
/*    */   public EvaluationException(String message) {
/* 33 */     super(message);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public EvaluationException(String message, Throwable cause) {
/* 42 */     super(message, cause);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public EvaluationException(int position, String message) {
/* 51 */     super(position, message);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public EvaluationException(String expressionString, String message) {
/* 60 */     super(expressionString, message);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public EvaluationException(int position, String message, Throwable cause) {
/* 70 */     super(position, message, cause);
/*    */   }
/*    */ }


/* Location:              C:\Users\nateb\Desktop\shiftleft-docker-image-1.2.0.jar!\org\springframework\expression\EvaluationException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */