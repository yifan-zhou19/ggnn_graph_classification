package <missing>;

public class GlobalMembers
{
	public static void f(String a, int i, int n)
	{
	  for (i = 0;i < n;i++)
	  {
		if (a[i].compareTo('Z') <= 0)
		{
		  a[i] = a[i] + 'a'-'A';
		}
	  }
	}
	public static int Main()
	{
	  String a = new String(new char[100]);
	  String b = new String(new char[100]);
	  int c;
	  int d;
	  int i;
	  a = new Scanner(System.in).nextLine();
	  b = new Scanner(System.in).nextLine();
	  c = a.length();
	  d = b.length();
	  f(a, i, c);
	  f(b, i, d);
	  if (strcmp(a,b) == 0)
	  {
		  System.out.print("=");
	  }
	  else if (strcmp(a,b) > 0)
	  {
		  System.out.print(">");
	  }
	  else
	  {
		  System.out.print("<");
	  }
	  return 0;
	}

}
