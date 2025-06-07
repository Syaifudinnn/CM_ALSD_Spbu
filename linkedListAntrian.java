public class linkedListAntrian {

    //Class ini digunakan utk struktur linked list antrian kendaraan

    //attribut head, tail, size
    Node head;
    Node tail;
    int size = 0;

    // Node class untuk linked list
    static class Node {
        kendaraan data;
        Node next;

        public Node(kendaraan data) {
            this.data = data;
            this.next = null;
        }
    }

    //method tambahAntrian
    public void tambahAntrian(kendaraan data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    //method tampilkanAntrian
    public void tampilkanAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        Node current = head;
        System.out.print("Antrian: ");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    //method getSize
    public int getSize() {
        return size;
    }

    //method layaniKendaraan
    public String layaniKendaraan() {
        if (head == null) {
            System.out.println("Tidak ada kendaraan dalam antrian.");
            return null;
        }
        String kendaraanDilayani = head.data.toString();
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return kendaraanDilayani;
    }

}