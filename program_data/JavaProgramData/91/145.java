package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[101]);
		String p = c;
		int n;
		int i;
		int j;
		int l;
		c = new Scanner(System.in).nextLine();
		l = c.length() - 1;
		j = p;
		for (i = 0;i < l;i++)
		{
			*(p.Substring(i)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
		}
		*(p.Substring(l)) = *(p.Substring(l)) + j;
		System.out.printf("%s\n",p);
		return 0;
	}
}
