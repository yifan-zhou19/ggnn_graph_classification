package <missing>;

public class GlobalMembers
{
	public static void x(tangible.RefObject<String> p1, tangible.RefObject<String> p2, int n)
	{
	 int i;
	 int a;
	 int b;
	 int c;
	 for (i = 1;i <= n - 1;i++)
	 {
	  a = (p1.argValue.Substring(i) - 1);
	  b = (p1.argValue.Substring(i));
	  c = a + b;
	  *(p2.argValue.Substring(i) - 1) = c;
	 }
	  a = (p1.argValue.Substring(n) - 1);
	  b = (p1.argValue);
	  c = a + b;
	*(p2.argValue.Substring(n) - 1) = c;
	}
	public static int Main()
	{
	  int n;
	  String p3;
	  String p4;
	  String a = new String(new char[200]);
	  String b = new String(new char[200]);
	  p3 = a;
	  p4 = b;
	  a = new Scanner(System.in).nextLine();
	  n = a.length();
  tangible.RefObject<String> tempRef_p3 = new tangible.RefObject<String>(p3);
  tangible.RefObject<String> tempRef_p4 = new tangible.RefObject<String>(p4);
	  x(tempRef_p3, tempRef_p4, n);
	  p4 = tempRef_p4.argValue;
	  p3 = tempRef_p3.argValue;
	  *(p4.Substring(n)) = '\0';
	  System.out.printf("%s",b);
	  return 0;
	}
}

