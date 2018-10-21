package <missing>;

public class GlobalMembers
{
	public static int Days(int x, int y, int z)
	{
		int m;
		int i;
		int month = 0;
		int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0))
		{
			day[2] = 29;
		}
		for (i = 1;i < y;i++)
		{
			month = month + day[i];
		}
		m = (x - 1) * 365 + month + z;
		for (i = 1;i < x;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				m++;
			}
			else
			{
				continue;
			}
		}
		return m;
	}
	public static void Main()
	{
		int[] a = new int[3];
		int[] b = new int[3];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[1] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[2] = Integer.parseInt(tempVar3);
		}
		scanf("\n");
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b[0] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b[1] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			b[2] = Integer.parseInt(tempVar6);
		}
		n = Days(b[0], b[1], b[2]) - Days(a[0], a[1], a[2]);
		System.out.printf("%d\n",n);
	}
}

