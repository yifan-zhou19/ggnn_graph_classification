package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int l;
		int j;
		int k;
		final String s = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
		{
			int[] b = new int[101];
			int[] c = new int[123];
			s = new Scanner(System.in).nextLine();
		l = s.length();
	for (i = 0;i <= l - 1;i++)
	{
			b[i] = s.charAt(i);
	}
	for (i = 0;i <= l - 1;i++)
	{
		for (k = 97;k <= 122;k++)
		{
			if (b[i] == k)
			{
					c[k] = c[k] + 1;
			}
		}
	}
			for (i = 0;i <= l - 1;i++)
			{
				if (c[b[i]] == 1)
				{
						break;
				}
			}
				if (b[i] == 0)
				{
					System.out.print("no\n");
				}
				else
				{
					System.out.printf("%c\n",s.charAt(i));
				}

		}
	}

}

