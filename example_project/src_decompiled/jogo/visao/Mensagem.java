/*    */ package jogo.visao;
/*    */ 
/*    */ import java.awt.Component;
/*    */ import javax.swing.JOptionPane;
/*    */ import jogo.entidade.Animal;
/*    */ 
/*    */ public class Mensagem
/*    */ {
/*    */   public int inicio() {
/* 10 */     return JOptionPane.showConfirmDialog(null, "Pense em um animal.", "Jogo dos animais", 2);
/*    */   }
/*    */   
/*    */   public int pergunta(Animal a) {
/* 14 */     return JOptionPane.showConfirmDialog(null, "O animal que você pensou " + a.getCaracteristica() + "?", "Informe", 0);
/*    */   }
/*    */   
/*    */   public int perguntaSeEh(Animal a, int simOuNao) {
/* 18 */     if (simOuNao == 0) {
/* 19 */       return JOptionPane.showConfirmDialog(null, "O animal que você pensou é " + a.getRespostaSim() + "?", "Informe", 0);
/*    */     }
/* 21 */     return JOptionPane.showConfirmDialog(null, "O animal que você pensou é " + a.getRespostaNao() + "?", "Informe", 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public String entrada(Animal a, String mensagem) {
/*    */     while (true) {
/* 27 */       String valor = JOptionPane.showInputDialog((Component)null, mensagem);
/* 28 */       if (valor == null)
/* 29 */         mostraMensagem("INFORME ALGUM VALOR!"); 
/* 30 */       if (valor != null)
/* 31 */         return valor; 
/*    */     } 
/*    */   }
/*    */   public void mostraMensagem(String mensagem) {
/* 35 */     JOptionPane.showMessageDialog(null, mensagem);
/*    */   }
/*    */ }


/* Location:              /home/tmk/Desktop/jogo_animais.jar!/jogo/visao/Mensagem.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */