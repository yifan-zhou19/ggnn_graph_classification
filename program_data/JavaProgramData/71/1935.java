package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int y;
		int m1;
		int m2;
		int temp;
		int d = 0;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			d = 0;
			if (m1 > m2)
			{
				temp = m1;
				m1 = m2;
				m2 = temp;
			}
			for (i = m1;i <= m2 - 1;i++)
			{
				d = d + a[i];
			}
			if (y % 100 == 0 && y % 400 == 0 && m1 <= 2 && m2>2)
			{
				d = 1;
				for (i = m1;i <= m2 - 1;i++)
				{
					d = d + a[i];
				}
			}
			else if (y % 100 != 0 && y % 4 == 0 && m1 <= 2 && m2>2)
			{
				d = 1;
				for (i = m1;i <= m2 - 1;i++)
				{
					d = d + a[i];
				}
			}
			if (d % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}


}

