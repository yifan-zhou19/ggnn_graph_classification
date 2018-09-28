package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
			int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int x1;
		int x2;
		int x3;
		int y1;
		int y2;
		int y3;
		int d1 = 0;
		int d2 = 0;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			x2 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			x3 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			y1 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			y3 = Integer.parseInt(tempVar6);
		}
		if ((x1 % 4 == 0 && x1 % 100 != 0) || (x1 % 400 == 0))
		{
		day[2] = 29;
		}
		else
		{
		day[2] = 28;
		}
		for (i = 1;i <= (x2 - 1);i++)
		{
			d1 = d1 + day[i];
		}
		d1 = d1 + x3;
		if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
		{
		day[2] = 29;
		}
		else
		{
		day[2] = 28;
		}
		for (i = 1;i <= (y2 - 1);i++)
		{
			d2 = d2 + day[i];
		}
		d2 = d2 + y3;
		for (i = 1;i <= (x1 - 1);i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
		d1 = d1 + 366;
			}
		else
		{
		d1 = d1 + 365;
		}
		}
	  for (i = 1;i <= (y1 - 1);i++)
	  {
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
		d2 = d2 + 366;
			}
		else
		{
		d2 = d2 + 365;
		}
	  }
		 if (d1 >= d2)
		 {
		  d = d1 - d2;
		 }
		  else
		  {
		  d = d2 - d1;
		  }
	   System.out.printf("%d",d);
	   return 0;
		}
}

