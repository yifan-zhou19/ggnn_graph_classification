package <missing>;

public class GlobalMembers
{
	public static int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int Main()
	{
		int y1;
		int m1;
		int d1;
	 int y2;
	 int m2;
	 int d2;
	int sum = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 y1 = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 m1 = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 d1 = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 y2 = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead(" ");
		 if (tempVar5 != null)
		 {
			 m2 = Integer.parseInt(tempVar5);
		 }
		 String tempVar6 = ConsoleInput.scanfRead(" ");
		 if (tempVar6 != null)
		 {
			 d2 = Integer.parseInt(tempVar6);
		 }
		 m1 = m1 - 1;
		 m2 = m2 - 1;
			 for (;;)
			 {
		if (y1 == y2 && m1 == m2 && d1 == d2)
		{
						   break;
		}
	sum++;
	d1++;
		   if ((y1 % 4 == 0 && y1 % 100 != 0) || y1 % 400 == 0)
		   {
						month[1] = 29;
		   }
			 else
			 {
						 month[1] = 28;
			 }
			if (d1 > month[m1])
			{
					   m1++;
					   d1 = 1;
			}
			  if (m1 == 12)
			  {
				  y1++;
					m1 = 0;
			  }


			 }
	System.out.printf("%d",sum);

	}

}

