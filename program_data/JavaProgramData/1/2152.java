package <missing>;

public class GlobalMembers
{
	public static int count;
	public static void fun(int m,int n)
	{
		if (m <= Math.sqrt(n))
		{
		for (int a = m;a <= Math.sqrt(n);a++)
		{
		if (n % a == 0)
		{
			count++;
			fun(a, n / a);
		}
		else
		{
			count = count;
		}
		}
		}
		else
		{
			count = count;
		}
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			count = 0;
			int num;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			for (int j = 2;j <= Math.sqrt(num);j++)
			{
				if (num % j == 0)
				{
					count++;
					fun(j, num / j);
				}
			}
			System.out.printf("%d\n",count + 1);
		}
	}
}

