package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int z;
		int i;
		int day;
		int j;
		int t;
		int[] md = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z = Integer.parseInt(tempVar4);
			}
			day = 0;
			if (y > z)
			{
				t = y;
				y = z;
				z = t;
			}
			if ((x % 400 == 0) || (x % 100 != 0 && x % 4 == 0))
			{
				if (y == 1 && z == 2)
				{
					day = 31;
				}
				if (y < 3 && z>2)
				{
		for (j = y - 1;j < z - 1;j++)
		{
						day = day + md[j];
		}
				   day = day + 1;
				}
				if (y >= 3)
				{
				   for (j = y - 1;j < z - 1;j++)
				   {
					 day = day + md[j];
				   }
				}
			}
			else
			{
			 for (j = y - 1;j < z - 1;j++)
			 {
					 day = day + md[j];
			 }
			}
			if (day % 7 == 0)
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

