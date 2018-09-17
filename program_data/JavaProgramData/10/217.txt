package <missing>;

public class GlobalMembers
{
	public static int[] k = new int[25];
	public static int n;
	public static int f(int max,int i,int sum)
	{
		int p;
		int q = 0;
		if (i == n)
		{
			return sum;
		}
		else
		{
			p = f(max, i + 1, sum);
			if (max > k[i + 1])
			{
				q = f(k[i + 1], i + 1, sum + 1);
			}
			return p > q != 0?p:q;
		}
	}
	public static void Main()
	{
		int i;
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
				k[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",f(2147483647, 0, 0));
	}
}

