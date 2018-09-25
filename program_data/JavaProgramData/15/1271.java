package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int o;
	   int e;
	   int p;
	   int f;

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
		int[][] num = new int[100][100];
		for (int a = 0;a < n;a++)

		{
			for (int b = 0;b < n;b++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					num[a][b] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (int c = 0;c <= n;c++)
		{
			for (int d = 0;d <= n;d++)
			{
				if ("num[c][d]==0" != null)
				{
					e = c;
					f = d;
				break;
				}
				else
				{
					continue;
				}
			}
		}
		for (int g = n - 1;g > 0;g--)
		{
			for (int h = n - 1;h > 0;h--)
			{

				if ("num[g][h]==0" != null)
				{
					 o = g;
					 p = h;
					break;
				}
				else
				{
					continue;
				}
			}
		}
		int i;
		i = -(o - e-1) * (p - f - 1) / 7;
		if (i == 9)
		{
		System.out.printf("%d",i);
		}
		 else if (i == 3)
		 {
			System.out.printf("%d",i - 1);
		 }
			return 0;
	}


}

