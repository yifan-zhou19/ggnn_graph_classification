package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] a = new int[999][10];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int N = 0;
		int total = 0;
		for (i = 1;i < n + 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= a[i][0];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int total1;
		for (i = 1;i < n + 1;i++)
		{
			if (a[i][0] == 0)
			{
				System.out.print("60\n");
			}
			else if (a[i][0] != 0)
			{
				j = a[i][0];
				total1 = a[i][j] + j * 3;
				if (total1 > 63)
				{
					do
					{
						total1 = a[i][j - 1] + j * 3 - 3;
						if (total1 > 63)
						{
							j--;
						}
					}while (total1 > 63);
					N = a[i][j - 1] + j * 3 - 3;
					if (N < 60)
					{
						total = 60 - N + a[i][j - 1];
					}
					else if (N >= 60 && N <= 63)
					{
						total = a[i][j - 1];
					}
					else if (N > 63)
					{
						total = a[i][j - 1] - N + 60;
					}
					System.out.printf("%d\n",total);
				}
				else if (total1 <= 63)
				{
					if (total1 < 60)
					{
						total = 60 - j * 3;
					}
					else
					{
						total = a[i][j];
					}
					System.out.printf("%d\n",total);
				}
			}
		}
	}


}

