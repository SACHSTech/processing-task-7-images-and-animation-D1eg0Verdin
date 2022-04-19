import processing.core.PApplet;
import processing.core.PImage;
public class Sketch extends PApplet {
//declaring global variables
	PImage imageCar;
  PImage imageTrack;
  float xSpeed = 3 ;
  float ySpeed = 3;

	float fltCarX = 150;
  float fltCarY = 400;

  float fltCircX = width/2;
  float fltCircY = width/2;
  float circleXSpeed = 4;
  float circleYSpeed = 5;
  float wave;
  float wMovement;
  
  public void settings() {
    size(996, 747);
  }

 /** imports the images that are used in the animation
  */
  public void setup() {
    imageTrack = loadImage("track.jpg");
    imageCar = loadImage("451-4510710_formula-1-car-top-view (1) (1).png");
  }

  public void draw() {
  background(32); 
	image(imageTrack , 0, 0 ); 
	image(imageCar, fltCarX, fltCarY);

  wave += (Math.PI/20);
  wMovement = (float)(Math.sin(wave)*5);

  fltCarX += wMovement + xSpeed;
  fltCarY += wMovement + ySpeed;

  if (fltCarY > (height - 57) || fltCarY <= 0){
    ySpeed = ySpeed * -1;
    wMovement *= -1;
  }
  if (fltCarX >= (width - 150) || fltCarX <= 0){
    xSpeed = xSpeed * -1;
    wMovement *= -1;
  }

  fill(0);
  ellipse(fltCircX, fltCircY, 30, 30);
  fltCircX += circleXSpeed;
  fltCircY += circleYSpeed;

  if((fltCircX < 0 + 15) || (fltCircX > width - 15)){
    circleXSpeed *= -1;
  }
  if ((fltCircY < 0 + 15) || (fltCircY > height - 15)){
    circleYSpeed *= -1;
  }


 
 
  }
  
  // define other methods down here.
}