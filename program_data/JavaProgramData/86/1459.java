package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum;
		int t;
		int[] m = new int[20];
		int[][] a = new int[20][20];
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			t = 0;
			for (j = 0;j < m[i];j++)
			{
				if (j == 0)
				{
					if (t + a[i][j] - sum <= 60)
					{
						t = t + a[i][j] - sum;
						sum = a[i][j];
					}
					else if (t + a[i][j] - sum > 60)
					{
						sum = 60;
						t = 60;
						break;
					}
				}
				else
				{
					if (t + 3 + a[i][j] - sum <= 60)
					{
						t = t + 3 + a[i][j] - sum;
						sum = a[i][j];
					}
					else if (t + 3 <= 60 && t + 3 + a[i][j] - sum>60)
					{
						sum = sum + 60 - (t + 3);
						t = 60;
						break;
					}
					else if (t + 3 > 60)
					{
						t = 60;
						break;
					}
				}
			}
			if (j == 0)
			{
				sum = 60;
			}
			else if (t + 3 < 60)
			{
				sum = sum + 60 - (t + 3);
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

