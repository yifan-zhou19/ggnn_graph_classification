package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y)
	{
	 if (x < y)
	 {
	  y = x;
	 }
	 if (x == 0)
	 {
	  return 1;
	 }
	 if (y == 1)
	 {
	  return 1;
	 }
	 if (x >= y)
	 {
	  return f(x, y - 1) + f(x - y, y);
	 }
	  return 0;
	}
	public static int Main()
	{
	 int t;
	 int n;
	 int m;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 t = Integer.parseInt(tempVar);
	 }
	 while (t-- != 0)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  n = Integer.parseInt(tempVar3);
	  }
	  System.out.printf("%d\n",f(m, n));
	 }
	}

}

