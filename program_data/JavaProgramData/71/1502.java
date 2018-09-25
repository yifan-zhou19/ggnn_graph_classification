package <missing>;

public class GlobalMembers
{
	public static int runnian(int y)
	{
		 int t = 0;
		if (y % 400 == 0 || y % 4 == 0 && y % 100 != 0)
		{
			t = 1;
		}
		return t;
	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		int y;
		int m1;
		int m2;
		int t;
		int days;
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
			   y = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   m1 = Integer.parseInt(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead(" ");
		   if (tempVar4 != null)
		   {
			   m2 = Integer.parseInt(tempVar4);
		   }
		   days = 0;
		  if (m1 > m2)
		  {
			   t = m2;
			m2 = m1;
			m1 = t;
		  }
			 if (runnian(y) == 1)
			 {
			   for (j = m1;j < m2;j++)
			   {
					if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
					{
					days += 31;
					}
					if (j == 2)
					{
					days += 29;
					}
					if (j == 4 || j == 6 || j == 9 || j == 11)
					{
					days += 30;
					}
			   }
			 }
			  if (runnian(y) == 0)
			  {
				for (j = m1;j < m2;j++)
				{
				if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
				{
				 days += 31;
				}
				 if (j == 2)
				 {
				 days += 28;
				 }
				 if (j == 4 || j == 6 || j == 9 || j == 11)
				 {
				 days += 30;
				 }
				}
			  }
			  if (days % 7 == 0)
			  {
			  System.out.print("YES\n");
			  }
			  if (days % 7 != 0)
			  {
			  System.out.print("NO\n");
			  }
		}
		   System.in.read();
		   System.in.read();
		   return 0;
	}

}

