package _1_basics;

import java.util.Arrays;

public class Operator {

    private void assignment() {
        int x = 10;     // gán giá trị 10 cho x
        x += 5;         // tương đương x = x + 5
        System.out.println("x = " + x); // Kết quả: 15
    }

    private void arithmetic() {
        int a = 8, b = 3;
        System.out.println("a + b = " + (a + b)); // 11
        System.out.println("a - b = " + (a - b)); // 5
        System.out.println("a * b = " + (a * b)); // 24
        System.out.println("a / b = " + (a / b)); // 2
        System.out.println("a % b = " + (a % b)); // 2
    }

    private void unary() {
        int n = 5;
        System.out.println(++n); // tăng trước: 6
        System.out.println(n--); // giảm sau: in 6 rồi n = 5
        boolean flag = false;
        System.out.println(!flag); // phủ định: true
    }

    private void relational() {
        int x = 10, y = 20;
        System.out.println(x == y); // false
        System.out.println(x != y); // true
        System.out.println(x < y);  // true
        System.out.println(x >= 10); // true
    }

    private void conditional() {
        int age = 18;
        String result = (age >= 18) ? "Đủ tuổi" : "Chưa đủ tuổi";
        System.out.println(result); // Đủ tuổi
    }

    private void instanceOf() {
        String s = "string";
        System.out.println(s instanceof String);
        System.out.println(s instanceof Object);
    }

    private void bitwise() {
        int x = 5;  // 0101
        int y = 3;  // 0011
        System.out.println(x & y); // AND: 0001 = 1
        System.out.println(x | y); // OR: 0111 = 7
        System.out.println(x ^ y); // XOR: 0110 = 6
        System.out.println(~x);    // NOT: -6
        System.out.println(x << 1); // dịch trái: 10
        System.out.println(x >> 1); // dịch phải: 2
    }
}
