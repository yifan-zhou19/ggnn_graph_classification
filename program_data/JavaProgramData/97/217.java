package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[6];
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (m / 100 > 0)
		{
			a[0]++;
			m -= 100;
		}
		while (m / 50 > 0)
		{
			a[1]++;
			m -= 50;
		}
		while (m / 20 > 0)
		{
			a[2]++;
			m -= 20;
		}
		while (m / 10 > 0)
		{
			a[3]++;
			m -= 10;
		}
		while (m / 5 > 0)
		{
			a[4]++;
			m -= 5;
		}
		a[5] = m;
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n", a[i]);
		}
		return 0;
	}
}

