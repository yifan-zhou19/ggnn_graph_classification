package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int z;
		int[] a = new int[5];
		int i;
		if (n >= 0)
		{
			a[0] = (n - n % 10000) / 10000;
			a[1] = (n % 10000 - n % 1000) / 1000;
			a[2] = (n % 1000 - n % 100) / 100;
			a[3] = (n % 100 - n % 10) / 10;
			a[4] = n % 10;
			z = a[4] * 10000 + a[3] * 1000 + a[2] * 100 + a[1] * 10 + a[0];
			for (i = 4;i >= 0;i--)
			{
				if (z % 10 == 0)
				{
					z = z / 10;
				}
			}
		}
		else
		{
			z = f(-n);
		}
		return z;
	}
	public static void Main()
	{
		int i;
		int[] b = new int[6];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				b[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			if (b[i] < 0)
			{
				System.out.print("-");
			}
			System.out.printf("%d",f(b[i]));
			System.out.print("\n");
		}
	}



}

