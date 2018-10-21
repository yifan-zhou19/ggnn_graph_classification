package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int x;
	   int y;
	   int k;
	   int m;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   i = 1;
	   k = 0;
	   m = k;
	   while (i <= n)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   x = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   y = Integer.parseInt(tempVar3);
	   }
	   if (x >= 90 && x <= 140 && y >= 60 && y <= 90)
	   {
	   k += 1;
	   }
	   else
	   {
	   k = 0;
	   }
	   if (k > m)
	   {
	   m = k;
	   }
	   i = i + 1;
	   }
	  System.out.printf("%d",m);
	  return 0;
	}


}

