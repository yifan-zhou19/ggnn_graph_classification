package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int x;
	  int y;
	  int z;
	  int i;
	  int n;
	  int a;
	  int b;
	  int c;
	  z = 0;
	  a = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
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
	   z++;
	   }
	   else
	   {
		   z = 0;
	   }
	   if (z >= a)
	   {
		   a = z;
	   }
	  }
	  System.out.printf("%d",a);
	   return 0;
	}
}

