package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10]);
		String b = new String(new char[10]);
		char k;
		int i;
		int l;
		int t = 0;
		int m;
		while ((scanf("%s%s",a,b)) != EOF)
		{
			l = a.length();
			m = b.length();
			k = a.charAt(0);
			for (i = 1;i < l;i++)
			{
				if (a.charAt(i) > k)
				{
					k = a.charAt(i);
					t = i;
				}
			}
			for (i = 0;i <= t;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			for (i = 0;i < m;i++)
			{
				System.out.printf("%c",b.charAt(i));
			}
			for (i = t + 1;i < l;i++)
			{
			System.out.printf("%c",a.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}
}
