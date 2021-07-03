
package javalabtask1;

public class Bowler {
    String name;
    LeftHand leftHand;
    RightHand rightHand;
    
    public Bowler(String name,LeftHand leftHand,RightHand rightHand)
    {
        this.name=name;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
        this.leftHand.ownerName=name;
        this.rightHand.ownerName=name;
    }
    
   
}
