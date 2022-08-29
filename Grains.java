import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
if(square < 1 || square > 64)
    throw new IllegalArgumentException("square must be between 1 and 64");
        String number = String.valueOf(square);
        int num = square;
        BigInteger timesTwo = new BigInteger ("2");
        if(square == 1 || square == 2) return new BigInteger(number);
if(square > 2){
    return grainsOnSquare(--num).multiply(timesTwo);
}
        return null;
    }

    BigInteger grainsOnBoard() {
    BigInteger sum = new BigInteger("0");
        for(int i = 1; i<65;i++){
            sum = sum.add(grainsOnSquare(i));
        }
return sum;
    }

}
