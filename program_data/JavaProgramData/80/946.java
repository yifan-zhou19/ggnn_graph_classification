package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[3];
		int[] b = new int[3];
		int i;
		int j;
		int k;
		int n = 0;
		int d = 0;
		int m = 0;
		int s = 0;
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
		for (i = a[0];i <= b[0];i++)
		{
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				n = n + 366;
			}
			else
			{
				n = n + 365;
			}
		}
		for (j = 0;j < a[1];j++)
		{
			if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
			{
				d = d + 31;
			}
			if (j == 4 || j == 6 || j == 9 || j == 11)
			{
				d = d + 30;
			}
			if (j == 2 && (a[0] % 4 == 0 && a[0] % 100 != 0 || a[0] % 400 == 0))
			{
				d = d + 29;
			}
			if (j == 2 && (a[0] % 4 != 0 || a[0] % 100 == 0 && a[0] % 400 != 0))
			{
				d = d + 28;
			}
		}
		for (k = 12;k >= b[1];k--)
		{
			if (k == 1 || k == 3 || k == 5 || k == 7 || k == 8 || k == 10 || k == 12)
			{
				m = m + 31;
			}
			if (k == 4 || k == 6 || k == 9 || k == 11)
			{
				m = m + 30;
			}
			if (k == 2 && (b[0] % 4 == 0 && b[0] % 100 != 0 || b[0] % 400 == 0))
			{
				m = m + 29;
			}
			if (k == 2 && (b[0] % 4 != 0 || b[0] % 100 == 0 && b[0] % 400 != 0))
			{
				m = m + 28;
			}
		}
		s = n - d - m + b[2] - a[2];
		System.out.printf("%d",s);
		return 0;
	}

}

