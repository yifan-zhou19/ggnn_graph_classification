package <missing>;

public class GlobalMembers
{
	public static int f(int a,int min)
	{
		if (a < min)
		{
			return 0;
		}
		int k = 1;
		int i;
		for (i = min;i < a;i++)
		{
			if (a % i == 0)
			{
				k = k + f(a / i, i);
			}
		}
		return (k);
	}

	public static int Main()
	{
		int f = new int(int a,int min);
		int j;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < n;j++)
		{
			b[j] = f(a[j], 2);
			System.out.printf("%d\n",b[j]);
		}
		return 0;
	}
}

