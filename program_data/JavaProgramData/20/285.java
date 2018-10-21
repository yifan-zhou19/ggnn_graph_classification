package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		final String b = "";
		char c;
		int i;
		int k;
		int m;
		while (scanf("%s %s",a,b) != EOF)
		{
			m = a.length();
			c = a.charAt(0);
			for (i = 1;i < m;i++)
			{
				if (a.charAt(i) > c)
				{
					c = a.charAt(i);
					k = i;
				}
			}
				for (i = 0;i <= k;i++)
				{
					System.out.printf("%c",a.charAt(i));
				}
				System.out.printf("%s",b);
				for (i = k + 1;i < m;i++)
				{
					System.out.printf("%c",a.charAt(i));
				}
				System.out.print("\n");
		}
	}
}
