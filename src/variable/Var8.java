package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ 127 8비트
        short s = 32767; // -32768 ~ 32767 16비트
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억) 32비트
        // -9,223,372,836,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L; // 64비트
        // -> L을 붙여줘야한다.

        // 실수
        float f = 10.0f; // float 형은 f를 붙여야한다.
        double d = 10.0;
    }
}
