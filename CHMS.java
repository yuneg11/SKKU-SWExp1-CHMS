public class CHMS {
    private static final String databaseFileName = "database.txt";

    public static void main(String[] args) {
        FileManagement fm = new FileManagement(databaseFileName);
        DataManagement dm = new DataManagement(fm.loadDatabase());


        String s = dm.getProducts().get(0).toJSONObject().toJSONString();
        System.out.println(s);
        System.out.println(dm.getProducts().get(1).toJSONObject().toJSONString());
        /* Do What You Want */

        System.out.println("Program over");
        fm.saveDatabase(dm.getProducts());
    }
}