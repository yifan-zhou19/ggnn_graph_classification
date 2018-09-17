package <missing>;

public class GlobalMembers
{
	public static int[] height = new int[26];
	public static int x;
	public static int cmp(int a,int b)
	{
		return (a > b != 0?a:b);
	}
	public static int max(int a,int b)
	{
		int cmp = new int(int a,int b);
		if (b == x)
		{
			if (a >= height[x])
			{
				return (1);
			}
			else
			{
				return (0);
			}
		}
		else
		{
			if (a < height[b])
			{
				return (max(a, b + 1));
			}
			else
			{
				return (cmp(max(a, b + 1), (1 + max(height[b], b + 1))));
			}
		}
	}

	public static int Main()
	{
		int max = new int(int,int);
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		for (i = 0;i < x;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				height[i] = Integer.parseInt(tempVar2);
			}
		}
		x--;
		System.out.printf("%d",max(1000000, 0));
	}

}

