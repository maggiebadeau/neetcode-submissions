class DynamicArray {
    private int[] data;
    private int capacity;
    private int size;

    public DynamicArray(int capacity) {
        this.data = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int i) {
        return data[i];
    }

    public void set(int i, int n) {
        data[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        data[size] = n;
        size++;
    }

    public int popback() {
        int val = data[size - 1];
        size--;
        return val;
    }

    public void resize() {
        int newCapacity = capacity * 2;
        int[] newData = new int[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
        capacity = newCapacity;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
