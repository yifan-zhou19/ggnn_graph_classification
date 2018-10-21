package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int x;
	   int y;
	   int i = 1;
	   int k = 0;
	   int l = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   while (i <= n)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  x = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  y = Integer.parseInt(tempVar3);
		  }
		  if (x >= 90 && x <= 140 && y >= 60 && y <= 90)
		  {
			 k++;
		  }
		  else
		  {
			 k = 0;
		  }
		  if (k > l)
		  {
			 l = k;
		  }
		  i++;
	   }
	   System.out.printf("%d",l);
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   n = Integer.parseInt(tempVar4);
	   }
	   return 0;
	}
}

