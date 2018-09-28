package <missing>;

public class GlobalMembers
{
	public static void prt(tangible.RefObject<Integer> a)
	{
		int i;
		for (i = 0;i < 5;i++)
		{
			System.out.printf("%d%c",*(a.argValue + i),(i < 4)?' ':'\n');
		}
	}
	public static void Main()
	{
		int i;
		int n;
		int m;
		int[][] a = new int[5][5];
		int j;

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}

		if (0 <= m != 0 && m <= 4 && 0 <= n != 0 && n <= 4)
		{
			for (i = 0;i < 5;i++)
			{
				if (i == m)
				{
					prt(a[n]);
				}
				else if (i == n)
				{
					prt(a[m]);
				}
				else
				{
					prt(a[i]);
				}
			}

		}
		else
		{
			System.out.print("error");
		}
	}



}

