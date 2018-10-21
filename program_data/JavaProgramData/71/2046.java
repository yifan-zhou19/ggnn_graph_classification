package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int i;
		int c;
		int d;
		int e;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				d = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				e = Integer.parseInt(tempVar4);
			}
			int y = 0;
			if (d < e)
			{
				for (j = d - 1;j < e-1;j++)
				{
					  y = y + a[j];
				}
			}
			else
			{
				for (j = e-1;j < d - 1;j++)
				{
					y = y + a[j];
				}
			}
			if (((c % 4 == 0 && c % 100 != 0) || c % 400 == 0) && ((d < e && d <= 2 && e>2) || (d> e && e <= 2 && d>2)))
			{

					y = y + 1;

			}

			if (y % 7 == 0)
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

