package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[500];
		int n;
		int i;
		int sum = 0;
		int a;
		int j;
		int k;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a % 2 == 1)
			{
				num[i] = a;
				sum = sum + 1;
			}

			else
			{
				num[i] = 0;
			}
		}
		for (j = 1;j <= n - 1;j++)
		{
			for (i = n - 1;i >= j;i--)
			{
				if (num[i] >= num[i - 1])
				{
					g = num[i - 1];
					num[i - 1] = num[i];
					num[i] = g;
				}
			}
		}
			 System.out.printf("%d",num[sum - 1]);
		for (k = sum - 2;k >= 0;k--)
		{
			System.out.printf(",%d",num[k]);
		}
	}

}

