package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int a;
		int b;
		int j;
		int k;
		int r1;
		int r2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
			System.out.print("empty");
		}
		else
		{
		for (i = 2;i <= n - 2;i++)
		{
		  for (j = 2;j <= i - 1;j++)
		  {
			if (i % j == 0)
			{
				r1 = 0;
				break;
			}
			else
			{
				r1 = 1;
			}
		  }
		for (k = 2;k <= i + 1;k++)
		{
			if ((i + 2) % k == 0)
			{
				r2 = 0;
				break;
			}
			else
			{
				r2 = 1;
			}
		}
		if (r1 == 1 && r2 == 1)
		{
		a = i;
		b = i + 2;
		System.out.printf("%d %d\n",a,b);
		}
		else
		{
			continue;
		}
		}
		}
	}
}

