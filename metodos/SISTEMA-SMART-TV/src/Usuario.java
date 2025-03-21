public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTv = new SmartTV();

        System.out.println(smartTv.ligada);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        

    }
}
