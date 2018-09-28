package <missing>;

public class GlobalMembers
{
	public static int judge_zhi(int a)
	{
		int i;
		if (a != 2 && a % 2 == 1)
		{
		for (i = 2;i <= Math.sqrt(a) + 1;i++)
		{
			if (a % i == 0)
			{
				return (0);
				 break;
			}
		}
		if (i >= Math.sqrt(a) + 1)
		{
			return (1);
		}
		}
		if (a == 2)
		{
			return (1);
		}
		if (a > 2 && a % 2 == 0)
		{
			return (0);
		}
	}

	public static void Main()
	{
		int n;
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (n = 6;n <= m;n++)
		{
			 if (n % 2 == 1)
			 {
				 continue;
			 }
			for (i = 2;i < n;i++)
			{
			if (judge_zhi(i) == 1 && judge_zhi(n - i) == 1)
			{
				System.out.printf("%d=%d+%d\n",n,i,n - i);
				 break;
			}

			}
		}
	}



}

