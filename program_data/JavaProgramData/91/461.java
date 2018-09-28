package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		char c;
		char b;
		String p;
		int i;
		int j;
		int n;
		p = a;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		b = p;
		for (i = 0;i < n - 1;i++)
		{
			c = (p.Substring(i) + 1);
			*(p.Substring(i)) = *(i + p) + c;
		}
		*(p.Substring(n) - 1) = b + *(p.Substring(n) - 1);
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",*(p.Substring(i)));
		}
	}




}
