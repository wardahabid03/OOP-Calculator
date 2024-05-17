
package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;
import javafx.scene.text.Font;
import javafx.scene.control.Label;
import java.lang.Math;
public class calDisplay extends Application {
double a=0;
double b=0;
double r=0;
String o=null;
double rr=0;
int m=0;
public double value(double n) {
if(o=="+"||o=="-"||o=="X"||o=="/"||o=="x^y")
{
 if(m==10)
 {
 String s=b+"";
int i=0;
String sub=(s.substring(s.indexOf(".")));
i=sub.length();
if((sub.charAt(1))=='0') {
i=i-1;
}
double w=(n/(Math.pow(10, i)));
b=b+(w);
return b;
 }
 else{

 if(b!=0)
{
b=(b*10)+n;
return b;
}
 b=n;
 return b;
 }
 }
 else
 {
if(m==10)
{
String s=a+"";
int i=0;
String sub=(s.substring(s.indexOf(".")));
i=sub.length();
if((sub.charAt(1))=='0') {
i=i-1;
}
double w=(n/(Math.pow(10, i)));
a=a+(w);
return a;
}
else
{
 if(a!=0)
 {
 a=(a*10)+n;
 return a;
 }
 else {

 a=n;
 }
 return a;

 }
}

}
public void calculate(double a,double b,String o)
 {
if(o=="+"||o=="-"||o=="X"||o=="/")
{
 switch(o)
 {
 case "+":
 {
 r= (a+b);
 break;
 }
 case "-":
 {
 r= (a-b);
 break;
 }case "X":
 {
 r= (a*b);
 break;
 }case "/":
 {

 r= (a/b);
 break;
 }

 }
}

 else
{
switch (o)
{
case "sin":
{r=Math.sin(a);
break;
}
case "cos":
{r= Math.cos(a);
break;}
case "tan":
{r=Math.tan(a);
break;}
case "x^2":
{r= a*a;
break;}
case "log":
{r=Math.log10(a);
break;}
case "x^y":
{r= (double) Math.pow(a, b);
break;}
}
}
 }

public void start(Stage stage) {
Rectangle rl=new Rectangle(); //instantiating Rectangle
rl.setX(100); //setting the X coordinate of upper left
//corner orectangle
rl.setY(100); //setting the Y coordinate of upper left
//corner of rectangle
rl.setWidth(240); //setting the width of rectangle
rl.setHeight(400);
rl.setArcHeight(25);// setting the height of rectangle
rl.setArcWidth(25);
rl.setFill(Color.rgb(81, 43, 88));
 rl.setStroke(Color.rgb(121, 186, 193));
 rl.setStrokeWidth(5);

 Rectangle R=new Rectangle(); //instantiating Rectangle
R.setX(120); //setting the X coordinate of upper left
//corner orectangle
R.setY(120); //setting the Y coordinate of upper left
//corner of rectangle
R.setWidth(200); //setting the width of rectangle
R.setHeight(60);
R.setArcHeight(25);// setting the height of rectangle
R.setArcWidth(25);
R.setFill(Color.AZURE);
 R.setStroke(Color.rgb(150, 150, 150));
 R.setStrokeWidth(3);

 //creating Buttons
 Button button1 = new Button("1");
 Button button2 = new Button("2");
 Button button3 = new Button("3");
 Button button4 = new Button("4");
 Button button5 = new Button("5");
 Button button6 = new Button("6");
 Button button7 = new Button("7");
 Button button8 = new Button("8");
 Button button9 = new Button("9");
 Button button10 = new Button("0");
 Button buttonC = new Button("C");
 Button buttonE = new Button("=");
 Button buttonP = new Button("+");
 Button buttonS = new Button("-");
 Button buttonM= new Button("X");
 Button buttonD = new Button("/");
 Button buttond= new Button(".");
 Button buttont= new Button("tan");
 Button buttons= new Button("sin");
 Button buttonc= new Button("cos");
 Button buttonlog= new Button("log");
 Button buttonx2= new Button("x^2");
 Button buttonxy= new Button("x^y");

 //designing the Buttons
 button1.setStyle("-fx-background-color: #79BAC1;-fx-textfill:F1F3F4; -fx-pref-height: 35px;-fx-pref-width: 35px; ");
 button2.setStyle("-fx-background-color: #79BAC1; -fx-textfill:F1F3F4;-fx-pref-height: 35px;-fx-pref-width: 35px;");
 button3.setStyle("-fx-background-color: #79BAC1; -fx-textfill:F1F3F4;-fx-pref-height: 35px;-fx-pref-width: 35px; ");
 button4.setStyle("-fx-background-color: #79BAC1; -fx-textfill:F1F3F4; -fx-pref-height: 35px;-fx-pref-width: 35px;");
 button5.setStyle("-fx-background-color: #79BAC1; -fx-textfill:F1F3F4; -fx-pref-height: 35px;-fx-pref-width: 35px;");
 button6.setStyle("-fx-background-color: #79BAC1; -fx-textfill:F1F3F4; -fx-pref-height: 35px;-fx-pref-width: 35px; ");
 button7.setStyle("-fx-background-color: #79BAC1; -fx-textfill:F1F3F4; -fx-pref-height: 35px;-fx-pref-width: 35px;");
 button8.setStyle("-fx-background-color: #79BAC1; -fx-textfill:F1F3F4; -fx-pref-height: 35px;-fx-pref-width: 35px; ");
 button9.setStyle("-fx-background-color: #79BAC1; -fx-textfill:F1F3F4; -fx-pref-height: 35px;-fx-pref-width: 35px; ");
 button10.setStyle("-fx-background-color: #79BAC1; -fx-textfill:F1F3F4; -fx-pref-height: 35px;-fx-pref-width: 35px; ");
 buttonD.setStyle("-fx-background-color: #2A7886; -fx-textfill:F1F3F4;-fx-pref-height: 35px;-fx-pref-width: 35px; ");
 buttonS.setStyle("-fx-background-color: #2A7886; -fx-textfill:F1F3F4;-fx-pref-height: 35px;-fx-pref-width: 35px;");
 buttonM.setStyle("-fx-background-color: #2A7886; -fx-textfill:F1F3F4;-fx-pref-height: 35px;-fx-pref-width: 35px; ");
 buttonP.setStyle("-fx-background-color: #2A7886; -fx-textfill:F1F3F4;-fx-pref-height: 35px;-fx-pref-width: 35px; ");
 buttonC.setStyle("-fx-background-color: #2A7886; -fx-textfill:F1F3F4;-fx-pref-height: 35px;-fx-pref-width: 35px; ");
 buttonE.setStyle("-fx-background-color: #EAC3C9; -fx-textfill:F1F3F4;-fx-pref-height: 35px;-fx-pref-width: 100px; ");
 buttond.setStyle("-fx-background-color: #2A7886; -fx-textfill:F1F3F4;-fx-pref-height: 35px;-fx-pref-width: 35px; ");
 buttonc.setStyle("-fx-background-color: #79d1af; -fx-textfill:F1F3F4;-fx-pref-height: 35px;-fx-pref-width: 50px; ");
 buttons.setStyle("-fx-background-color: #79d1af; -fx-textfill:F1F3F4;-fx-pref-height: 35px;-fx-pref-width: 50px; ");
 buttont.setStyle("-fx-background-color: #79d1af; -fx-textfill:F1F3F4;-fx-pref-height: 35px;-fx-pref-width: 50px; ");
 buttonlog.setStyle("-fx-background-color: #79d1af; -fxtext-fill:F1F3F4;-fx-pref-height:35px;-fx-pref-width: 50px; ");
 buttonx2.setStyle("-fx-background-color: #79d1af; -fx-textfill:F1F3F4;-fx-pref-height: 35px;-fx-pref-width: 50px; ");
 buttonxy.setStyle("-fx-background-color: #79d1af; -fx-textfill:F1F3F4;-fx-pref-height: 35px;-fx-pref-width: 50px; ");

 Font font = Font.font("verdana",12);
 Font F = Font.font("verdana",16);

 Label L=new Label();
 Label L1=new Label();

 L.setAlignment(Pos.CENTER_RIGHT);
 L.setPadding(new Insets(5,5,0,0));
 L.setFont(font);
 L1.setAlignment(Pos.CENTER_RIGHT);
 L1.setPadding(new Insets(4,0,0,0));
 L1.setFont(F);

 //creating Display
 HBox field = new HBox(L);
 HBox f=new HBox(L1);
 VBox display=new VBox(field,f);
 display.setSpacing(-3);
 display.setPadding(new Insets(120,120,20,150));
 //Arranging Buttons
 HBox BR1=new HBox(button7,button8,button9,buttonD);
 BR1.setAlignment(Pos.CENTER);
 BR1.setSpacing(9);
 HBox BR2=new HBox(button4,button5,button6,buttonM);
 BR2.setAlignment(Pos.CENTER);
 BR2.setSpacing(8);
 HBox BR3=new HBox(button1,button2,button3,buttonS);
 BR3.setAlignment(Pos.CENTER);
 BR3.setSpacing(9);
 HBox BR4=new HBox(buttonC,button10,buttond,buttonP);
 BR4.setAlignment(Pos.CENTER);
 BR4.setSpacing(8);
 HBox BR6=new HBox(buttonc,buttons,buttont);
 BR6.setAlignment(Pos.CENTER);
 BR6.setSpacing(8);
 HBox BR7=new HBox(buttonx2,buttonxy,buttonlog);
 BR7.setAlignment(Pos.CENTER);
 BR7.setSpacing(8);

 VBox Va=new VBox(BR1,BR2,BR3,BR4,BR6,BR7,buttonE);
 Va.setPadding(new Insets(190,120,120,135));
 Va.setSpacing(8);
 Va.setAlignment(Pos.CENTER);


 //Creating a scene object
 Group G=new Group();
 G.getChildren().addAll(rl,R,display,Va);

 Scene scene=new Scene(G,400,550);

 //Setting title to the Stage
 stage.setTitle("Calculator");

 //Adding scene to the stage
 stage.setScene(scene);



 //Displaying the contents of the stage
 stage.show();


 //Event Actions
 button1.setOnAction((e)->{
 value(1);


 if(o=="+"||o=="-"||o=="X"||o=="/")
 {

 L.setText(a+" "+o+" "+b);


 }

 else {
 L.setText(a+"");
 }
 });

 button2.setOnAction((e)->{
 value(2);

 if(o==null)
 {
 L.setText(a+"");


 }
 else {
 L.setText(a+" "+o+" "+b);

 }
 });

 button3.setOnAction((e)->{
 value(3);

 if(o=="+"||o=="-"||o=="X"||o=="/")
 {

 L.setText(a+" "+o+" "+b);
 }
 else {
 L.setText(a+"");
 }
 });
 button4.setOnAction((e)->{
 value(4);
 if(o=="+"||o=="-"||o=="X"||o=="/")
 {

 L.setText(a+" "+o+" "+b);
 }
 else {
 L.setText(a+"");
 }

 });
 button5.setOnAction((e)->{
 value(5);
 if(o=="+"||o=="-"||o=="X"||o=="/")
 {

 L.setText(a+" "+o+" "+b);
 }
 else {
 L.setText(a+"");
 }


 });
 button6.setOnAction((e)->{
 value(6);
 if(o=="+"||o=="-"||o=="X"||o=="/")
 {

 L.setText(a+" "+o+" "+b);
 }
 else {
 L.setText(a+"");
 }


 });

 button7.setOnAction((e)->{
 value(7);
 if(o=="+"||o=="-"||o=="X"||o=="/")
 {

 L.setText(a+" "+o+" "+b);
 }
 else {
 L.setText(a+"");
 }


 });
 button8.setOnAction((e)->{
 value(8);
 if(o=="+"||o=="-"||o=="X"||o=="/")
 {

 L.setText(a+" "+o+" "+b);
 }
 else {
 L.setText(a+"");
 }


 });

 button9.setOnAction((e)->{
 value(9);
 if(o=="+"||o=="-"||o=="X"||o=="/")
 {

 L.setText(a+" "+o+" "+b);
 }
 else {
 L.setText(a+"");
 }


 });
 button10.setOnAction((e)->{
 value(0);
 { if(o=="+"||o=="-"||o=="X"||o=="/")
 {

 L.setText(a+" "+o+" "+b);
 }
 else {
 L.setText(a+"");
 }

 }
 });
 buttonD.setOnAction((e)->{
 o="/";
 m=0;
 L.setText(a+" / ");
 });
 buttonM.setOnAction((e)->{
 o="X";
 m=0;
 L.setText(a+" X");
 });
 buttonS.setOnAction((e)->{
 o="-";
 m=0;
 L.setText(a+" -");
 });
 buttonP.setOnAction((e)->{
 o="+";
 m=0;
 L.setText(a+" +");
 });

 buttonlog.setOnAction((e)->{
 o="log";
 m=0;
 L.setText("log("+a+")");
 });

 buttont.setOnAction((e)->{
 o="tan";
 m=0;
 L.setText("tan("+a+")");
 });

 buttons.setOnAction((e)->{
 o="sin";
 m=0;
 L.setText("sin("+a+")");
 });

 buttonc.setOnAction((e)->{
 o="cos";
 m=0;
 L.setText("cos("+a+")");
 });


 buttonx2.setOnAction((e)->{
 o="x^2";
 m=0;
 L.setText(a+"^2");
 });

 buttonxy.setOnAction((e)->{
 o="x^y";
 m=0;
 L.setText(a+"^");
 });

 buttond.setOnAction((e)->{
 m=10;

 });

 buttonC.setOnAction((e)->
 {
 a=0;
 b=0;
 o=null;
 m=0;
 L.setText("");
 L1.setText("");
 });

 buttonE.setOnAction((e)->{
 calculate(a,b,o);
 rr = Math.round(r * 100000.0) / 100000.0;
 String s=rr+"";
 if(o=="+"||o=="-"||o=="X"||o=="/")
 {L.setText(a+" "+o+" "+b);}
 else
 {
 if(o=="x^y")
 {
 L.setText(a+"^"+b);
 }
 else if(o=="x^2")
 {
 L.setText(a+"^2");
 }
 else{

 L.setText(o+"("+a+")");
 }
 }
 L1.setFont(F);
 L1.setText(s);
 a=r;
 r=0;
 b=0;

 });


 }
 public static void main(String args[]){
 launch(args);
 }
}



