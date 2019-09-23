package com.company;

public class Main {

    public static void main(String[] args) {
        Topic topic = new Topic(5, 2);
        System.out.println (topic);
        topic.inserir("xurupita", 18);
        topic.inserir("Ze_das_tapioca", 68);
        topic.inserir("Maria_Izolda", 69);
        topic.inserir("Elvis", 34);
        topic.inserir("Fulanim", 24);
        topic.inserir("Sicranim", 12);
        System.out.println (topic);


    }
}
