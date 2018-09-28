package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100]);
	public static String b = new String(new char[100]);
	public static void reverse(String a)
	{
		int i;
		int m;
	 char t;
	 m = a.length();
	 for (i = 0;i < m / 2;i++)
	 {
		   t = a[i];
		a[i] = a[m - i - 1];
		a[m - 1 - i] = t;
	 }
	}
	public static void minus(String a, String b)
	{
		int i;
	for (i = 0;i < b.length();i++)
	{
		 a[i] = a[i] - b[i];
	  if (a[i].compareTo(0) < 0)
	  {
			a[i] = a[i].Substring(10);
		 a[i + 1] = a[i + 1] - 1;
	  }
	  a[i] = a[i].Substring(48);
	}
	}
	public static void Main()
	{
		int i;
		int n;
		String c = new String(new char[2]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n - 1;i++)
	 {
		 a = new Scanner(System.in).nextLine();
		 b = new Scanner(System.in).nextLine();
		 c = new Scanner(System.in).nextLine();
		 reverse(a);
		 reverse(b);
		 minus(a, b);
		 reverse(a);
		 System.out.println(a);
	 }
		 a = new Scanner(System.in).nextLine();
		 b = new Scanner(System.in).nextLine();
		 reverse(a);
		 reverse(b);
		 minus(a, b);
		 reverse(a);
		 System.out.println(a);
	}

}

