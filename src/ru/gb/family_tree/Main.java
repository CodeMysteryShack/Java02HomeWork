package ru.gb.family_tree;

import java.time.LocalDate;

public class Main {

    static FamilyTree testTree() {
        Human peter = new Human("Peter", "Ryzhov", Gender.Male,
                LocalDate.of(1981, 12, 14));

        Human katya = new Human("Ekaterina", "Serova", Gender.Female, LocalDate.of(1985, 4, 26));

        Human olya = new Human("Olga", "Chikina", Gender.Female, LocalDate.of(1980, 6, 1));
        Human tanya = new Human("Tatiana", "Moiseeva", Gender.Female, LocalDate.of(1952, 5, 2));
        Human vadim = new Human("Vadim", "Ryzhov", Gender.Male, LocalDate.of(1942, 3, 7));

        FamilyTree familyTree = new FamilyTree();

        familyTree.add(peter);
        familyTree.add(katya);
        familyTree.add(olya);
        familyTree.add(tanya);
        familyTree.add(vadim);

        vadim.addChild(peter);
        vadim.addChild(katya);
        tanya.addChild(peter);
        tanya.addChild(katya);

        familyTree.setWedding(vadim, tanya);
        familyTree.setWedding(peter, olya);

        return familyTree;
    }

    public static void main(String[] args) {
        System.out.println(testTree());
    }
}