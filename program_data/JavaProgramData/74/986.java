package <missing>;

public class GlobalMembers
{
	public static int nu;
	public static int f1(int m)
	{
		int i;
		int d = 0;
		for (i = 2;i <= Math.sqrt(m);i++)
		{
			if (m % i == 0)
			{
			d = 1;
			break;
			}
		}
		if (d == 0)
		{
			return (0);
		}
		else
		{
			return (1); //1j 0z
		}
	}
	public static int f2(int m)
	{
		int mm = 1;
		int d = 0;
		int te;
		while (m / mm >= 10)
		{
			mm = mm * 10;
		}
		while (mm >= 10)
		{
			if (m / mm != m % 10)
			{
				d = 1;
				break;
			}
			m = m - m / mm * mm;
			m /= 10;
			mm /= 100;
		}
		if (d == 0)
		{
			return (0);
		}
		else
		{
			return (1);
		}
	}
	public static void Main()
	{
		int min;
		int max;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			min = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			max = Integer.parseInt(tempVar2);
		}
		nu = 0;
		for (i = min;i <= max;i++)
		{
			if (f1(i) == 0 && f2(i) == 0)
			{
			System.out.printf("%d",i);
			nu = 1;
			break;
			}
		}
		for (i++;i <= max;i++)
		{
			if (f1(i) == 0 && f2(i) == 0)
			{
			System.out.printf(",%d",i);
			}
		}
		if (nu == 0)
		{
			System.out.print("no");
		}
	}


}

