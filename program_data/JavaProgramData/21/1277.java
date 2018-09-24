package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int j = 0;
		int c = 0;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a[300],b[300];
		int[] a = new int[300];
		int[] b = new int[300];
		double av;
		double cha;
		double sum = 0;
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
			sum = a[i] + sum;
		}
		av = sum / n;

		cha = Math.abs(av - a[0]);

		for (i = 0,m = 0;i < n;i++)
		{
			if (cha < Math.abs(a[i] - av))
			{
				cha = Math.abs(a[i] - av);
				b[m] = a[i];
				j = 1;
			}
		}
		if (j != 1)
		{
			b[0] = a[0];
		}
		for (i = b[0] + 1,m = 1;i < n;i++)
		{
			if (cha == Math.abs(a[i] - av))
			{
				b[m] = a[i];
				m++;
				c++;
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i <= c;i++)
		{
		System.out.printf(",%d",b[i]);

		}
		return 0;
	}



}

