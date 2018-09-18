package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int j;
		int[][] a = new int[100][100];
		int b = 0;
		int c;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if (a[i][j] == 0)
				{
					b++;
				}
			}
		}
		c = (b - 4) * (b - 4) / 16;
		System.out.printf("%d",c);
	}



}

