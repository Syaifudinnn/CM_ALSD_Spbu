public class queueTransaksi {
    transaksi[] data;
    int front = 0, rear = -1, size = 0, capacity;

    public queueTransaksi(int kapasitas) {
        capacity = kapasitas;
        data = new transaksi[kapasitas];
    }

    public void enqueue(transaksi t) {
        if (size == capacity) {
            System.out.println("Riwayat transaksi penuh!");
            return;
        }
        rear = (rear + 1) % capacity;
        data[rear] = t;
        size++;
        System.out.println(">> Transaksi berhasil dicatat.");
    }

    public void tampilkanTransaksi() {
        if (size == 0) {
            System.out.println("-- Riwayat kosong --");
            return;
        }
        System.out.println("-- Riwayat Transaksi --");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            data[index].tampil();
        }
    }
}