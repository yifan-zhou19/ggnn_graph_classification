package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[400];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		int[] dis = new int[400];
		for (i = 0;i < n;i++)
		{
			if (n * a[i] >= sum)
			{
				dis[i] = n * a[i] - sum;
			}
		else
		{
			dis[i] = sum - n * a[i];
		}
		}
		int max = 0;
		for (i = 0;i < n;i++)
		{
			if (dis[i] >= max)
			{
				max = dis[i];
			}
		}
		int num = 0;
		int[] ans = new int[10];
		for (i = 0;i < n;i++)
		{
			if (dis[i] == max)
			{
				ans[num] = a[i];
			 num = num + 1;
			}
		}
		if (num == 1)
		{
			System.out.printf("%d",ans[0]);
		}
		if (num == 2)
		{
			if (ans[1] > ans[0])
			{
				System.out.printf("%d,%d",ans[0],ans[1]);
			}
		 else
		 {
			 System.out.printf("%d,%d",ans[1],ans[0]);
		 }
		}
	}
}

