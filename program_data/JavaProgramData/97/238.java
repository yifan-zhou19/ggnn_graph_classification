package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int[] a = new int[6];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a[0] = m / 100;
		m -= 100 * a[0];
		a[1] = m / 50;
		m -= 50 * a[1];
		a[2] = m / 20;
		m -= 20 * a[2];
		a[3] = m / 10;
		m -= 10 * a[3];
		a[4] = m / 5;
		m -= 5 * a[4];
		a[5] = m / 1;
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
	}
}

