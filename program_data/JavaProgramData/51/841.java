package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int[] b = new int[510];
		int k = 0;
		int d = 1;
		String a = new String(new char[510]);
		final String c = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		m = a.length();
		for (i = 0;i <= m - n;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				c.charAt(i + 1)[j] = a.charAt(i + j);
			}
		}
		for (i = 1;i <= m - n + 1;i++)
		{
			for (j = 1,b[i] = 0;j <= m - n + 1;j++)
			{
				if (strcmp(c.charAt(i),c.charAt(j)) == 0)
				{
					b[i]++;
				}
			}
			if (b[i] > k)
			{
				k = b[i];
			}
		}
		if (k == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",k);
		for (i = 1;i <= m - n + 1;i++)
		{
			if (b[i] == k)
			{
				for (j = 1,d = 1;j <= i - 1;j++)
				{
					if (strcmp(c.charAt(j),c.charAt(i)) == 0)
					{
						d = 0;
						break;
					}
				}
				if (d != 0)
				{
					System.out.printf("%s\n",c.charAt(i));
				}
			}
		}
		}
		return 0;
	}

}

