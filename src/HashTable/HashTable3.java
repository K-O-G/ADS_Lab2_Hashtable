package HashTable;

import HashElement.Section;

public class HashTable3 {
    private Section HashTableArray[];
    private int size;

    public HashTable3(int size){
        HashTableArray =new Section[size];
        this.size=size;
    }


    public boolean insert(Section HashObject) {

        int index = HashFunction(HashObject);
        if (HashTableArray[index]==null){
            HashTableArray[index]=HashObject;
            return true;
        }
        else if (HashTableArray[index].equals(HashObject)){
            return false;
        }
        else {
            if (Colision(HashObject)==true)
                return true;
            else return false;
        }
    }

    public Boolean Colision(Section HashObject) {
        Integer tempIndex = null;
        for (int i = 1; i < size; i++) {
            tempIndex = ((HashObject.angleOX() + i) % HashTableArray.length);
            if (HashTableArray[tempIndex] == null) {
                HashTableArray[tempIndex]=HashObject;
                return true;
            }
            else if (HashTableArray[tempIndex].equals(HashObject)){
                return false;
            }
        }
        return false;
    }

    private int HashFunction(Section HashObject) {
        return (int)(HashObject.angleOX()% HashTableArray.length);
    }

    public void printHashTable(){
        for (int i = 0; i < HashTableArray.length; i++) {
            if (HashTableArray[i]==null) {
                System.out.printf("%3d %s\n", i, "Position is null");
            }
            else{
                System.out.printf("%3d %5d %s\n", i, HashFunction(HashTableArray[i]), HashTableArray[i].toString());
            }
        }
    }

    public void delete(int length){
        for (int i = 0; i < HashTableArray.length; i++) {
            if (HashTableArray[i].lengthSection()>length){
                HashTableArray[i]=null;
            }
        }
    }

    public int getSize() {
        return size;
    }
}
