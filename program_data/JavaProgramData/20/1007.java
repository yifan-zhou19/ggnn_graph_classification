package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int L;
		int zhi;
		int j;
		int k;
		String str = new String(new char[15]);
		String substr = new String(new char[4]);
		char c;
		while (scanf("%s%s",str,substr) != EOF)
		{
			L = str.length();
			c = str.charAt(0);
			zhi = 0;
			for (i = 1;i < L;i++)
			{
				if (c < str.charAt(i))
				{
					c = str.charAt(i);
					zhi = i;
				}
			}
			for (j = 0;j <= zhi;j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
			System.out.printf("%s",substr);
			for (k = zhi + 1;k < L;k++)
			{
				System.out.printf("%c",str.charAt(k));
			}
			System.out.print("\n");
		}
	}
}
