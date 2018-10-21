package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		if (x % 2 == 0)
		{
		  System.out.printf("%d/2=%d\n",x,x / 2);
		  return (x / 2);
		}
		else
		{
		  System.out.printf("%d*3+1=%d\n",x,x * 3 + 1);
		  return (x * 3 + 1);
		}
	}
	public static int Main()
	{
	  int x;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  x = Integer.parseInt(tempVar);
	  }
	  while (x != 1)
	  {
	   x = f(x);
	  }
	  if (x == 1)
	  {
	   System.out.print("End");
	  }
	  return 0;
	}


}

