package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[5][5];
		int i = 0;
		int j = 0;
		int c;
		int b;
		int[] d = new int[5];
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
			c = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}

		if ((c > 4) || (b > 4) || (c < 0) || (b < 0))
		{
			System.out.print("error\n");
		}
		if ((c >= 0) && (c <= 4) && (b >= 0) && (b <= 4))
		{
			for (i = 0;i < 5;i++)
			{
				d[i] = a[c][i];
				a[c][i] = a[b][i];
				a[b][i] = d[i];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d",a[i][4]);
				System.out.print("\n");
			}
		}
	}

}

