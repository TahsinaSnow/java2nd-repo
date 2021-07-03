
package javalabtask1;

public class JavaLabTask1 {

   
    public static void main(String[] args) {
        LeftHand leftHand1= new LeftHand();
        RightHand rightHand1= new RightHand();
        Bowler bowler1 = new Bowler("Al-amin",new LeftHand(), rightHand1);
        Batsman batsman1 = new Batsman("Shakib",leftHand1, rightHand1);
        
        LeftHand leftHand2= new LeftHand();
        RightHand rightHand2 = new RightHand();
        
        Cat cat1 = new Cat(leftHand1, leftHand2,rightHand1,rightHand2);
        
        LeftHand[] lHs= new LeftHand[2];
        RightHand[] rHs= new RightHand[2];
        lHs[0] = new LeftHand();
        lHs[1] = leftHand2;
        rHs[0] = new RightHand();
        rHs[1] = rightHand2;
        
        Cat cat2 = new Cat(lHs, rHs);
        
        System.out.println("Bowler Name: "+bowler1.name);
        System.out.println("Batsman Name: "+batsman1.name);
        
        LeftHand blf= bowler1.leftHand;
        
        System.out.println("LeftHand owner name: " + blf.ownerName);
    }
    
}
