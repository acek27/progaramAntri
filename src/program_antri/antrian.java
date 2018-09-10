package program_antri;

public class antrian {

    String data[];
    int top, rear;

    public antrian(int array) {
        data = new String[array];
        top = -1;
        rear = -1;
    }

    void antri(String nama) {
        rear++;
        data[rear] = nama;
    }
}
