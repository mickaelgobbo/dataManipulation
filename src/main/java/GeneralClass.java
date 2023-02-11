public class GeneralClass {

    public static void main(String[] argv)
            throws Exception
    {


        GeneralManipulation generalManipulation = new GeneralManipulation();
        //generalManipulation.getSeparator("src/test/resources/test.txt");
        int asciiCode = generalManipulation.getAsciiCode(";");


        String firstLine = generalManipulation.getFirstLine("src/test/resources/test.txt");
        String delimiter = generalManipulation.getSeparator(firstLine);

        System.out.println(firstLine);
    }
}
