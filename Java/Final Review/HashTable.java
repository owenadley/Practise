import java.util.LinkedList;

public class HashTable {
    
    public class HTO {
        String key;
        int value;

        public HTO(String key, int val) {
            this.key = key;
            this.value = val;
        }
    }

    LinkedList<HTO>[] list = new LinkedList[5];

    public HashTable() {

        for (int i=0; i<list.length; i++) {
            list[i] = null;
        }

    }

    public void put(String key, int val) {

        int index = key.hashCode() % 5;
        LinkedList<HTO> l = list[index];
        
        if (l == null) {

            l = new LinkedList<HTO>();
            HTO hto = new HTO(key, val);
            l.add(hto);

            list[index] = l;

        } else {
            for (HTO hto : l) {
                if (hto.key == key) {
                    hto.value = val;
                    return;
                }
            }

            HTO hto = new HTO(key, val);
            l.add(hto);
        }
    }

    public HTO get(String key) {

        int index = key.hashCode() % 5;
        LinkedList<HTO> ll = list[index];
        if (ll == null) {
            return null;
        }

        for (HTO hto : ll) {
            if (hto.key.equals(key)) {
                return hto;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        HashTable ht = new HashTable();
        ht.put("Hello", 10);
        ht.put("World", 20);
        ht.put("Mang", 30);
        HTO obj = ht.get("Hello");
        System.out.println(obj.value);

    }

}