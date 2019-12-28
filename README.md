  int birdX = 250; 
  int birdY = 400; 
  int birdYVelocity = 30; 
  int gravity = 1; 
  
  int pipeX =500;  
  int upperPipeHeight = (int) random(100,800);
  int pipeGap = 100;
  int lowerY = upperPipeHeight + pipeGap;
   int speedX =60;
  
  PImage backgroundImage;
  
  void setup(){
    
  
  size(500,800);
  backgroundImage = loadImage("flap.jpg");
  
  }
  
  
  
  
  void draw(){ 
                     
    image(backgroundImage,0,0);
    image(backgroundImage,0,0,width,height); 
  fill(255,214,64); 
  stroke(0,0,0); 
  ellipse(birdX,birdY-gravity,50,50);
  
  
  
  
  
  pipeX+=speedX;
  if(pipeX > 1){ speedX = -1;} 
  if(pipeX < -100){ upperPipeHeight = (int) random(100,800);}
  if(pipeX < -100){ pipeX = 500;}
  
  birdY+=gravity;
  
  
  fill(58, 196, 27); 
  rect(pipeX,0,100,upperPipeHeight);
  rect(pipeX,lowerY,100,800);
  
if(mousePressed){
 birdY =birdY - birdYVelocity; 
  }
  }

------------------------------------------------------------------------------------------------------------------------------
Frogger







int frogX;
int frogY = 550;

void setup(){
size(800,600);  
}  
  
void draw(){
background(140,213,255);

fill(73,209,112);
ellipse(400,frogY,65,80);
}  

{
      if(key == CODED){
            if(keyCode == UP)
            {
                  //Frog Y position goes up
            }
            else if(keyCode == DOWN)
            {
                  //Frog Y position goes down
            }
            else if(keyCode == RIGHT)
            {
                  //Frog X position goes right
            }
            else if(keyCode == LEFT)
            {
                  //Frog X position goes left
            }
      }
}

