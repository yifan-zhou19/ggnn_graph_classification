package <missing>;

public class GlobalMembers
{
	public static int hu(int[][] a, int m, int n)
	{
		int temp = 0;
		int i;
		if (m > 4 || n > 4)
		{
			return 0;
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				temp = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = temp;
			}



			return 1;
		}
	}
	public static void Main()
	{
		int[][] h = new int[5][5];
		int p;
		int q;
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					h[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			q = Integer.parseInt(tempVar3);
		}
		if (hu(h, p, q) != 0)
		{
			for (i = 0;i < 5;i++)
			{
				System.out.printf("%d %d %d %d %d\n",h[i][0],h[i][1],h[i][2],h[i][3],h[i][4]);
			}

		}
		else
		{
			System.out.print("error");
		}
	}

}

