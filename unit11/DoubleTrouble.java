package unit11;

public class DoubleTrouble {
    int player1;
    int player2;
   // Players start with 10 points. 
   //If they roll an even number, they receive 0 points. 
   //If they roll an odd, they get 1 point, 
   //if they roll a 7 they get 3 points and 
   //if they roll doubles they get -5 points. 
   //The first person to lose all their points loses the game.

public DoubleTrouble(){
    player1 = 10;
    player2 = 10;
}


public static int rollDice() {
    int roll = (int)(Math.random()*6)+1;
    return roll;
}
public int playRound(){
    //player 1 rolls 
    //score player 1
    //player 2 rolls
    //score player 2
    int dice1;
    dice1 = rollDice();
    int dice2;
    dice2 = rollDice();
    if(dice1==dice2){
        player1 -= 5;
    }
        if(dice1 + dice2 == 7){
            player1 -= 3;
        }
            if((dice1 + dice2)%2==1){
                player1 += 1;
            }
            return player1;
}



public static void main(String[] args) {
    DoubleTrouble game = new DoubleTrouble();
    game.playRound();
    //check if someone wins
    if(player1==0){
        System.out.println("Player2 Wins!");
    }
}

}
