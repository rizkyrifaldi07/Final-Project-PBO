
public class Rekening {

    int noRekening;
    double saldo;


    public Rekening(int noRekening, double saldo) {
        this.noRekening = noRekening;
        this.saldo = saldo;
    }
    

    public void tambahSaldo (double jumlah)
    {
        saldo += jumlah;
        System.out.println("Saldo telah ditambah menjadi : "+ saldo);


    }

    public void tarikTunai (double jumlah)
    {
        saldo -= jumlah;

        System.out.println("Saldo berkurang menjadi : "+ saldo);
        if (saldo <= 0)
        {
            System.out.println("Maaf Saldo tidak cukup");
        }
    }
}
