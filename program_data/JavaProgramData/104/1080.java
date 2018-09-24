package <missing>;

public class GlobalMembers
{
	public static int count(int b,int c)
	{
		if (c == 1)
		{
			return 1;
		}
		int k;
		int i;
		int sum = 0;
		double t = c;
		for (i = b;i <= c;i++)
		{
		   if (c % i == 0)
		   {
			   sum += (count(i, c / i));
		   }
		}
		return sum;
	}

	public static void Main()
	{
		int n;
		int m;
		int[] p = new int[2000];
		int sum = 0;
		int tmp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (n > m)
		{
			tmp = n;
			n = m;
			m = tmp;
		}
		do
		{
			p[n] = 1;
			n = n / 2;
		} while (n > 0);
		do
		{
			if (p[m] != 0)
			{
				System.out.printf("%d",m);
				return;
			}
			m = m / 2;
		} while (m > 0);
	}
}

