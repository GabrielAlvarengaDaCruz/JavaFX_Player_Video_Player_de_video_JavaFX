package main;

import java.awt.Checkbox;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ProjetoMultimidia extends Application {

    public Group componentes;
    public ImageView visualizadorImagem;
    public HBox raiz;
    public Label lbl;
    public Checkbox cb1;
    public Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    public Button bt10, bt11, bt12, bt13, bt14, bt15, bt16, bt17, bt18;
    
    //variaveis de filme
    public Media media;
    public MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3, mediaPlayer4, mediaPlayer5, mediaPlayer6, mediaPlayer7, mediaPlayer8, mediaPlayer9;
    public MediaView mediaView1, mediaView2, mediaView3, mediaView4, mediaView5, mediaView6, mediaView7, mediaView8, mediaView9;

    //comedia
    public String videoPath1 = "file://///Users//gabrielalvarengadacruz//Desktop//arquivos_smh//comedia//filmes_comedia//pets.mp4";
    public String videoPath2 = "file://///Users//gabrielalvarengadacruz//Desktop//arquivos_smh//comedia//filmes_comedia//efada.mp4";
    public String videoPath3 = "file://///Users//gabrielalvarengadacruz//Desktop//arquivos_smh//comedia//filmes_comedia//toryca.mp4";

    //acao
    public String videoPath4 = "file://///Users//gabrielalvarengadacruz//Desktop//arquivos_smh//acao//filmes_acao//Deadpool.mp4";
    public String videoPath5 = "file://///Users//gabrielalvarengadacruz//Desktop//arquivos_smh//acao//filmes_acao//Dracula.mp4";
    public String videoPath6 = "file://///Users//gabrielalvarengadacruz//Desktop//arquivos_smh//acao//filmes_acao//velozesefuriosos.mp4";
    //romance
    public String videoPath7 = "file://///Users//gabrielalvarengadacruz//Desktop//arquivos_smh//romance//filmes_romance//prova.mp4";
    public String videoPath8 = "file://///Users//gabrielalvarengadacruz//Desktop//arquivos_smh//romance//filmes_romance//adaline.mp4";
    public String videoPath9 = "file://///Users//gabrielalvarengadacruz//Desktop//arquivos_smh//romance//filmes_romance//simplesmente.mp4";

    //imagem de fundo   
    private final String Imagem = ("file:////Users//gabrielalvarengadacruz//Desktop//arquivos_smh//imagem_cinema.jpg");

    @Override
    public void start(Stage palco) throws Exception {
        Image imagem = new Image(Imagem); //Carrega a imagem apartir do arquivo
        visualizadorImagem = new ImageView(imagem); //Informa qual imagem será mostrada no construtor
        visualizadorImagem.setTranslateX(0);//seta as coordenadas da imagem no eixo x 
        visualizadorImagem.setTranslateY(0);//seta as coordenadas da imagem do eixo y

        bt1 = new Button("Play");
        bt2 = new Button("Pause");
        bt3 = new Button("Play");
        bt4 = new Button("Pause");
        bt5 = new Button("Play");
        bt6 = new Button("Pause");
        bt7 = new Button("Play");
        bt8 = new Button("Pause");
        bt9 = new Button("Play");
        bt10 = new Button("Pause");
        bt11 = new Button("Play");
        bt12 = new Button("Pause");
        bt13 = new Button("Play");
        bt14 = new Button("Pause");
        bt15 = new Button("Play");
        bt16 = new Button("Pause");
        bt17 = new Button("Play");
        bt18 = new Button("Pause");
        
        
        MouseEvent me = null;
        //Configuraçoes do filme Pets
        mediaPlayer1 = new MediaPlayer(new Media(videoPath1));
        mediaPlayer1.setAutoPlay(false);
        mediaView1 = new MediaView(mediaPlayer1);
        mediaView1.setFitHeight(320);
        mediaView1.setFitWidth(180);
        mediaView1.setTranslateX(50);
        mediaView1.setTranslateY(80);
        bt1.setTranslateX(50);
        bt1.setTranslateY(220);
        bt1.setVisible(true);
        bt1.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override public void handle(ActionEvent e)
            {
                mediaPlayer1.play();
                
            }
                    
                    
        }
        );
        
        bt2.setTranslateX(100);
        bt2.setTranslateY(220);
        bt2.setVisible(true);
        bt2.setVisible(true);
        bt2.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override public void handle(ActionEvent e)
            {
                mediaPlayer1.pause();
            }
        }
        );

        //Configuraçoes do filme efada
        mediaPlayer2 = new MediaPlayer(new Media(videoPath2));
        mediaPlayer2.setAutoPlay(false);
        mediaView2 = new MediaView(mediaPlayer2);
        mediaView2.setFitHeight(320);
        mediaView2.setFitWidth(180);
        mediaView2.setTranslateX(250);
        mediaView2.setTranslateY(80);
        bt3.setTranslateX(250);
        bt3.setTranslateY(220);
        bt3.setVisible(true);
        bt3.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override public void handle(ActionEvent e)
            {
                mediaPlayer2.play();
                
            }
                    
        }
        );
        
        bt4.setTranslateX(300);
        bt4.setTranslateY(220);
        bt4.setVisible(true);
        bt4.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override public void handle(ActionEvent e)
            {
                mediaPlayer2.pause();
            }
        }
        );

        
        

        //Configuraçoes do filme Toryca
        mediaPlayer3 = new MediaPlayer(new Media(videoPath3));
        mediaPlayer3.setAutoPlay(false);
        mediaView3 = new MediaView(mediaPlayer3);
        mediaView3.setFitHeight(320);
        mediaView3.setFitWidth(180);
        mediaView3.setTranslateX(450);
        mediaView3.setTranslateY(80);
        bt5.setTranslateX(450);
        bt5.setTranslateY(220);
        bt5.setVisible(true);
        bt5.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override public void handle(ActionEvent e)
            {
                mediaPlayer3.play();
                
            }
                    
        }
        );
        
        bt6.setTranslateX(500);
        bt6.setTranslateY(220);
        bt6.setVisible(true);
        bt6.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override public void handle(ActionEvent e)
            {
                mediaPlayer3.pause();
            }
        }
        );
        
        

        //Configuraçoes do filme Deadpool
        mediaPlayer4 = new MediaPlayer(new Media(videoPath4));
        mediaPlayer4.setAutoPlay(false);
        mediaView4 = new MediaView(mediaPlayer4);
        mediaView4.setFitHeight(320);
        mediaView4.setFitWidth(180);
        mediaView4.setTranslateX(50);
        mediaView4.setTranslateY(80);
        bt7.setTranslateX(50);
        bt7.setTranslateY(220);
        bt7.setVisible(true);
        bt7.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override public void handle(ActionEvent e)
            {
                mediaPlayer4.play();
                
            }
                    
                    
        }
        );
        
        bt8.setTranslateX(100);
        bt8.setTranslateY(220);
        bt8.setVisible(true);
        bt8.setVisible(true);
        bt8.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override public void handle(ActionEvent e)
            {
                mediaPlayer4.pause();
            }
        }
        );
        
        

        //Configuraçoes do filme Dracula
        mediaPlayer5 = new MediaPlayer(new Media(videoPath5));
        mediaPlayer5.setAutoPlay(false);
        mediaView5 = new MediaView(mediaPlayer5);
        mediaView5.setFitHeight(320);
        mediaView5.setFitWidth(180);
        mediaView5.setTranslateX(250);
        mediaView5.setTranslateY(80);
        
        bt9.setTranslateX(250);
        bt9.setTranslateY(220);
        bt9.setVisible(true);
        bt9.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override public void handle(ActionEvent e)
            {
                mediaPlayer5.play();
                
            }
                    
        }
        );
        
        bt10.setTranslateX(300);
        bt10.setTranslateY(220);
        bt10.setVisible(true);
        bt10.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override public void handle(ActionEvent e)
            {
                mediaPlayer5.pause();
            }
        }
        );

        

        //configuraçoes do filme velozes e furiosos
        mediaPlayer6 = new MediaPlayer(new Media(videoPath6));
        mediaPlayer6.setAutoPlay(false);
        mediaView6 = new MediaView(mediaPlayer6);
        mediaView6.setFitHeight(320);
        mediaView6.setFitWidth(180);
        mediaView6.setTranslateX(450);
        mediaView6.setTranslateY(80);
        bt11.setTranslateX(450);
        bt11.setTranslateY(220);
        bt11.setVisible(true);
        bt11.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override public void handle(ActionEvent e)
            {
                mediaPlayer6.play();
                
            }
                    
        }
        );
        
        bt12.setTranslateX(500);
        bt12.setTranslateY(220);
        bt12.setVisible(true);
        bt12.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override public void handle(ActionEvent e)
            {
                mediaPlayer6.pause();
            }
        }
        );
        
        

        //configuraçoes do filme Prova
        mediaPlayer7 = new MediaPlayer(new Media(videoPath7));
        mediaPlayer7.setAutoPlay(false);
        mediaView7 = new MediaView(mediaPlayer7);
        mediaView7.setFitHeight(320);
        mediaView7.setFitWidth(180);
        mediaView7.setTranslateX(50);
        mediaView7.setTranslateY(80);
        bt13.setTranslateX(50);
        bt13.setTranslateY(220);
        bt13.setVisible(true);
        bt13.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override public void handle(ActionEvent e)
            {
                mediaPlayer7.play();
                
            }
                    
                    
        }
        );
        
        bt14.setTranslateX(100);
        bt14.setTranslateY(220);
        bt14.setVisible(true);
        bt14.setVisible(true);
        bt14.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override public void handle(ActionEvent e)
            {
                mediaPlayer7.pause();
            }
        }
        );

        //configuraçoes do filme adaline
        mediaPlayer8 = new MediaPlayer(new Media(videoPath8));
        mediaPlayer8.setAutoPlay(false);
        mediaView8 = new MediaView(mediaPlayer8);
        mediaView8.setFitHeight(320);
        mediaView8.setFitWidth(180);
        mediaView8.setTranslateX(250);
        mediaView8.setTranslateY(80);
        bt15.setTranslateX(250);
        bt15.setTranslateY(220);
        bt15.setVisible(true);
        bt15.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override public void handle(ActionEvent e)
            {
                mediaPlayer8.play();
                
            }
                    
        }
        );
        
        bt16.setTranslateX(300);
        bt16.setTranslateY(220);
        bt16.setVisible(true);
        bt16.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override public void handle(ActionEvent e)
            {
                mediaPlayer8.pause();
            }
        }
        );

        //configuraçoes do filme simplesmente
        mediaPlayer9 = new MediaPlayer(new Media(videoPath9));
        mediaPlayer9.setAutoPlay(false);
        mediaView9 = new MediaView(mediaPlayer9);
        mediaView9.setFitHeight(320);
        mediaView9.setFitWidth(180);
        mediaView9.setTranslateX(450);
        mediaView9.setTranslateY(80);
        bt17.setTranslateX(450);
        bt17.setTranslateY(220);
        bt17.setVisible(true);
        bt17.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override public void handle(ActionEvent e)
            {
                mediaPlayer9.play();
                
            }
                    
        }
        );
        
        bt18.setTranslateX(500);
        bt18.setTranslateY(220);
        bt18.setVisible(true);
        bt18.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override public void handle(ActionEvent e)
            {
                mediaPlayer9.pause();
            }
        }
        );
        

        lbl = new Label("Sejam Bem Vindos ao Puc Movie");//cria a label 
        lbl.setFont(Font.font(null, FontWeight.BOLD, 30));// define a font e tamanho da letra
        lbl.setTranslateX(110);//seta as coordenadas x da label
        lbl.setTranslateY(380);//seta as coordenadas y da label

        raiz = new HBox(10);//alinha os labels na horizontal
        raiz.setAlignment(Pos.TOP_CENTER);//alinha os botoes no centro da janela
        raiz.setTranslateX(250);// seta as coordenadas x dos botes
        raiz.setTranslateY(5);//seta as coordenadas y dos botoes

        Button botao1 = new Button("Comédia");//cria o botao comedia e o nomeia
        botao1.setOnAction((a) -> {
            comedia();
        });

        Button botao2 = new Button("Ação");// cria o botao acao e o nomeia
        botao2.setOnAction((a) -> {
            acao();

        });
        Button botao3 = new Button("Romance");// cria o botao romance e o nomeia
        botao3.setOnAction((a) -> {
            romance();
        });
        
        
        
        raiz.getChildren().addAll(botao1, botao2, botao3);
        

        componentes = new Group(); //cria um grupo de componentes e mostra na tela
        componentes.getChildren().addAll(visualizadorImagem, raiz, lbl);//adiciona todos os nós em um grupo
        Scene cena = new Scene(componentes, 700, 500);//Determina o tamanho da janela
        palco.setTitle("PUC MOVIE");//Adiciona um titulo na janela
        palco.setScene(cena);//
        palco.show();//Mostra na tela
    }

    public void comedia() {
        componentes.getChildren().removeAll(bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16, bt17, bt18, visualizadorImagem, lbl, mediaView4, mediaView5, mediaView6, mediaView7, mediaView8, mediaView9);
        componentes.getChildren().addAll(bt18, bt17, bt16, bt15, bt14, bt13, bt12, bt11, bt10, bt9, bt8, bt7, bt6, bt5, bt4, bt3, bt2, bt1, mediaView1, mediaView2, mediaView3);
    }
//teste de classe

    public void acao() {
        componentes.getChildren().removeAll(bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16, bt17, bt18, visualizadorImagem, lbl, mediaView1, mediaView2, mediaView3, mediaView7, mediaView8, mediaView9);
        componentes.getChildren().addAll(bt18, bt17, bt16,  bt15, bt14, bt13, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, mediaView4, mediaView5, mediaView6);
    }

    public void romance() {
        componentes.getChildren().removeAll(bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16, bt17, bt18, visualizadorImagem, lbl, mediaView1, mediaView2, mediaView3, mediaView4, mediaView5, mediaView6);
        componentes.getChildren().addAll(bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16, bt17, bt18, mediaView7, mediaView8, mediaView9);
    }

    public void playFilme() {
        componentes.getChildren().removeAll(bt1, bt2, bt3, visualizadorImagem, lbl);
        componentes.getChildren().addAll(mediaView1, mediaView2, mediaView3, mediaView4, mediaView5, mediaView6, mediaView7, mediaView8, mediaView9);
    }

    public static void main(String[] args) {
        launch();
    }
}
