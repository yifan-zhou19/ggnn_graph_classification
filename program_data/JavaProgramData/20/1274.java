package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max;
		int m;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		String temp = new String(new char[10]);
		while (scanf("%s %s",str,substr) != EOF)
		{
			max = str.charAt(0);
			n = str.length();
			for (i = 0;i < n;i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
					m = i;
				}
			}
			for (i = 0;i <= m;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.printf("%s",substr);
			for (i = m + 1;i < n;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.print("\0");
			System.out.print("\n");
		}
		return 0;
	}

}
