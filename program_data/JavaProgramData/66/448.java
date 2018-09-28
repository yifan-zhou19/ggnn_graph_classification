package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int djt(int y, int m, int d);
	public static int Main()
	{
		int y;
		int m;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
	   int dst = 0;
	   int dsy = 0;
	   int sum = 0;
	   int wk;
	   for (int i = 1;i < m;i++)
	   {
		 if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
		 {
			 dst += 31;
		 }
		 else if (i == 4 || i == 6 || i == 9 || i == 11)
		 {
			 dst += 30;
		 }
		 else if (i == 2)
		 {
				if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
				{
					 dst += 29;
				}
				else
				{
					 dst += 28;
				}
		 }
	   }
		dsy = ((y - 1) * 1 + (y - 1) / 400 + (y - 1) / 4 - (y - 1) / 100);
		sum = d + dsy + dst;
		wk = sum % 7;
		if (wk == 1)
		{
		  System.out.print("Mon.");
		}
	   if (wk == 2)
	   {
		  System.out.print("Tue.");
	   }
	   if (wk == 3)
	   {
		  System.out.print("Wen.");
	   }
	   if (wk == 4)
	   {
		  System.out.print("Thu.");
	   }
	   if (wk == 5)
	   {
		  System.out.print("Fri.");
	   }
	   if (wk == 6)
	   {
		  System.out.print("Sat.");
	   }
	   if (wk == 0)
	   {
		  System.out.print("Sun.");
	   }
		return 0;
	}




}

