 
  
  int birdX = 250; 
  int birdY = 400; 
  int birdYVelocity = 10; 
  int gravity = 3; 
  
  int pipeX =500;  
  int upperPipeHeight = (int) random(10,400);
  int pipeGap = 100;
  int lowerPipeHeight = 800-upperPipeHeight-pipeGap;
  int lowerPipe = upperPipeHeight + pipeGap;
  int pipeWidth = 100;
  int speedX =60;
  
  PImage backgroundImage;
  PImage pipe1;
  PImage pipe2;
  PImage bird;
 
  boolean intersectsPipes() { 
         if (birdY < upperPipeHeight && birdX > pipeX && birdX < (pipeX+pipeWidth)){
            return true; }
        else if (birdY>lowerPipe && birdX > pipeX && birdX < (pipeX+pipeWidth)) {
            return true; }
        else { return false; }      
}

 
  void setup(){
    
   

  size(500,800);
  intersectsPipes();      
  backgroundImage = loadImage("flap.png");
  pipe1 = loadImage("pipe.png");
 // pipe2 = loadImage("pipe2.png"
 // bird = loadImage("bird.ping);
  }
  
  
  
  
  void draw(){ 
              
    image(backgroundImage,0,0);
    image(backgroundImage,0,0,width,height); 
  fill(255,214,64); 
  stroke(0,0,0); 
  ellipse(birdX,birdY-gravity,50,50);
  
  stroke(165, 224, 135);
  fill(165, 224, 135);
  rect(0,700,500,10);
  
  
  
  
  pipeX+=speedX;
  if(pipeX > 1){ speedX = -5;} 
  if(pipeX < -100){ upperPipeHeight = (int) random(10,400);}
  if(pipeX < -100){ lowerPipe = upperPipeHeight + pipeGap;}
  if(pipeX < -100){ lowerPipeHeight = 800-upperPipeHeight-pipeGap;}
  if(pipeX < -200){ pipeX = 500;}
  
  birdY+=gravity;
  
  stroke(0,0,0);
  fill(58, 196, 27); 
  rect(pipeX,0,pipeWidth,upperPipeHeight);
  rect(pipeX,lowerPipe,pipeWidth,lowerPipeHeight);
  
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

