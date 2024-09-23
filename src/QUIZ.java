import java.util.Scanner;

//QUIZ
public class QUIZ {

    // CABEÇALHO
    public static void cabecalho() {
        System.out.println("Centro Universitário Alfredo Nasser");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Aluno: Rafael Rabelo");
        System.out.println("Algoritmos e Programação II");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("O Quiz abaixo contém 15 perguntas sobre games.");
        System.out.println("            Boa sorte nerdola.");
        System.out.println("-------//-------//-------//-------//-------");
    }

    //NOME E CONTADOR
    public static void main(String[] args) {
        long clockstart = System.currentTimeMillis();
        int contador = 0;
        cabecalho();
        String name;
        Scanner n = new Scanner(System.in);
        System.out.println("Como posso te chamar? ");
        System.out.println("");
        name = n.nextLine();


        //QUESTÕES 1-15
        System.out.println("");
        System.out.println("Seguinte " +name+" uma dica, não é a letra E.");
        QUESTIONS qst1 = new QUESTIONS();
        qst1.questions = "1 - Em God of War (2005), qual deus Kratos deve derrotar no final do jogo?";
        qst1.A = "A) Zeus";
        qst1.B = "B) Poseidon ";
        qst1.C = "C) Hades ";
        qst1.D = "D) Ares ";
        qst1.E = "E) Hermes ";
        qst1.correta = "D";

        QUESTIONS qst2 = new QUESTIONS();
        qst2.questions = "2 - Em Guitar Hero III: Legends of Rock, qual é o nome do último chefe que o jogador deve enfrentar?";
        qst2.A = "A) Slash ";
        qst2.B = "B) Lou ";
        qst2.C = "C) Tom Morello ";
        qst2.D = "D) Lars Ümlaüt ";
        qst2.E = "E) Johnny Napalm ";
        qst2.correta = "B";

        QUESTIONS qst3 = new QUESTIONS();
        qst3.questions = "Qual é o nome do protagonista em Red Dead Redemption 2?";
        qst3.A = "A) John Marston ";
        qst3.B = "B) Arthur Morgan ";
        qst3.C = "C) Dutch van der Linde ";
        qst3.D = "D) Bill Williamson ";
        qst3.E = "E) Javier Escuella ";
        qst3.correta = "B";

        QUESTIONS qst4 = new QUESTIONS();
        qst4.questions = "4 - No início de GTA IV, qual é o motivo principal de Niko Bellic para ir a Liberty City? ";
        qst4.A = "A) Trabalhar para a máfia.";
        qst4.B = "B) Fugir de dívidas.";
        qst4.C = "C) Encontrar um antigo inimigo.";
        qst4.D = "D) Visitar a família.";
        qst4.E = "E) Recomeçar uma vida longe de seu passado militar.";
        qst4.correta = "E";

        QUESTIONS qst5 = new QUESTIONS();
        qst5.questions = "Em GTA V, quantos personagens jogáveis existem durante a campanha principal? ";
        qst5.A = "A) 1 ";
        qst5.B = "B) 2 ";
        qst5.C = "C) 3 ";
        qst5.D = "D) 4 ";
        qst5.E = "E) 5 ";
        qst5.correta = "C";

        QUESTIONS qst6 = new QUESTIONS();
        qst6.questions = "6 - Em Red Dead Redemption (2010), qual é o destino de John Marston no final da história principal? ";
        qst6.A = "A) Ele foge para o México.";
        qst6.B = "B) Ele se torna líder da gangue de Dutch. ";
        qst6.C = "C) Ele é morto por agentes federais.  ";
        qst6.D = "D) Ele escapa e vive com sua família. ";
        qst6.E = "E) Ele é preso e condenado à morte. ";
        qst6.correta = "C";

        QUESTIONS qst7 = new QUESTIONS();
        qst7.questions = "7 - Em Minecraft, qual é o nome do bioma onde o Ender Dragon vive?";
        qst7.A = "A) Nether";
        qst7.B = "B) Overworld";
        qst7.C = "C) The End";
        qst7.D = "D) Desert";
        qst7.E = "E) Forest";
        qst7.correta = "C";

        QUESTIONS qst8 = new QUESTIONS();
        qst8.questions = "8 - Qual é o nome do parceiro de Sonic, o ouriço, que pode voar usando suas caudas?";
        qst8.A = "A) Knuckles";
        qst8.B = "B) Amy ";
        qst8.C = "C) Shadow";
        qst8.D = "D) Tails";
        qst8.E = "E) Silver";
        qst8.correta = "D";

        QUESTIONS qst9 = new QUESTIONS();
        qst9.questions = "9 - Qual o nome do irmão de Mario?";
        qst9.A = "A) King Boo ";
        qst9.B = "B) Bowser ";
        qst9.C = "C) Goomba King";
        qst9.D = "D) Wario";
        qst9.E = "E) Luigi";
        qst9.correta = "E";

        QUESTIONS qst10 = new QUESTIONS();
        qst10.questions = "10 - Em Resident Evil 4, quem Leon S. Kennedy é enviado para resgatar?";
        qst10.A = "A) Jill Valentine";
        qst10.B = "B) Ada Wong";
        qst10.C = "C) Claire Redfield";
        qst10.D = "D) Ashley Graham";
        qst10.E = "E) Rebecca Chambers";
        qst10.correta = "D";

        QUESTIONS qst11 = new QUESTIONS();
        qst11.questions = "11 - Em Resident Evil 5, quem é o parceiro de Chris Redfield durante a campanha principal?";
        qst11.A = "A) Jill Valentine";
        qst11.B = "B) Leon S. Kennedy ";
        qst11.C = "C) Ada Wong ";
        qst11.D = "D) Sheva Alomar ";
        qst11.E = "E) Claire Redfield";
        qst11.correta = "D";

        QUESTIONS qst12 = new QUESTIONS();
        qst12.questions = "12 - No Free Fire, qual é o objetivo principal do jogo?";
        qst12.A = "A) Capturar a bandeira.";
        qst12.B = "B) Construir uma base.";
        qst12.C = "C) Sobreviver até ser o último jogador vivo.";
        qst12.D = "D) Matar o maior número de inimigos possível.";
        qst12.E = "E) Resgatar reféns.";
        qst12.correta = "C";

        QUESTIONS qst13 = new QUESTIONS();
        qst13.questions = "13 - Em UNO, quantas cartas um jogador deve comprar ao receber uma carta “+4”?";
        qst13.A = "A) 2 ";
        qst13.B = "B) 3 ";
        qst13.C = "C) 4 ";
        qst13.D = "D) 6 ";
        qst13.E = "E) 8 ";
        qst13.correta = "C";

        QUESTIONS qst14 = new QUESTIONS();
        qst14.questions = "14 - No jogo Mario Kart 8, qual é a fruta que você joga no oponente que o faz perder o controle do carro?";
        qst14.A = "A) Banana ";
        qst14.B = "B) Cogumelo ";
        qst14.C = "C) Kiwi ";
        qst14.D = "D) Maça ";
        qst14.E = "E) Tomate ";
        qst14.correta = "A";

        QUESTIONS qst15 = new QUESTIONS();
        qst15.questions = "15 - Em Sonic Adventure 2, quem é o principal antagonista que Sonic enfrenta?";
        qst15.A = "A) Dr. Eggman";
        qst15.B = "B) Shadow the Hedgehog";
        qst15.C = "C) Silver the Hedgehog";
        qst15.D = "D) Metal Sonic";
        qst15.E = "E) Chaos";
        qst15.correta = "B";


        //TOTAL DE ACERTOS
        qst1.escrevaresposta();
        if(qst1.Correta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        qst2.escrevaresposta();
        if(qst2.Correta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        qst3.escrevaresposta();
        if(qst3.Correta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        qst4.escrevaresposta();
        if(qst4.Correta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        qst5.escrevaresposta();
        if(qst5.Correta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        qst6.escrevaresposta();
        if(qst6.Correta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        qst7.escrevaresposta();
        if(qst7.Correta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        qst8.escrevaresposta();
        if(qst8.Correta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        qst9.escrevaresposta();
        if(qst9.Correta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        qst10.escrevaresposta();
        if(qst10.Correta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        qst11.escrevaresposta();
        if(qst11.Correta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        qst12.escrevaresposta();
        if(qst12.Correta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        qst13.escrevaresposta();
        if(qst13.Correta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        qst14.escrevaresposta();
        if(qst14.Correta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        qst15.escrevaresposta();
        if(qst15.Correta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        long clockend = System.currentTimeMillis();
        System.out.println("Você acertou um total de: " +contador+"/15.");
        System.out.println("Você gastou: "+(clockend - clockstart )/1000 + "s");

    }
}