package HashTable;

import HashElement.Section;

/**
 * Created by Home on 04.02.2017.
 */
public class HashTable {
    private Section HashTableArray[];
    private int size;

    public HashTable(int size){
        HashTableArray =new Section[size];
        this.size=size;
    }

    public boolean insert(Section HashObject){
        //Section HashObject = new Section();
        //search index
        for (int i = 0; i < HashTableArray.length; i++) {
            if (HashTableArray[i].equals(HashObject))
                return false;
        }
        int index=(int)(HashObject.angleOX()% HashTableArray.length);
        if (HashTableArray[index]!=null){
            return false;

        }
        HashTableArray[index]=HashObject;
        return true;
    }

    public void printHashTable(){
        for (int i = 0; i < HashTableArray.length; i++) {
            if (HashTableArray[i]==null) {
                System.out.printf("%3d %s", i, "Position is null\n");
            }
            else{
                System.out.printf("%3d %5d %s\n", i, HashTableArray[i].angleOX(), HashTableArray[i].toString());
            }
        }
    }

    public int getSize() {
        return size;
    }
}
