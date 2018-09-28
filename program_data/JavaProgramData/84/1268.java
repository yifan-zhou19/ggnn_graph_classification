package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int a;
	   int b;
	   int c;
	   int x;
	   int y;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  i = 1;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead("\n");
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }
		  if (a > b)
		  {
			  x = a,y = b;
		  }
		  else
		  {
			  x = b,y = a;
		  }
		  while (i <= n - 2)
		  {
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  c = Integer.parseInt(tempVar4);
		  }
		  if (c > x)
		  {
			  y = x,x = c;
		  }
		  else if (c < x && c> y)
		  {
			  x = x,y = c;
		  }
		  else if (c < y)
		  {
			  x = x,y = y;
		  }
		  i++;
		  }

		  System.out.printf("%d\n%d",x,y);


	   return 0;
	}

}

