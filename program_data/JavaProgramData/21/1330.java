package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] num = new int[1000];
		int sum = 0;
		int t;
		double ans = 0;
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
				num[i] = Integer.parseInt(tempVar2);
			}
			sum += num[i];
		}
		  ans = (double)sum / n;
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (num[j - 1] > num[j])
				{
				   t = num[j];
				   num[j] = num[j - 1];
				   num[j - 1] = t;
				}
			}
		}
		if (num[n - 1] - ans == ans - num[0])
		{
		   System.out.printf("%d,%d", num[0], num[n - 1]);
		}
		else if (num[n - 1] - ans > ans - num[0])
		{
		   System.out.printf("%d", num[n - 1]);
		}
		else if (num[n - 1] - ans < ans - num[0])
		{
		   System.out.printf("%d", num[0]);
		}
		return 0;
	}

}

