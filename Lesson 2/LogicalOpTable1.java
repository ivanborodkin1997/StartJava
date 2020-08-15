class LogicalOpTable1 {
    public static void main(String args[]) {
        byte p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT_P NOT_Q");

        p = 1; q = 1;
        printTable(p, q);

        q = 0;
        printTable(p, q);

        p = 0; q = 1;
        printTable(p, q);

        q = 0;
        printTable(p, q);
    }

    private static void printTable(byte p, byte q) {
        byte notP = (byte) ((p == 0) ? 1 : 0);
        byte notQ = (byte) ((q == 0) ? 1 : 0);
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + notP + "\t  " + notQ + "\t");
    }
}