package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		char[][] b = new char[500][6];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		int i;
		int j;
		int m;
		int x;
		x = a.length();
		for (i = 0;i <= x - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[i][j] = a.charAt(i + j);
			}
		}
		int y;
		int[] c = new int[500];
		for (i = 0;i <= x - n;i++)
		{
			for (j = i + 1;j <= x - n;j++)
			{
				for (m = 0;m < n;m++)
				{
					if (b[i][m] != b[j][m])
					{
						y = 0;
						break;
					}
					else
					{
						y = 1;
					}
				}
				if (y == 1)
				{
					c[i]++;
				}
			}
		}
		y = 0;
		for (i = 0;i <= x - n;i++)
		{
			if (y < c[i])
			{
				y = c[i];
			}
		}
		if (y == 0)
		{
			System.out.print("NO\n");
		}
		else
		{

			System.out.printf("%d\n",y + 1);
			for (i = 0;i <= x - n;i++)
			{
				if (c[i] == y)
				{
					for (j = 0;j < n;j++)
					{
						System.out.printf("%c",b[i][j]);
					}
					System.out.print('\n');
				}
			}
		}
		return 0;
	}

}

