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
        int index=(int)(HashObject.angleOX()% HashTableArray.length);
        if (HashTableArray[index]!=null){
            //return false;
            boolean flag = false;
            for (int i = index; i < HashTableArray.length; i++) {
                int tempIndex = (index-i)%HashTableArray.length;
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
                System.out.printf("%3d %s", i, "Position is null");
            }
            else{
                System.out.printf("%3d %5d %s", i, HashTableArray[i].angleOX(), HashTableArray[i].toString());
            }
        }
    }

    public int getSize() {
        return size;
    }
}
