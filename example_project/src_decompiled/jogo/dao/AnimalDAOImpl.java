/*    */ package jogo.dao;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import jogo.entidade.Animal;
/*    */ 
/*    */ public class AnimalDAOImpl
/*    */   implements AnimalDAO
/*    */ {
/* 10 */   private List<Animal> animais = new ArrayList<Animal>();
/*    */ 
/*    */   
/*    */   public AnimalDAOImpl() {
/* 14 */     Animal a1 = new Animal();
/* 15 */     a1.setId(Integer.valueOf(1));
/* 16 */     a1.setCaracteristica("vive na água");
/* 17 */     a1.setRespostaSim("Tubarão");
/* 18 */     a1.setRespostaNao("Macaco");
/* 19 */     a1.setFilhoDaResposta(Integer.valueOf(0));
/* 20 */     this.animais.add(a1);
/*    */   }
/*    */   
/*    */   public void salvar(Animal a) {
/* 24 */     this.animais.add(a);
/*    */   }
/*    */   
/*    */   public List<Animal> getAnimais() {
/* 28 */     return this.animais;
/*    */   }
/*    */   public void setAnimais(List<Animal> animais) {
/* 31 */     this.animais = animais;
/*    */   }
/*    */ }


/* Location:              /home/tmk/Desktop/jogo_animais.jar!/jogo/dao/AnimalDAOImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */