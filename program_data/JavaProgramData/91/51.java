package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String sz = new String(new char[101]);
		String p;
		String sz1 = new String(new char[101]);
		String p1;
		int i;
		int n;
		int j;
		int add = 0;
		sz = new Scanner(System.in).nextLine();
		p = sz;
		p1 = sz1;
		n = sz.length();
		for (i = 0;i < n;i++)
		{
			*(p1.Substring(i)) = *(p.Substring(i)) + *(p + (i + 1) % n);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",*(p1.Substring(i)));
		}
	}

}
