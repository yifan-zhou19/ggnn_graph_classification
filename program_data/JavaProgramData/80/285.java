package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int total1 = 0;
		int total2 = 0;
		int t;
		int i;
		int e;
		int f;
		int x1;
		int x2;
	int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

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
	 String tempVar4 = ConsoleInput.scanfRead();
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
	 i = 0;
	 e = 0;
	 f = 0;
	 x1 = 0;
	 x2 = 0;


	for (i = 0;i < m1;i++)
	{
		 e = a[i] + e;
	}

	if (((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0)) && m1 > 2)
	{
	e = e+1;
	}

	 for (i = 0;i < m2;i++)
	 {
		 f = a[i] + f;
	 }

	 if (((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0)) && m2 > 2)
	 {
		 f = f + 1;
	 }





	for (i = 1;i < y1;i++)
	{
		 if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
		 {
		x1 = x1 + 366;
		 }
	else
	{
		x1 = x1 + 365;
	}
	}

	for (i = 1;i < y2;i++)
	{
		 if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
		 {
		x2 = x2 + 366;
		 }
	else
	{
		x2 = x2 + 365;
	}
	}

	 total1 = x1 + e + d1;
	 total2 = x2 + f + d2;

	 t = total2 - total1;

	 System.out.printf("%d\n",t);
	}


}

