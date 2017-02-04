package Main;


import HashElement.Section;
import HashTable.HashTable;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
        HashTable hashTable = new HashTable(10);
        for (int i = 0; i < hashTable.getSize(); i++) {
            Section section = new Section();
            hashTable.insert(section);
        }
        hashTable.printHashTable();
    }
}
