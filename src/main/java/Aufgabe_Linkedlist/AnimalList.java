package Aufgabe_Linkedlist;

import java.util.ArrayList;

public class AnimalList {
    AnimalListItem head; //speichert den Anfang der Liste

    //********************+  Methode  *************************
    //Methode: hängt ein Element (hier ein Animal) an die Liste an
    public void add(Animal v) {
        if (head == null) { //Liste ist leer
            head = new AnimalListItem(v); //v -> head
        } else {
            AnimalListItem item = head;
            while (item.next != null) {
                item = item.next;
            }
            item.next = new AnimalListItem(v);
            //if (head.next == null) { //2. Stelle ist leer
            // head.next = new AnimalListItem(v); //v hinzufügen
            //} else {
            //  head.next.next = new AnimalListItem(v);
        }
    }

    /*
    Methode: gibt die Elemente der Liste als String zurück. z. B : eine Liste enthält: "Katze", "Elefant", "Schlange"
             => gibt “Katze -> Elefant -> Schlange” zurück
     */
    @Override
    public String toString() {
        AnimalListItem itemName = this.head;
        if (itemName == null) {
            return "";
        }
        String nameListe = "";
        while (itemName.next != null) {
            nameListe += itemName.value.toString() + "->";
            itemName = itemName.next;
        }
        nameListe += itemName.value.toString();
        return "Die Liste ist " + nameListe;
    }

//        AnimalListItem itemName = aniList.head;
//        ArrayList<String> nameList = new ArrayList<String>();
//        while(itemName != null){
//            nameList.add(aniList.head.value.toString());
//            head = head.next;
//        }
//        return "Die NameListe ist "+ nameList;

        /*
         AnimalListItem itemName = aniList.head;
        AnimalList nameList = new AnimalList;
        while(itemName != null){
            nameList.add(aniList.head.value.toString());
            head = head.next;
        }
         */


    //Methode remove(Animal animal): die entfernt alle entsprechenden Animals
    public String remove(Animal animal) {
        String removeListe = "";
        AnimalListItem removeItem = this.head;
        if (removeItem == null) {
            System.out.println("Es gibt noch keine Tiere in der Liste!");
        } else {
            while (removeItem.next != null) {
                if (removeItem.value.toString().equals(animal.toString())) {
                    removeItem = removeItem.next;
                } else {
                    removeListe += removeItem.value.toString() + "->";
                    removeItem = removeItem.next;
                }
            }
            if (removeItem.next == null){
                if(removeItem.value.toString() .equals(animal.toString())){
                    return removeListe;
                }else {
                    removeListe += removeItem.value.toString();
                }
            }
        }
        return "Die Liste ohne " + animal+ " ist " + removeListe;
    }


}
