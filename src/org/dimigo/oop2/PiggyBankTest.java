package org.dimigo.oop2;

public class PiggyBankTest {
    public static void main(String[] args) {
        FamilyMember[] members = {
                new FamilyMember("아빠"),
                new FamilyMember("엄마"),
                new FamilyMember("나"),
                new FamilyMember("남동생")
        };
        FamilyMember.printMemberCnt();
        PiggyBank.putMoney(members[0], 10000);
        PiggyBank.printBalance();



    }
}
