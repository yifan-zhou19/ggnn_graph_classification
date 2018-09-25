package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int i;
		int j;
		int t;
		int p;
		int x1;
		int x2;
		int x3;
	int[] e = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   y1 = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   m1 = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   d1 = Integer.parseInt(tempVar3);
	   }
	   String tempVar4 = ConsoleInput.scanfRead("\n");
	   if (tempVar4 != null)
	   {
		   y2 = Integer.parseInt(tempVar4);
	   }
	   String tempVar5 = ConsoleInput.scanfRead();
	   if (tempVar5 != null)
	   {
		   m2 = Integer.parseInt(tempVar5);
	   }
	   String tempVar6 = ConsoleInput.scanfRead();
	   if (tempVar6 != null)
	   {
		   d2 = Integer.parseInt(tempVar6);
	   }

	   if (y1 < y2)
	   {
		   t = y1;
		   y1 = y2;
		   y2 = t;
		   t = m1;
		   m1 = m2;
		   m2 = t;
		   t = d1;
		   d1 = d2;
		   d2 = t;
	   }
	   for (i = y2,p = 0;i < y1;i++)
	   {
		   if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
		   {
			   p++;
		   }
	   }
	   x1 = 365 * (y1 - y2) + p;

	   t = 0;
		if (((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0)) && m1 > 2)
		{
			t = 1;
		}
		x2 = e[m1] + d1 + t;

		t = 0;
		if (((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0)) && m2 > 2)
		{
			t = 1;
		}
		x3 = e[m2] + d2 + t;

	   x1 = x1 + x2 - x3;
	   if (x1 < 0)
	   {
		   x1 = -x1;
	   }
	   System.out.printf("%d\n",x1);

	return 0;
	}


}

