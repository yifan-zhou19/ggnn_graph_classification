package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		int i;
		int k;
		int c;
		k = Math.sqrt(a);
		for (i = 2;i <= k;i++)
		{
			if (a % i == 0)
			{
				break;
			}
		}
		if (i > k)
		{
			c = 1;
		}
		else
		{
			c = -1;
		}
		return (c);
	}

	public static void Main()
	{
		int n;
		int i;
		int k = 0;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n - 2;i++)
		{
			if (f(i) == 1 && f(i + 2) == 1 && (i + 2) <= n)
			{
				a = i;
				b = i + 2;
				System.out.printf("%d %d\n",a,b);
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("empty\n");
		}
	}

}

