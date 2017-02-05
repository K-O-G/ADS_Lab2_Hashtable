package HashTable;

import HashElement.Section;

/**
 * Created by Home on 04.02.2017.
 */
public class HashTable3 {
    private Section HashTableArray[];
    private int size;

    public HashTable3(int size){
        HashTableArray =new Section[size];
        this.size=size;
    }

    public boolean insert(Section HashObject){
        int index=(HashObject.angleOX()% HashTableArray.length);
        for (int i = 0; i < HashTableArray.length; i++) {
            if (HashTableArray[i].equals(HashObject))
                return false;
        }
        if (HashTableArray[index]!=null){
            boolean flag = false;
            for (int i = index; i < HashTableArray.length; i++) {
                int tempIndex = (index+i)%HashTableArray.length;
                if (HashTableArray[tempIndex]== null){
                    HashTableArray[tempIndex]= HashObject;
                    return true;
                }
                if (i==HashTableArray.length-1){
                    i=0;
                    flag=true;
                }
                if (i == index && flag == true) {
                    return false;
                }
            }
        }
        HashTableArray[index]=HashObject;
        return true;
    }

    public void printHashTable(){
        for (int i = 0; i < HashTableArray.length; i++) {
            if (HashTableArray[i]==null) {
                System.out.printf("%3d %s\n", i, "Position is null");
            }
            else{
                System.out.printf("%3d %5d %s\n", i, HashTableArray[i].angleOX(), HashTableArray[i].toString());
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
