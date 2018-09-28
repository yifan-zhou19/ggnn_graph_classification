package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[502]);
		char[][] b = new char[502][6];
		int[] d = new int[502];
		int n;
		int c;
		int e;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		c = (int)a.length();
		for (i = 0;i <= c - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[i][j] = a.charAt(i + j);
			}
		}
		for (i = 0;i < 502;i++)
		{
			b[i][n] = '\0';
		}
		for (i = 0;i <= c - n;i++)
		{
			for (j = i;j <= c - n;j++)
			{
				if ((int)strcmp(b[i],b[j]) == 0)
				{
					d[i]++;
				}
			}

		}
		e = 0;
		for (i = 0;i <= c - n;i++)
		{
			if (d[i] > e)
			{
				e = d[i];
			}
		}
		if (e == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",e);
		for (i = 0;i <= c - n;i++)
		{
			if (d[i] == e)
			{
				for (j = 0;j < n;j++)
				{
					System.out.printf("%c",b[i][j]);
				}
				System.out.print("\n");
			}
		}
		}
		return 0;
	}
}

