package HashTable;

import HashElement.Section;

public class HashTable2 {
    private Section HashTableArray[];
    private int size;

    public HashTable2(int size){
        HashTableArray =new Section[size];
        this.size=size;
    }

    public boolean insert(Section HashObject) {

        int index = HashFunction(HashObject);
        for (int i = 0; i < HashTableArray.length; i++) {
            if (HashTableArray[i] != null) {
                if (HashTableArray[i].equals(HashObject))
                    return false;
            }


            if (HashTableArray[index] != null) {
                Integer tempIndex = Colision(index);
                if (tempIndex == null) {
                    return false;
                } else index = (int) tempIndex;
            }
        }
        HashTableArray[index] = HashObject;
        return true;
    }

    public Integer Colision(int index) {
        boolean flag = false;
        Integer tempIndex = null;
        for (int i = index; i < HashTableArray.length; i++) {
            tempIndex = ((index + i) % HashTableArray.length);
            if (HashTableArray[tempIndex] == null) {
                return tempIndex;
            }
            if (i == HashTableArray.length - 1) {
                i = 0;
                flag = true;
            }
            if (i == index && flag == true) {
                return null;
            }
        }
        return tempIndex;
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

    public int getSize() {
        return size;
    }
}
