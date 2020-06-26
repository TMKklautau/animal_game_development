/*    */ package jogo.negocio;
/*    */ 
/*    */ import jogo.dao.AnimalDAOImpl;
/*    */ import jogo.entidade.Animal;
/*    */ import jogo.visao.Mensagem;
/*    */ 
/*    */ 
/*    */ public class Logica
/*    */ {
/*    */   public void inicia() {
/*    */     int respostaInicio;
/* 12 */     Mensagem mensagem = new Mensagem();
/* 13 */     Funcoes funcoes = new Funcoes();
/* 14 */     AnimalDAOImpl dao = new AnimalDAOImpl();
/*    */ 
/*    */ 
/*    */     
/* 18 */     boolean controle = false;
/* 19 */     int flag = 0;
/*    */     do {
/* 21 */       respostaInicio = mensagem.inicio();
/* 22 */       if (respostaInicio != 0)
/*    */         continue;  while (true) {
/* 24 */         Animal animal = dao.getAnimais().get(flag);
/* 25 */         int respostaPergunta = mensagem.pergunta(animal);
/* 26 */         Animal filho = funcoes.retornaFilho(dao.getAnimais(), dao.getAnimais().get(flag), respostaPergunta);
/* 27 */         if (filho == null) {
/* 28 */           int respostaEhAnimal = mensagem.perguntaSeEh(animal, respostaPergunta);
/* 29 */           if (respostaEhAnimal == 0) {
/* 30 */             mensagem.mostraMensagem("Eu venci!!!");
/* 31 */             controle = true;
/*    */           } else {
/* 33 */             dao.salvar(funcoes.cadastraNovo(funcoes.retornaMaiorId(dao.getAnimais()), animal, respostaPergunta, flag));
/* 34 */             controle = true;
/*    */           } 
/*    */         } else {
/* 37 */           flag = dao.getAnimais().indexOf(filho);
/*    */         } 
/* 39 */         if (controle)
/* 40 */         { flag = 0;
/* 41 */           controle = false; break; } 
/*    */       } 
/* 43 */     } while (respostaInicio == 0);
/*    */   }
/*    */ }


/* Location:              /home/tmk/Desktop/jogo_animais.jar!/jogo/negocio/Logica.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */