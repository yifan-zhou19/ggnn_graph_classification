package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String c = "";
		char[][] ch = new char[501][6];
		int[] a = new int[500];
		int i;
		int j;
		int n;
		int len;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		c = new Scanner(System.in).nextLine();
		len = c.length();
		for (i = 0;i < len + 1 - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				ch[i][j] = c.charAt(i + j);
			}
		}
		for (i = 0;i < len + 1 - n;i++)
		{
			if (ch[i][0] == '\0')
			{
				continue;
			}
			for (j = 0;j < len + 1 - n;j++)
			{
				if (j == i)
				{
					continue;
				}
				else
				{
					if (!strcmp(ch[i],ch[j]))
					{
						a[i]++;
						ch[j][0] = '\0';
					}
				}
			}
		}
		max = a[0];
		for (i = 1;i < len + 1 - n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		if (max != 0)
		{
			System.out.printf("%d\n",max + 1);
			for (i = 0;i < len + 1 - n;i++)
			{
				if (a[i] == max)
				{
					 System.out.println(ch[i]);
				}
			}
		}
		else
		{
			System.out.print("NO\n");
		}
		return 0;
	}
}

