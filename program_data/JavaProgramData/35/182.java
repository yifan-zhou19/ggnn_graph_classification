package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int i;
		int j;
		int m;
		int n;
		int l;
		int k;
		int[] b = new int[8];
		int c;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			j = Integer.parseInt(tempVar2);
		}
		for (m = 0;m <= i - 1;m++)
		{
			for (n = 0;n <= j - 1;n++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[m][n] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (m = 0;m <= i - 1;m++)
		{
			b[m] = 0;
			for (n = 0;n <= j - 1;n++)
			{
				if (a[m][n] > a[m][b[m]])
				{
					b[m] = n;
				}
			}
			for (l = 0;l <= i - 1;l++)
			{
				if (a[l][b[m]] < a[m][b[m]])
				{
					t = 0;
					break;
				}
				else
				{
				t = 1;
				}
			}
			if (t == 1)
			{
					c = m;
					break;
			}
		}
			if (t == 1)
			{
				System.out.printf("%d+%d",c,b[m]);
			}
			else
			{
				System.out.print("No");
			}
	}
}

