int birdXpost = 250; 
int birdYpost = 400; 
int birdYVelocity = 30; 

int gravity = 1; 

int pipePost = 400;
int upperPipeHeight = (int) random(100,700);
int lowerPipeHeight = (int) random(100,800);
int pipeGap = 50;
int lowerY = upperPipeHeight + pipeGap;



void setup(){
  

size(500,800);

}




void draw(){ 
                     
background(115,210,245); 
fill(255,214,64); 
stroke(0,0,0); 
ellipse(birdXpost,birdYpost-gravity,50,50);

fill(58, 196, 27); 
rect(pipePost,0,100,upperPipeHeight);

fill(58, 196, 27); 
rect(pipePost,700,100,lowerY);
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

