package com.mycompany.aps;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Aps {
    public static JLabel Pergunta;
    public static JRadioButton alt1;
    public static JRadioButton alt2;
    public static JRadioButton alt3;
    public static JRadioButton alt4;
    static int p;
    public int x;
    static int i;
    static String[] questao = {"Qual a capital da França","<html>Qual foi o objeto que caiu e levou Isaac Newton a criar a Lei da Gravitação Universal?</html>",
                                "qual o valor mais proximo a π(pi)?","Albert Einstein é conhecido como um XXX?",
                                "A que temperatura a água ferve?","<html>Um anel tem 3 pedras preciosas. Quantas pedras preciosas têm 11 anéis identicos?</html>",
                                "Kryptonita é a fraqueza de qual super-herói?","Quem pintou Mona Lisa?",
                                "<html>As pessoas de qual tipo sanguíneo são consideradas doadores universais?</html>","Qual é o maior oceano do mundo?"};
    static String[] alta = {"Paris","ovo","2","pintor","200ºC","33","Batman","Leonardo da Vinci","Tipo A","Atlântico"};
    static String[] altb = {"Estrasburgo","cavalo","3,14","musico","1ºC","6","Captão America","Salvador Dalí","Tipo B","Índico"};
    static String[] altc = {"Roma","bola de futebol","57,2958°","fisico","100ºC","50","Homem aranha","Tiradentes","Tipo AB","Pacífico"};
    static String[] altd = {"Turim","maça","63,4","jogador de futebol","0ºC","11","Super-Homem","Van Gogh","Tipo O","Ártico"};
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setSize(600,400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        janela.setLayout(null);
      
        Pergunta = new JLabel("sapuibpafbs");
        Pergunta.setSize(400,200);
        Pergunta.setLocation(90 ,-40);
        Pergunta.setFont(new Font("SansSerif", Font.BOLD, 16));
        janela.add(Pergunta);
//      Pergunta.revalidate();
//      Pergunta.repaint();   
        
        
        JButton ok = new JButton("Confirmar");
        ok.setSize(150,40);
        ok.setLocation(430,320);
        ok.addActionListener(Aps::Resposta);
        janela.add(ok);
        
        
        
        ///// alternativas
        
        alt1 = new JRadioButton("a");
        alt1.setSize(150,alt1.getPreferredSize().height);
        alt1.setLocation(90,210);
        janela.add(alt1);
        
        alt2 = new JRadioButton("b");
        alt2.setSize(150,alt2.getPreferredSize().height);
        alt2.setLocation(390,210);
        janela.add(alt2);
        
        alt3 = new JRadioButton("c");
        alt3.setSize(150,alt3.getPreferredSize().height);
        alt3.setLocation(90,270);
        janela.add(alt3);
        
        alt4 = new JRadioButton("d");
        alt4.setSize(150,alt4.getPreferredSize().height);
        alt4.setLocation(390,270);
        janela.add(alt4);
        
        
        ButtonGroup Respostas = new ButtonGroup();
        Respostas.add(alt1);
        Respostas.add(alt2);
        Respostas.add(alt3);
        Respostas.add(alt4);
        
            Pergunta.setText(questao[i]);
            alt1.setText(alta[i]);
            alt2.setText(altb[i]);
            alt3.setText(altc[i]);
            alt4.setText(altd[i]);
            
        
        
        janela.setVisible(true);
    }
        public static void Resposta(ActionEvent e){
            int[] correto = {1,4,2,3,3,1,4,1,4,3};

            
            int y;

            
            
            if(alt1.isSelected()){
                y = 1;
            }
            else{
                if(alt2.isSelected()){
                    y = 2;
                }
                else{
                    if(alt3.isSelected()){
                    y = 3;
                }
                    else{
                        if(alt4.isSelected()){
                        y = 4;
                    }
                    else{
                    y = 5;
                        }
                        }
                    }   
                }
            
            if (correto[i] == y){
                p = p + 1;
            }
            System.out.println(i);
            i = i + 1;
            if(i >= 10){
                JOptionPane.showMessageDialog(null,"Sua pontuacao: " + p + "/10");
                System.exit(0);
            }
            System.out.println(i);
            Pergunta.setText(questao[i]);
            
            alt1.setText(alta[i]);
            alt2.setText(altb[i]);
            alt3.setText(altc[i]);
            alt4.setText(altd[i]);
            
            

        }

        
        
}

