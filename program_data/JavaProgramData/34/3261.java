package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  void jiaogu(int n);
	  int m;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  jiaogu(m);
	}

	public static void jiaogu(int n)
	{
	   void shizi(int x);
	   if (n == 1)
	   {
	   System.out.print("End");
	   }
	   if (n % 2 == 0)
	   {
		   shizi(n);
		jiaogu(n / 2);
	   }
	   if (n % 2 != 0 && n != 1)
	   {
		   shizi(n);
	   jiaogu(n * 3 + 1);
	   }

	}
	public static void shizi(int x)
	{
		int y;
	   if (x % 2 == 0)
	   {
		   y = x / 2;
	   System.out.printf("%d/2=%d\n",x,y);
	   }
	  if (x % 2 != 0)
	  {
		  y = (x * 3 + 1);
	   System.out.printf("%d*3+1=%d\n",x,y);
	  }
	}

}

