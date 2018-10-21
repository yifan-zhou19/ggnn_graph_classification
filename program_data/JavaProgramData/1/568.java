package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int fac = new int(int a,int b);
		int n;
		int i;
		int m;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			m = fac(a[i], 2);
			System.out.printf("%d\n",m);
		}
	}



	public static int fac(int a,int b)
	{
		int j;
		int i;
		if (a < b)
		{
			j = 0;
		}
		else
		{
			j = 1;
			for (i = b;i < a;i++)
			{
			if (a % i == 0)
			{
				j = j + fac(a / i, i);
			}

			}
		}
		return (j);
	}

}

