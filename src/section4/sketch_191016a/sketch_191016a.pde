int x = 264;
int y = 168;
int acceleration = 1;
PImage catPic;
void setup(){
size( 700, 500);
   catPic = loadImage("index.jpeg");
 catPic.resize(700, 500);
background(catPic);
}
void draw(){
         if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
fill(#EA3B47);
ellipse(x, y, 80, 60);
ellipse(x + 193, y, 70, 60);
}
void keyPressed(){
 x+=2 /4*acceleration;
 y+=2 /4*acceleration;
  x++;
y++;
}