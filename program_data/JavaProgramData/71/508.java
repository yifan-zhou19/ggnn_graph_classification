package <missing>;

public class GlobalMembers
{
	 public static void Main()
	 {
		int y;
		int a;
		int b;
		int i;
		int j;
		int n;
		int days;
		int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		  days = 0;
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  y = Integer.parseInt(tempVar2);
	  }
	   if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
	   {
		   day[2] = 29;
	   }
	   else
	   {
		   day[2] = 28;
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a = Integer.parseInt(tempVar3);
	   }
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   b = Integer.parseInt(tempVar4);
	   }
	   if (a < b)
	   {
		   for (j = a;j < b;j++)
		   {
			days = days + day[j];
		   }
		if (days % 7 == 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	   }
	   if (a > b)
	   {
		   for (j = b;j < a;j++)
		   {
			days = days + day[j];
		   }
		if (days % 7 == 0)
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
}

