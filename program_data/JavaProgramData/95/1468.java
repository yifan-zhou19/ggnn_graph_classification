package <missing>;

public class GlobalMembers
{
	public static char change(char c)
	{
		if ('A' <= c && c <= 'Z')
		{
			return c - 'A'+'a';
		}
		return c;
	}
	public static char f(String a, int la, String b, int lb)
	{
		for (int i = 0;i < la && i < lb;i++)
		{
			 a[i] = change(a[i]);
			 b[i] = change(b[i]);
			 if (!a[i].equals(b[i]))
			 {
		  if (a[i].compareTo(b[i]) < 0)
		  {
			  return '<';
		  }
		  if (a[i].compareTo(b[i]) > 0)
		  {
			  return '>';
		  }
			 }
		}
		return '=';
	}
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int la;
		int lb;
		la = a.length();
		lb = b.length();
		System.out.printf("%c",f(a, la, b, lb));
		 return 0;
	}
}
