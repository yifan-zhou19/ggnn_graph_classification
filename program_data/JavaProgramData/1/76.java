package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int fun = new int(int m,int n);
		int n;
		int i;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] p;
		p = new int[n];
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
		sum = fun(p[i], 1);
		System.out.printf("%d\n",sum);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
	}
	public static int fun(int m,int n)
	{
		int i;
		int sum = 1;
		if (n == 1)
		{
			for (i = 2;i * i <= m;i++)
			{
				if (m % i == 0)
				{
				sum = sum + fun(m / i, i);
				}
			}
		}
		else
		{
			for (i = n;i * i <= m;i++)
			{
				if (m % i == 0)
				{
				sum = sum + fun(m / i, i);
				}
			}
		}
		return sum;
	}
}

