package <missing>;

public class GlobalMembers
{
	public static int[] height = new int[26];
	public static int[] max = new int[26];
	public static void cha(int n)
	{
		int premax;
		int i;
		int j;
		for (i = 1;i <= 25;i++)
		{
		max[i] = 0;
		}
		for (i = 1;i <= n;i++)
		{
			max[i] = 1;
			for (j = 1;j < i;j++)
			{
			if (height[i] <= height[j])
			{
			premax = max[j] + 1;
			if (premax > max[i])
			{
			max[i] = premax;
			}
			}
			}
		}
	}
	public static int Main()
	{
		int n;
		int num;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			height[i] = Integer.parseInt(tempVar2);
		}
		}
		cha(n);
		num = -1;
		for (i = 1;i <= n;i++)
		{
			if (num < max[i])
			{
			num = max[i];
			}
		}
		System.out.printf("%d",num);
	}
}

