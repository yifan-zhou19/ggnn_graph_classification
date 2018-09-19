package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		int key;
		int num;
		key = 0;
		int[] count = new int[100];
		int[][] a = new int[100][156];
		int[] result = new int[100];
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 16;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					m = Integer.parseInt(tempVar);
				}
				if (m == 0)
				{
					break;
				}
				else if (m == -1)
				{
					key = 1;
					break;
				}
				else
				{
					a[i][j] = m;
					count[i] = j;
				}
			}
			if (key == 1)
			{
				break;
			}
			num = i;
		}
		for (i = 0;i <= num;i++)
		{
			result[i] = 0;
		}
		for (i = 0;i <= num;i++)
		{
			for (j = 0;j <= count[i];j++)
			{
				for (k = 0;k <= count[i];k++)
				{
					if (a[i][j] == a[i][k] * 2)
					{
						result[i] = result[i] + 1;
					}
				}
			}
		}
		for (i = 0;i <= num;i++)
		{
			System.out.printf("%d\n",result[i]);
		}
		return 0;
	}
}

