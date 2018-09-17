package <missing>;

public class GlobalMembers
{
	public static int s = 0;
	public static int p;
	public static int[] a = new int[100];
	public static void factor(int m,int n,int t)
	{
		int i;
		for (i = 2;i <= (int)Math.sqrt(n);i++)
		{
			if ((n % i == 0) && (i >= m))
			{
				s++;
				factor(i, n / i, t + 1);
			}
		}
		return;
	}
	public static int Main()
	{
		int i;
		int j = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			j = Integer.parseInt(tempVar);
		}
		for (k = 0;k < j;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[k] = Integer.parseInt(tempVar2);
			}
		}
		for (k = 0;k < j;k++)
		{
			p = a[k];
			s = 0;
		for (i = 2;i <= (int)Math.sqrt(p);i++)
		{
			if (p % i == 0)
			{
			s++;
			factor(i, p / i, 2);
			}
		}
			a[k] = s;
		}
		for (k = 0;k < j;k++)
		{
			System.out.printf("%d\n",a[k] + 1);
		}
		return 0;
	}
}

