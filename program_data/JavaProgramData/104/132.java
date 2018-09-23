package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int m = 0;
		int n = 0;
		int i;
		int[] a = new int[20];
		int[] b = new int[20];
		int xi = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}

	//*????//

		a[0] = x;
		b[0] = y;
		for (i = 1;i < 10;i++)
		{
			a[i] = x / 2;
			b[i] = y / 2;
			x = x / 2;
			y = y / 2;
		}
		for (i = 0;a[i] != 0;i++)
		{
			m++;
		}
		for (i = 0;b[i] != 0;i++)
		{
			n++;
		}

		for (i = 1;a[m - i] == b[n - i];i++)
		{
			xi = a[m - i];
		}

		System.out.printf("%d\n",xi);
	}

}

