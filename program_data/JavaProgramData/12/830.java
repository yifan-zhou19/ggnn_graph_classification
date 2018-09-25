package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[101][101];
		int count = 0;
		int i;
		int j;
		int q;
		int n;
		int b;
		for (i = 1;i <= 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				b = Integer.parseInt(tempVar);
			}
			if (b != -1)
			{
				a[i][1] = b;
				for (j = 2;j <= 100;j++)
				{
					 String tempVar2 = ConsoleInput.scanfRead();
					 if (tempVar2 != null)
					 {
						 a[i][j] = Integer.parseInt(tempVar2);
					 }
					 if (a[i][j] == 0)
					 {
						 a[i][j] = 0;
						 break;
					 }
				}
			}
			else
			{
				break;
			}
		}
		n = i - 1;
		for (i = 1;i <= n;i++)
		{
			count = 0;
			for (j = 1;j <= 100;j++)
			{
				if (a[i][j] != 0)
				{
					for (q = 1;q <= 100;q++)
					{
							if (a[i][j] == 2 * a[i][q])
							{
							count = count + 1;
							}
					}
				}
				else
				{
					break;
				}
			}
			System.out.printf("%d\n",count);
		}
	}
}

