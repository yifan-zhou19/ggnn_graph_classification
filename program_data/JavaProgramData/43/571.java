package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int su = int m;
		int n;
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i++)
		{
			if (su(i) != 0 && su(n - i) != 0)
			{
				System.out.printf("%d %d\n",i,n - i);
			}
		}
	}

	public static int su(int m)
	{
		int j;
		for (j = 2;j <= Math.sqrt(m);j++)
		{
			if (m % j == 0)
			{
				break;
			}
		}

		if (j > Math.sqrt(m))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}







}

