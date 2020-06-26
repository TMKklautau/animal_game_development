/*    */ package jogo.negocio;
/*    */ 
/*    */ import java.util.List;
/*    */ import jogo.entidade.Animal;
/*    */ import jogo.visao.Mensagem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Funcoes
/*    */ {
/*    */   public Animal retornaFilho(List<Animal> animais, Animal a, int respostaPergunta) {
/* 13 */     for (Animal animal : animais) {
/* 14 */       if (animal.getIdPai() == a.getId() && animal.getFilhoDaResposta().intValue() == respostaPergunta)
/* 15 */         return animal; 
/*    */     } 
/* 17 */     return null;
/*    */   }
/*    */   
/*    */   public int retornaMaiorId(List<Animal> animais) {
/* 21 */     return animais.size() + 1;
/*    */   }
/*    */   
/*    */   public Animal cadastraNovo(int id, Animal animal, int respostaPergunta, int flag) {
/* 25 */     Mensagem mensagem = new Mensagem();
/* 26 */     Animal novoAnimal = new Animal();
/*    */     
/* 28 */     novoAnimal.setId(Integer.valueOf(id));
/* 29 */     novoAnimal.setRespostaSim(mensagem.entrada(animal, "Qual animal você pensou?"));
/* 30 */     novoAnimal.setidPai(animal.getId());
/* 31 */     novoAnimal.setFilhoDaResposta(Integer.valueOf(respostaPergunta));
/* 32 */     if (respostaPergunta == 0) {
/* 33 */       novoAnimal.setRespostaNao(animal.getRespostaSim());
/* 34 */       novoAnimal.setCaracteristica(mensagem.entrada(animal, "Um(a) " + novoAnimal.getRespostaSim() + " ________ mas um(a) " + animal.getRespostaSim() + " não."));
/*    */     } else {
/* 36 */       novoAnimal.setRespostaNao(animal.getRespostaNao());
/* 37 */       novoAnimal.setCaracteristica(mensagem.entrada(animal, "Um(a) " + novoAnimal.getRespostaSim() + " ________ mas um(a) " + animal.getRespostaNao() + " não."));
/*    */     } 
/*    */     
/* 40 */     return novoAnimal;
/*    */   }
/*    */ }


/* Location:              /home/tmk/Desktop/jogo_animais.jar!/jogo/negocio/Funcoes.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */