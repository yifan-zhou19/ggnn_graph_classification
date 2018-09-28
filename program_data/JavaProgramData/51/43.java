package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[501]);
		int[][] a = new int[500][500];
		int n;
		int v = 1;
		int s = 1;
		int ss;
		int smax = 1;
		int i;
		int j;
		int k;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}

		for (i = 0;c.charAt(i + n - 1) != 0;i++)
		{
			ss = 1;
			for (j = i + 1;c.charAt(j + n - 1) != 0;j++)
			{

				for (k = 0;k < n;k++)
				{
					if (c.charAt(i + k) != c.charAt(j + k))
					{
						s = 0;
						break;
					}
					else
					{
						s = 1;
					}
				}
				if (s != 0)
				{
					ss++;
					if (ss > smax)
					{
						smax = ss;
					}
				}
			}
			if (ss > 1)
			{
				a[i][ss] = 1;
			}
		}
		if (smax > 1)
		{
			System.out.printf("%d\n",smax);
			for (i = 0;i < 500;i++)
			{
				if (a[i][smax] == 1)
				{
					for (j = 0;j < n;j++)
					{
						System.out.printf("%c",c.charAt(i + j));
					}
					System.out.print("\n");
				}

			}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

