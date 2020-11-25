import java.io.*;
// @Author Rasmus Olsson
public class WriteFile {
    File oldOrders = new File("oldOrders.txt");



    {
        try {
            if (oldOrders.createNewFile()) {

                System.out.println("Files created: "+oldOrders.getName());
            } else {
                System.out.println("files already exists");
            }
        } catch (IOException e) {
            System.out.println("an error occurred");
            e.printStackTrace();
        }
    }


    public void addToOldOrderList(String order){
        try{
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("oldOrders.txt",true)));
            out.println(order);
            out.flush();
            out.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


}
