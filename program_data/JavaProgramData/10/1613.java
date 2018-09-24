package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int[] height = new int[25];
	public static int route(int m)
	{
		int i;
		int a = 0;
		int max = 0;
		for (i = m + 1;i < k;i++)
		{
			if (height[i] <= height[m])
			{
				a += 1;
			}
		}
		if (a == 0)
		{
			return 1;
		}
		else
		{
			for (i = m + 1;i < k;i++)
			{
				if (height[i] <= height[m] != 0 && route(i)> max)
				{
					max = route(i);
				}
			}
			return (max + 1);
		}
	}
	public static int Main()
	{
		int i;
		int[] ans = new int[25];
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				height[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < k;i++)
		{
			ans[i] = route(i);
		}
		for (i = 0;i < k;i++)
		{
			if (ans[i] > a)
			{
				a = ans[i];
			}
		}
		System.out.printf("%d\n",a);
	}
}

