import java.awt.image.SampleModel;
import java.beans.Customizer;
import java.util.*;
import java.util.stream.Collectors;

import CashBox.*;
public class Main {

    public static void main(String[] args) {

//  dz#3
Random rand = new Random();
Integer cashAmount = 4;
Integer customersAmount = rand.nextInt(7) + 5;
Integer customerCounter = customersAmount;
Cash[] cashArray = new Cash[cashAmount];
Customer[] customerArray = new Customer[customersAmount];

//cоздать кассы
System.out.println("Created cashes");
for(Integer i = 0; i < cashAmount; i++){
    cashArray[i] = new Cash(rand.nextInt(3)+3, 0, 0);
    System.out.println("Cash # " + i + " speed = " + cashArray[i].speed);
}
System.out.println(" ");

//создать покупателей
System.out.println("Created customers (type: 0 - man, 1 - woman, 2 - child)");
for(Integer i = 0; i < customersAmount; i++){
    customerArray[i] = new Customer(0/*rand.nextInt(3)*/, rand.nextInt(7) + 5, false, false, 0);//type: 0 - man, 1 - woman, 2 - child
    System.out.println("Customer # " + i + " type " + customerArray[i].type + " goods amount " + customerArray[i].goodsAmount);
}
System.out.println(" ");


    while(customerCounter != 0) {
        for (Integer j = 0; j < customersAmount; j++) {
                if (!customerArray[j].isProceed) {
                    customerArray[j].chosenCash = customerArray[j].chooseCash(cashArray);
                    System.out.println("\n" + "Customer # " + j + " with type " + customerArray[j].type + " chose the cash # " + customerArray[j].chosenCash);
                    customerArray[j].isProceed = true;
                }
                if (!customerArray[j].isServed) {
                    cashArray[customerArray[j].chosenCash].serveCustomer(customerArray[j]);
                    System.out.println("Cash " + customerArray[j].chosenCash + " has queue = " + cashArray[customerArray[j].chosenCash].queue + " and summary goods amount " + cashArray[customerArray[j].chosenCash].customersHeap);
                    System.out.println("\n"+"Customer # " + j + " after the cycle has goods amount " + customerArray[j].goodsAmount);
                } else if (customerCounter != 0 && customerArray[j].isServed) {
                    customerCounter = customerCounter - 1;
                }

           }
        System.out.println("\n" + "yet another cycle is over" + "\n" );
        if (customerCounter == 0) System.out.println("\n" + "Everyone is served");
    }



//  dz#2.1  type conversion (not done, no idea how to), transfer to method by value/link

//        Short b = 2;
//        Integer c = 5 /*(Integer) b*/;
//        Integer d = c;
//        System.out.println(modify(d) +" "+ d);


//  dz#2.2  abstract classes/interfaces, access modifiers, polymorphism, static var/method

//    System.out.println("1st gig");
//    Bassist rex = new Bassist("Rex", "Motley Crue","fender", "marshall");
//    Vocalist phil = new Vocalist("Phil", "Pantera", "baritone");//the last band value will
//    phil.greetings();
//    rex.introduce();
//    phil.introduce();
//    rex.playMusic();
//    phil.playMusic();
//    phil.finalSpeech();
//
//    System.out.println("2nd gig");
//    Bassist bruce = new Bassist("Bruce", "Iron Maiden", "gibson", "randall");
//    Vocalist ivan = new Vocalist("Ivan", "Meshuggah", "tenor", "music man", "orange");
//    ivan.greetings();
//    bruce.introduce();
//    ivan.introduce();
//    bruce.playMusic();
//    ivan.playMusic();
//    ivan.finalSpeech();

//        dz#1 stack

//        MyStack sampleStack = new MyStack();
//        sampleStack.push(1223);
//        sampleStack.push(2.452);
//        sampleStack.push("awd");
//        sampleStack.push(true);
//        sampleStack.push(12342434);
//
//        for (Integer i = sampleStack.things.size() - 1; i >= 0; i--) {
//            sampleStack.pop(i);
//        }
    }

    static Integer modify(Integer y) // for testing dz#2.1
    {
        return y * 10;
    }
}