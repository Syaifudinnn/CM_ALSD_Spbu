public class linkedListAntrian {

        Node head;
        Node tail;
        int size = 0;

        
        static class Node {
            String data;
            Node next;

            Node(String data) {
                this.data = data;
                this.next = null;
            }
        }

        public void tambahAntrian(String kendaraan) {
            Node newNode = new Node(kendaraan);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

       
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

     
        public int getSize() {
            return size;
        }

       
        public String layaniKendaraan() {
            if (head == null) {
                System.out.println("Tidak ada kendaraan dalam antrian.");
                return null;
            }
            String kendaraanDilayani = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return kendaraanDilayani;
        }


}