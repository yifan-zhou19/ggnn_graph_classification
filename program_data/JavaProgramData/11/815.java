package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int leap = int x;
		  int a;
		  int b;
		  int c;
		  int t;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  b = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  c = Integer.parseInt(tempVar3);
		  }
		  t = 0;
		  if (leap(a) == 1)
		  {
					   for (i = 1;i < b;i++)
					   {
					   if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					   {
					   t = t + 31;
					   }
					   if (i == 2)
					   {
					   t = t + 29;
					   }
					   if (i == 4 || i == 6 || i == 9 || i == 11)
					   {
					   t = t + 30;
					   }
					   }
					   t = t + c;
			  System.out.printf("%d",t);
		  }
		  if (leap(a) == 0)
		  {
				 for (i = 1;i < b;i++)
				 {
					   if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					   {
					   t = t + 31;
					   }
					   if (i == 2)
					   {
					   t = t + 28;
					   }
					   if (i == 4 || i == 6 || i == 9 || i == 11)
					   {
					   t = t + 30;
					   }
				 }
					   t = t + c;
				 System.out.printf("%d",t);
		  }
					  System.in.read();
					  System.in.read();
	}
	public static int leap(int x)
	{
		int leap;
		if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0))
		{
		   leap = 1;
		}
		else
		{
		   leap = 0;
		}
		return leap;
	}


}

