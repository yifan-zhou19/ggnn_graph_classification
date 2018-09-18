package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[15]);
		String substr = new String(new char[5]);
		while (scanf("%s%s",str,substr) != EOF)
		{
			int i;
			int m = 0;
			for (i = 0;i < 10;i++)
			{
				if (str.charAt(i) == 0)
				{
					break;
				}
				if (str.charAt(i) > str.charAt(m))
				{
					m = i;
				}
			}
			for (i = 0;i <= m;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.printf("%s",substr);
			for (i = m + 1;i < 15;i++)
			{
				if (str.charAt(i) == 0)
				{
					break;
				}
				System.out.printf("%c",str.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}
}
