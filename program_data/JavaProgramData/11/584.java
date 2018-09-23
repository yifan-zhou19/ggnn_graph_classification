package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int y;
	   int m;
	   int d;
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   y = Integer.parseInt(tempVar);
	   }
	   if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   m = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   d = Integer.parseInt(tempVar3);
		   }
		if (m == 1)
		{
			n = d;
		}
		if (m == 2)
		{
			n = 31 + d;
		}
		if (m == 3)
		{
			n = 31 + 29 + d;
		}
		if (m == 4)
		{
			n = 31 + 29 + d + 31;
		}
		if (m == 5)
		{
			n = 31 + 29 + d + 31 + 30;
		}
		if (m == 6)
		{
			n = 31 + 29 + d + 31 + 30 + 31;
		}
		if (m == 7)
		{
			n = 31 + 29 + d + 31 + 30 + 31 + 30;
		}
		if (m == 8)
		{
			n = 31 + 29 + d + 31 + 30 + 31 + 30 + 31;
		}
		if (m == 9)
		{
			n = 31 + 29 + d + 31 + 30 + 31 + 30 + 31 + 31;
		}
		if (m == 10)
		{
			n = 31 + 29 + d + 31 + 30 + 31 + 30 + 31 + 31 + 30;
		}
		if (m == 11)
		{
			n = 31 + 29 + d + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
		}
		if (m == 12)
		{
			n = 31 + 29 + d + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
		}
		System.out.printf("%d",n);

	   }
	   else
	   {
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   m = Integer.parseInt(tempVar4);
		   }
		   String tempVar5 = ConsoleInput.scanfRead();
		   if (tempVar5 != null)
		   {
			   d = Integer.parseInt(tempVar5);
		   }
		if (m == 1)
		{
			n = d;
		}
		if (m == 2)
		{
			n = 31 + d;
		}
		if (m == 3)
		{
			n = 31 + 28 + d;
		}
		if (m == 4)
		{
			n = 31 + 28 + d + 31;
		}
		if (m == 5)
		{
			n = 31 + 28 + d + 31 + 30;
		}
		if (m == 6)
		{
			n = 31 + 28 + d + 31 + 30 + 31;
		}
		if (m == 7)
		{
			n = 31 + 28 + d + 31 + 30 + 31 + 30;
		}
		if (m == 8)
		{
			n = 31 + 28 + d + 31 + 30 + 31 + 30 + 31;
		}
		if (m == 9)
		{
			n = 31 + 28 + d + 31 + 30 + 31 + 30 + 31 + 31;
		}
		if (m == 10)
		{
			n = 31 + 28 + d + 31 + 30 + 31 + 30 + 31 + 31 + 30;
		}
		if (m == 11)
		{
			n = 31 + 28 + d + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
		}
		if (m == 12)
		{
			n = 31 + 28 + d + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
		}
		System.out.printf("%d",n);

	   }
	   return 0;
	}
}

