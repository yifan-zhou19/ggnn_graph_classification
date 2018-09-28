package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[20][10];
		String p = new String(new char[10]);
		int i;
		int j;
		int l;
		p = a;
		for (i = 0;;i++)
		{
			if (scanf("%s",p.Substring(i)) == EOF)
			{
				break;
			}
		}
		for (l = i - 1;l > 0;l--)
		{
			System.out.printf("%s ",*(p.Substring(l)));
		}
		System.out.printf("%s",*(p.Substring(l)));
	}
}
