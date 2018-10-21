package <missing>;

public class GlobalMembers
{
	public static int c(int x,int k)
	{
		int sum;
		int i = 2;
		int j = 0;
		int m = 1;
	sum = x + k;
	while (i <= x)
	{
		if ((sum * x) % (x - 1) == 0)
		{
		sum = k + sum * x / (x - 1);
	i = i + 1;
		}
	else
	{
		m = m + 1;
	j = j + 1;
	}
	if (j != 0)
	{
		sum = (m) * x + k;
	i = 2;
	j = 0;
	}
	}

	return (sum);
	}

	public static void Main()
	{
		int n;
		int k;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		g = c(n, k);
		System.out.printf("%d",g);
	}
}

