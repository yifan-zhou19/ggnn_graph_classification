package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int p;
		int q;
		int m;
		int n;
		int i;
		String str = new String(new char[15]);
		String substr = new String(new char[5]);

		while (scanf("%s",str) != EOF)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				substr = tempVar.charAt(0);
			}
			p = str.length();
			q = 0;
			for (i = 1;i < p;i++)
			{
				if ((m = str.charAt(i)) > (n = str.charAt(q)))
				{
					q = i;
				}

			}
			for (i = 0;i <= q;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.printf("%s",substr);
			for (i = q + 1;i < p;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.print("\n");
		}
	}

}

