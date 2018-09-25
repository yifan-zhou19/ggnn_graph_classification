package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}

		int[] m1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 0};
		int[] m2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 0};
		int y;
		int i;
		int j;
		int sum1 = 0;
		int sum2 = 0;
		int m;
		int d;
		int mm;
		for (l = 0;l < x;l++)
		{
			sum1 = sum2 = 0;
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
			mm = Integer.parseInt(tempVar4);
		}
		   if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		   {
			for (i = 0;i < m - 1;i++)
			{
				sum1 += m2[i];
			}
			for (i = 0;i < mm - 1;i++)
			{
				sum2 += m2[i];
			}
		   }
		 else
		 {
			for (i = 0;i < m - 1;i++)
			{
				sum1 += m1[i];
			}
			for (i = 0;i < mm - 1;i++)
			{
				sum2 += m1[i];
			}
		 }
		y = y - 1;
		sum1 = sum1 + y + y / 4 - y / 100 + y / 400;
		sum2 = sum2 + y + y / 4 - y / 100 + y / 400;
		j = (sum2 - sum1) % 7;

		   if (j == 0)
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

