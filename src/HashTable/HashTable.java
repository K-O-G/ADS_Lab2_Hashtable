package HashTable;

import HashElement.Section;


public class HashTable {
    private Section HashTableArray[];
    private int size;

    public HashTable(int size){
        HashTableArray =new Section[size];
        this.size=size;
    }

    public boolean insert(Section HashObject){

        int index= HashFunction(HashObject);
        if (HashTableArray[index]!=null){
            return false;

        }
        HashTableArray[index]=HashObject;
        return true;
    }

    private int HashFunction(Section HashObject) {
        return (int)(HashObject.angleOX()% HashTableArray.length);
    }

    public void printHashTable(){
        for (int i = 0; i < HashTableArray.length; i++) {
            if (HashTableArray[i]==null) {
                System.out.printf("%3d %s", i, "Position is null\n");
            }
            else{
                System.out.printf("%3d %5d %s\n", i, HashFunction(HashTableArray[i]), HashTableArray[i].toString());
            }
        }
    }

    public int getSize() {
        return size;
    }
}
