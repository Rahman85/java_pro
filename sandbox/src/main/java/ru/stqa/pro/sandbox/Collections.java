package ru.stqa.pro.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
  public static void main (String[] args) {

    String[] langs = {"Java", "C#", "Python", "PHP"};
    List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP");
    for (String l : languages) {
    System.out.println("I'm gonna learn " + l);


    //String[] langs = {"Java", "C#", "Python", "PHP"};
    //List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP");
    //for (int i =0; i < languages.size(); i++) {
      //System.out.println("I'm gonna learn " + languages.get(i));

      //String[] langs = {"Java", "C#", "Python", "PHP"};
    //List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP");
    //for (String l : langs) {
    //System.out.println("I'm gonna learn " + l);

    //String[] langs = {"Java", "C#", "Python", "PHP"};
    //List<String> languages = new ArrayList<>();
    //languages.add("Java");
    //languages.add("C#");
    //languages.add("Python");
    //languages.add("PHP");
    //for (String l : langs) {
      //System.out.println("I'm gonna learn " + l);



    //for (int i = 0; i < langs.length; i++) {
      //System.out.println("I'm gonna learn " + langs[i]);
      //for (String l : langs) {
        //System.out.println("I'm gonna learn " + l);
    }
  }
}
