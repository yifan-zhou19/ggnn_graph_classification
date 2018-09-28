package <missing>;

public class GlobalMembers
{
	public static int m(int x)
	{
		  int i;
		  int c = 0;
	   for (i = 2;i <= Math.sqrt(x);i++)
	   {
	   if (x % i == 0)
	   {
		   c = c + 1;
	   }
	   }
	  if (c == 0)
	  {
		  return (x);
	  }
	  else
	  {
		  return (0);
	  }
	}
	public static void f(int y)
	{
		int i;
		int a;
		int b;
	  int m = int x;
	  void p(int x,int y);
	  for (i = 2;i <= y;i++)
	  {
		a = m(i);
		b = m(y - i);
	   if (a + b == y)
	   {
		p(i, y - i);
		break;
	   }
	  }
	}
	public static void p(int x,int y)
	{
	 System.out.printf("%d=%d+%d\n",x + y,x,y);
	}
	public static int Main()
	{
		int a = 0;
		int n = 0;
		int i = 0;
	void f(int y);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 6;i <= n;i++)
	{
	   if (i % 2 == 0)
	   {
		   f(i);
	   }
	}
	}

}

