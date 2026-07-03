package strings;

public class compareVersion {

    public static void main(String[] args) {

        compareVersion obj = new compareVersion();

        String version1 = "1.2";
        String version2 = "1.10";

        int result = obj.compareVersion(version1, version2);

        System.out.println("Result = " + result);
    }

    public int compareVersion(String version1, String version2) {

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int maxLength = Math.max(v1.length, v2.length);

        for (int i = 0; i < maxLength; i++) {

            // Get value from v1 (or 0 if index doesn't exist)
            int num1 = (i < v1.length) ? Integer.parseInt(v1[i]) : 0;

            // Get value from v2 (or 0 if index doesn't exist)
            int num2 = (i < v2.length) ? Integer.parseInt(v2[i]) : 0;

            if (num1 > num2) {
                return 1;
            } else if (num1 < num2) {
                return -1;
            }
        }

        return 0;
    }
}