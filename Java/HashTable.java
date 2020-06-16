import java.util.*;

public class HashTable {

    public static class HTO {
        int value;
        String key;
    }

    java.util.LinkedList<HTO>[] list = new java.util.LinkedList[5];

    public HashTable() {
        for (int i=0; i<list.length; i++) {
            list[i] = null;
        }
    }

    public HTO get(String key) {
        int index = key.hashCode() % 5;
        java.util.LinkedList<HTO> items = list[index];
        if (items == null) {
            return null;
        } else {
            for (HTO item : items) {
               if (item.key.equals(key)) {
                return item;
               }
            }
        }
        return null;
    }

    public void putput(String key, int value) {

        int index = key.hashCode() % 5;
        java.util.LinkedList<HTO> items = list[index];

        if (items == null) {
            items = new java.util.LinkedList<HTO>();
            
            HTO htobj = new HTO();
            htobj.value = value;
            htobj.key = key;

            items.add(htobj);

            list[index] = items;
        } else {
            for (HTO item : items) {
                if (item.key.equals(key)) {
                    item.value = value;
                    return;
                }
            }

            HTO obj = new HTO();
            obj.key = key;
            obj.value = value;

            items.add(obj);
        }

    }




}