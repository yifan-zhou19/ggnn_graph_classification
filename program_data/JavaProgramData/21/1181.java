package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] num = new int[310];
		int sum;
		int t;
		double aver;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sum = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
			sum += num[i];
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (num[j] > num[j + 1])
				{
					t = num[j];
					num[j] = num[j + 1];
					num[j + 1] = t;
				}
			}
		}
		aver = (sum * 1.0) / n;
		if (num[n - 1] - aver > aver - num[0])
		{
			System.out.printf("%d",num[n - 1]);
		}
		else
		{
			if (num[n - 1] - aver == aver - num[0])
			{
				System.out.printf("%d,%d",num[0],num[n - 1]);
			}
			else
			{
				System.out.printf("%d",num[0]);
			}
		}
		return 0;
	}

}

