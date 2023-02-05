public class Main {
  public static void main(String[] args) {
    Va1 o = new Va2();

    System.out.println(o.fin(o.getStr(), 5));
  }
}

class Va1 {
  public static String getStr() {
    return "abcdefghijklmnop";
  }

  public String ini(String s, int cpr) {
    return s.substring(0, cpr);
  }

  public String fin(String s, int cpr) {
    return ini(s, cpr) + s.substring(s.length() - cpr, s.length());
  }
}

class Va2 extends Va1 {
  public static String getStr() {
    return "0123456789ABCDEF";
  }

  public String ini(String s, int cpr) {
    return s.substring(s.length() - cpr, s.length());
  }
}
