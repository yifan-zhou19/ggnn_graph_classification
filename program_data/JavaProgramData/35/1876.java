package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int[][] a = new int[9][9];
		int i;
		int j;
		int[] b = new int[9];
		int[] t = new int[9];
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (i = 0; i < x; i++)
		{
			b[i] = 0;
			for (j = 0; j < y; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
				if (a[i][j] > a[i][b[i]])
				{
					b[i] = j;
				}
			}
		}
		for (i = 0; i < x;)
		{
			t[i] = 1;
			for (j = 0; j < x; j++)
			{
				if (j == i)
				{
					continue;
				}
				if (a[i][b[i]] > a[j][b[i]])
				{
					t[i] = 0;
				}
			}
			if (t[i] != 0)
			{
				count++;
			}
			if (count != 0)
			{
				break;
			}
			i++;
		}
		if (count != 0)
		{
			System.out.printf("%d+%d\n", i, b[i]);
		}
		else
		{
			System.out.print("No\n");
		}
	}
}

