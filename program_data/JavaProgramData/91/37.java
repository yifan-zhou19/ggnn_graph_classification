package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
		String p;
		String p1;
		int n;
		int i;
		p = s;
		p1 = s1;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n - 1;i++)
		{
		*(p1.Substring(i)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
		}
		*(p1.Substring(n) - 1) = *(p.Substring(n) - 1) + p;
		for (i = 0;i < n;i++)
		{
		System.out.printf("%c",*(p1.Substring(i)));
		}
	}

}
