int birdXpost = 250;
int birdYpost = 400;
int birdYVelocity = 30;
int gravity = 10;
int pipePost = 400;

int upperPipeHeight = (int) random(100,400);

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


}
