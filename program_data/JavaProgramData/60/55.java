package <missing>;

public class GlobalMembers
{
	public static int f(int a,int b)
	{
		int k1;
		int k2;
		int i;
		int j;
		k1 = Math.sqrt(a);
		for (i = 2;i <= k1;i++)
		{
			if (a % i == 0)
			{
				break;
			}
		}
		k2 = Math.sqrt(b);
		for (j = 2;j <= k2;j++)
		{
			if (b % j == 0)
			{
				break;
			}
		}
		if (i >= k1 + 1 && j >= k2 + 1)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		int n;
		int p = 0;
		int i;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n - 2;)
		{
			p = f(i, i + 2);
			if (p == 1)
			{
				System.out.printf("%d %d\n",i,i + 2);
				q++;
			}
			i = i + 2;
		}
		if (q == 0)
		{
			System.out.print("empty\n");
		}
	}
}

