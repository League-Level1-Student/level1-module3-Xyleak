
  int score = 0;
  int birdX = 250; 
  int birdY = 100 -100; 
  int birdI = 10;
  
  int birdYVelocity = -10; 
  int gravity = 3; 
  
  int ground = 616;
  int pipeX =500;  
  int upperPipeHeight = (int) random(10,400);
  int pipeGap = 150;
  int lowerPipeHeight = 800-upperPipeHeight-pipeGap;
  int lowerPipe = upperPipeHeight + pipeGap;
  int pipeWidth = 100;
  int speedX =1;
  
  PImage backgroundImage;
  PImage bird;
  
 
  boolean intersectsPipes() { 
            if (birdY < upperPipeHeight && birdX > pipeX && birdX < (pipeX+pipeWidth)){
          return true; }
     else if (birdY>lowerPipe && birdX > pipeX && birdX < (pipeX+pipeWidth)) {
          return true; }
     else { return false; }
     
}

boolean intersectsGround(){
  if(birdY > ground){ 
  return true; }
  else{ return false;}
}

 
  void setup(){
    
   

  size(500,800);
      
  backgroundImage = loadImage("flap.png");
 bird = loadImage("bird.png");
 bird.resize(80,70);
 //pipe2 = loadImage("pipe2.png"
 
  }
  
  
  
  
  void draw(){ 
    
    image(backgroundImage,0,0);
    image(backgroundImage,0,0,width,height); 
    
    image(bird, 210, birdY);
    
   if(intersectsGround()==true){
     speedX=1;
     gravity= 0;
     birdYVelocity = 0;
   }
    
    if(intersectsPipes()==true){
    speedX = 1;
    birdYVelocity = 0; 
    gravity = 10;
   
    }
    else if(intersectsPipes()==false){ 
  
    
 
  }
              
    
 
    
  fill(255,214,64); 
  stroke(0,0,0); 
  ellipse(birdX,birdY-gravity,1,1);
  
  stroke(165, 224, 135);
  fill(165, 224, 135);
  
  
  
  
  
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
 birdY =birdY + birdYVelocity; 
 

  }
  }
  
  
  
 
------------------------------------------------------------------------------------------------------------------------------
Frogger







int frogX = 450; 
int frogY = 650;
int frogJump = 50;
int carX = 500;
int carY = 500;
int carDuwang = 50;


void setup(){ 
size(900,700);
}

void draw(){
background(140,213,255);
fill(73,209,112); 
ellipse(frogX,frogY,65,80);

display();
}

void keyPressed(){
if(key == CODED){
if(keyCode == UP) { frogY = frogY - frogJump; } 
else if(keyCode == DOWN) { frogY = frogY + frogJump; } 
else if(keyCode == RIGHT) { frogX = frogX + frogJump;  } 
else if(keyCode == LEFT) { frogX = frogX - frogJump; } 
}
}

    void display()
  {
    fill(0,255,0);
    rect(carX ,carY,  70, 50);
  }




