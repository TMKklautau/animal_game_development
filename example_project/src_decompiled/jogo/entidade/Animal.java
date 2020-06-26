/*    */ package jogo.entidade;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Animal
/*    */ {
/*    */   private Integer id;
/*    */   private String caracteristica;
/*    */   private String respostaSim;
/*    */   private String respostaNao;
/*    */   private Integer idPai;
/*    */   private Integer filhoDaResposta;
/*    */   
/*    */   public Integer getId() {
/* 16 */     return this.id;
/*    */   }
/*    */   public void setId(Integer id) {
/* 19 */     this.id = id;
/*    */   }
/*    */   
/*    */   public String getCaracteristica() {
/* 23 */     return this.caracteristica;
/*    */   }
/*    */   
/*    */   public void setCaracteristica(String caracteristica) {
/* 27 */     this.caracteristica = caracteristica;
/*    */   }
/*    */   
/*    */   public Integer getIdPai() {
/* 31 */     return this.idPai;
/*    */   }
/*    */   public void setidPai(Integer idPai) {
/* 34 */     this.idPai = idPai;
/*    */   }
/*    */   
/*    */   public String getRespostaSim() {
/* 38 */     return this.respostaSim;
/*    */   }
/*    */   
/*    */   public void setRespostaSim(String respostaSim) {
/* 42 */     this.respostaSim = respostaSim;
/*    */   }
/*    */   
/*    */   public String getRespostaNao() {
/* 46 */     return this.respostaNao;
/*    */   }
/*    */   
/*    */   public void setRespostaNao(String respostaNao) {
/* 50 */     this.respostaNao = respostaNao;
/*    */   }
/*    */   
/*    */   public Integer getFilhoDaResposta() {
/* 54 */     return this.filhoDaResposta;
/*    */   }
/*    */   
/*    */   public void setFilhoDaResposta(Integer filhoDaResposta) {
/* 58 */     this.filhoDaResposta = filhoDaResposta;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 63 */     return "Animal [id=" + this.id + ", caracteristica=" + this.caracteristica + 
/* 64 */       ", respostaSim=" + this.respostaSim + ", respostaNao=" + 
/* 65 */       this.respostaNao + ", idPai=" + this.idPai + ", filhoDaResposta=" + 
/* 66 */       this.filhoDaResposta + "]";
/*    */   }
/*    */ }


/* Location:              /home/tmk/Desktop/jogo_animais.jar!/jogo/entidade/Animal.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */