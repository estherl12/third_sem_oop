public class stringObj {
    public static void main(String[] args) {
        String gender = "male";
        String str = new String("ram");
        System.out.println(str.length());
        System.out.println(str.equals(gender));
        System.out.println(str.equalsIgnoreCase(gender));
        System.out.println(str+gender);
        System.out.println(gender.concat(str));
        System.out.println(str.isEmpty());
        System.out.println(str.toLowerCase());
    }
}
