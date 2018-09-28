package <missing>;

public class GlobalMembers
{
	public static int reverse(int n)
	{
		int i;
		int j;
		int[] d = new int[201];
		int timer = 0;
		int neo = 0;
		int e = 1;
		if (n < 0)
		{
			n *= -1;
		}
		do
		{
			timer++;
			d[timer] = n % 10;
			n /= 10;
		} while (n > 0);
		for (i = 1;i <= timer;i++)
		{
			for (j = 1;j <= timer - i;j++)
			{
				e *= 10;
			}
			neo += d[i] * e;
			e = 1;
		}
		return neo;
	}
	public static int Main()
	{
		int n;
		int i;
		for (i = 1;i < 7;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n < 0)
			{
				System.out.print("-");
			}
			System.out.printf("%d\n",reverse(n));
		}
		return 0;
	}
}

