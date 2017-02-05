package Main;


import HashElement.Section;
import HashTable.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        level3();
    }

    public static void level1()
    {
        HashTable hashTable = new HashTable(10);
        for (int i = 0; i < hashTable.getSize(); i++) {
            Section section = new Section();
            hashTable.insert(section);
        }
        hashTable.printHashTable();
    }

    public static void level2()
    {
        HashTable2 hashTable = new HashTable2(10);
        for (int i = 0; i < hashTable.getSize(); i++) {
            Section section = new Section();
            hashTable.insert(section);
        }
        hashTable.printHashTable();
    }

    public static void level3()
    {
        HashTable3 hashTable = new HashTable3(10);
        for (int i = 0; i < hashTable.getSize(); i++) {
            Section section = new Section();
            hashTable.insert(section);
        }
        hashTable.printHashTable();
        System.out.println("Delete");
        hashTable.delete(50);
        hashTable.printHashTable();
    }
}
