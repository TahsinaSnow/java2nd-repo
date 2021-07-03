
package javalabtask1;

public class Cat {
    LeftHand[] leftHands = new LeftHand[2];
    RightHand[] rightHands= new RightHand[2];
    
    public Cat(LeftHand leftHand1,LeftHand leftHand2,RightHand rightHand1,RightHand rightHand2)
    {
        leftHands[0] = leftHand1;
        leftHands[1] = leftHand2;
        rightHands[0] = rightHand1;
        rightHands[1] = rightHand2;     
    }

    public Cat(LeftHand[] leftHands,RightHand[] rightHands) {
        this.leftHands = leftHands;
        this.rightHands = rightHands;
    }
    
    
}
