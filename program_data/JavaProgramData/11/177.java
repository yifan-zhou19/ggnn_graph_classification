package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int x;
		int i;
		int sum = 0;
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
			x = Integer.parseInt(tempVar3);
		}
	   if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
	   {
			int[] d = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			for (i = 0;i < m;i++)
			{
				sum = sum + d[i];
			}


			System.out.printf("%d",sum + x);
	   }
		else
		{
		   int[] d = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		   for (i = 0;i < m;i++)
		   {
			   sum = sum + d[i];

		   }

		   System.out.printf("%d",sum + x);
		}
		return 0;
	}
}

