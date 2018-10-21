package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[15]);
		final String b = "";
		final String c = "";
		int i;
		int j;
		int k;
		int p;
		int l;

		while (scanf("%s%s",b,c) != EOF)
		{
			l = b.length();
			p = 0;
			for (i = 1;i < l;i++)
			{
				if (b.charAt(i) > b.charAt(p))
				{
					p = i;
				}
			}
			for (i = 0;i <= p;i++)
			{
				System.out.printf("%c",b.charAt(i));
			}
			for (i = 0;i < 3;i++)
			{
				System.out.printf("%c",c.charAt(i));
			}
			for (i = p + 1;i < l;i++)
			{
				System.out.printf("%c",b.charAt(i));
			}
			System.out.print("\n");
		}
	}
}
