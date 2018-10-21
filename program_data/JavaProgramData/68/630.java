package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int a;
		int i;
		if ((x == 2) || (x == 3))
		{
			return (0);
		}
		else
		{
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			a = x % i;
			if (a == 0)
			{
				break;
			}
		}
		if (a == 0)
		{
			return (1);
		}
		else
		{
			return (0);
		}
		}
	}
	public static void Main()
	{
		int j;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 6;j <= n;j += 2)
		{
			for (k = 2;k <= (j / 2);k++)
			{
			if ((f(k) == 0) && (f(j - k) == 0))
			{
				System.out.printf("%d=%d+%d\n",j,k,j - k);
				break;
			}

			}
		}
	}


}

