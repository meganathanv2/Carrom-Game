package com.mega.pack4;

import com.mega.pack1.payment;
import com.mega.pack3.cardPayment;

public class main {

    static class employee {
        private int emId;

        public employee(int emId) {
            this.emId = emId;
        }

        @Override
        public boolean equals(Object obj) {
            return (this.emId == ((employee) obj).emId);
        }

    }

    public static void main(String[] args) {
        payment.test1();
        cardPayment p = new cardPayment();
        p.pay();
        employee s1 = new employee(1);
        employee s2 = new employee(1);
        System.out.print(s1.equals(s2));
    }
}