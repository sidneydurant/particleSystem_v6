
package particlesystem_v7;

public class Particle {
  
  private float xPos, yPos, xVel, yVel;
  
  public Particle(  float xPos, float yPos, float xVel, float yVel ){
    
    this.xPos = xPos;
    this.yPos = yPos;
    this.xVel = xVel;
    this.yVel = yVel;
    
  }
  
  public void setParticle(  float xPos, float yPos, float xVel, float yVel ){
    
    this.xPos = xPos;
    this.yPos = yPos;
    this.xVel = xVel;
    this.yVel = yVel;
    
  }
  
  public float getxPos(){
    return xPos;
  }
  
  public float getyPos(){
    return yPos;
  }
  
  public float getxVel(){
    return xVel;
  }
  
  public float getyVel(){
    return yVel;
  }
}