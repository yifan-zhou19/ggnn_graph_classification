package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int n;
		  int i;
		  int j;
		  String a = new String(new char[100000]);
		  char b;
		  String p;
		  a = new Scanner(System.in).nextLine();
		  p = a;
		  b = p;
		  for (i = 1; * (p.Substring(i)) != '\0';i++)
		  {
									*(p.Substring(i) - 1) = *(p.Substring(i)) + *(p.Substring(i) - 1);
		  }
		  n = p.length();
		  *(p.Substring(n) - 1) = b + *(p.Substring(n) - 1);
		  System.out.println(p);

	}

}
