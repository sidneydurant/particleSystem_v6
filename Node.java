
package particlesystem_v7;

public class Node {
  
  // x, y, and distance
  private int x, y; 
  private float d;
  
  public Node( int x, int y, float d ){
    
    this.x = x;
    this.y = y;
    this.d = d;
    
  }
  
  public int getX(){
    return x;
  }
  
  public int getY(){
    return y;
  }
  
  public float getD(){
    return d;
  }
  
}