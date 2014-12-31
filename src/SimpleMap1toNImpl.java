/**
 * Created by Pierre on 28/12/2014.
 */
public class SimpleMap1toNImpl implements SimpleMap1toN{

    private class Node {
        int key;
        String name;
        Node nNode;

        public Node (int key, String name) {
            this.key = key;
            this.name = name;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getKey() {
            return key;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    @Override
    public String put(int key, String name) {
        return null;
    }

    @Override
    public String[] get(int key) {
        return new String[0];
    }

    @Override
    public void remove(int key, String name) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}

