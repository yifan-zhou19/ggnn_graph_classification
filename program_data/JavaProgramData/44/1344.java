package <missing>;

public class GlobalMembers
{
	public static int fxs(int x)
	{
	  int i;
	  int y = 0;
	  for (i = 10;x != 0;)
	  {
		y = y * 10 + x % i;
		x = x / i;
	  }
	  return y;
	}
	public static int Main()
	{
	 for (int i = 1;i <= 6;i++)
	 {
	   int a;
	   int b;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Integer.parseInt(tempVar);
	   }
	   b = fxs(a);
	   System.out.printf("%d\n",b);
	 }
	}

}

