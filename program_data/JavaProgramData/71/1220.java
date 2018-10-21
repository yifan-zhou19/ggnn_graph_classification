package <missing>;

public class GlobalMembers
{
	public static int rn(int y)
	{
		if (y % 4 == 0 && y % 100 != 0)
		{
			return 1;
		}
		if (y % 400 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
	  int n;
	  int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
		int y = 0;
		int m1;
		int m2;
		int a;
		int b;
		int d = 0;
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
			 if (m1 > m2)
			 {
				 a = m2;
				 m2 = m1;
				 m1 = a;
			 }
			 if (rn(y) == 1)
			 {
				 for (b = m1;b < m2;b++)
				 {
				   if (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10)
				   {
					   d += 31;
				   }
				   if (b == 2)
				   {
					   d += 29;
				   }
				   if (b == 4 || b == 6 || b == 9 || b == 11)
				   {
					   d += 30;
				   }
				 }
			 }
			 if (rn(y) == 0)
			 {
				 for (b = m1;b < m2;b++)
				 {
				   if (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10)
				   {
					   d += 31;
				   }
				   if (b == 2)
				   {
					   d += 28;
				   }
				   if (b == 4 || b == 6 || b == 9 || b == 11)
				   {
					   d += 30;
				   }
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

