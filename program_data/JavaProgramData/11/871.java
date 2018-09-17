package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int y;
		int d;
		int m;
		int i;
		int j;
		int e = 0;
		int total = 0;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
		{
			a[1] = 29;
		}
		for (i = 1;i < m;i++)
		{
			total += a[i - 1];
		}
		total += d;
		System.out.printf("%d\n",total);
	}
}

