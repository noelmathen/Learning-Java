public class CmdArgs {
    public static void main(String[] args){
        if(args.length > 0){
            System.out.println("The arguments are: ");
            for(String x : args){
                System.out.print(x + " ");
            }
        } else{
            System.out.println("No arguments found!");
        }
    }
}
