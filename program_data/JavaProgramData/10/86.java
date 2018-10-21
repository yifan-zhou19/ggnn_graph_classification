package <missing>;

public class GlobalMembers
{
	public static int max(int x,int y)
	{
		int z;
		if (x >= y)
		{
			z = x;
		}
		else
		{
			z = y;
		}
		return (z);
	}

	public static int MAX_multi(int[] str, int n)
	{
		int t = 0;
		int i;
		for (i = 0;i < n;i++)
		{
			t = max(t, str[i]);
		}
		return (t);
	}

	public static void count(int[] str, int[] num, int n)
	{
		int i;
		int j;
		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j > i;j--)
			{
				if (str[i] >= str[j])
				{
					num[i] = max(num[i], num[j] + 1);
				}
			}
		}
		System.out.printf("%d\n",MAX_multi(num, n));
	}

	public static void Main()
	{
		int n;
		int i;
		int[] str = new int[25];
		int[] num = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
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
				str[i] = Integer.parseInt(tempVar2);
			}
		}
		count(str, num, n);
	}

}

