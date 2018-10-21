package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] c = new int[200];
		int i;
		int num;
		int y;
		int m;
		int d;
		int k;
		int t;
		int[] a = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		int[] b = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				d = Integer.parseInt(tempVar4);
			}
			if (m > d)
			{
				t = m;
				m = d;
				d = t;

			}
			if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
			{
				k = b[d - 1] - b[m - 1];
				k = k % 7;
				if (k == 0)
				{
					c[i] = 1;
				}
				else
				{
					c[i] = 0;
				}
			}
			else
			{

				k = a[d - 1] - a[m - 1];
				k = k % 7;
				if (k == 0)
				{
					c[i] = 1;
				}
				else
				{
					c[i] = 0;
				}
			}
		}
		for (i = 0;i < num;i++)
		{
			if (c[i] == 1)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}
}

