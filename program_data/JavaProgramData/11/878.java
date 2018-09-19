package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int s;
		int i;
		int l;
		s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 1;i < m;i++)
		{
			s = s + a[i];
		}
		s = s + d;
		if (y % 4 == 0)
		{
			if (y % 100 == 0)
			{
				if (y % 400 == 0)
				{
					l = 1;
				}
				else
				{
					l = 0;
				}
			}
			else
			{
				l = 1;
			}
		}
		else
		{
			l = 0;
		}
		if (m > 2)
		{
			s = s + l;
		}
		System.out.printf("%d\n",s);
		return 0;
	}
}

