package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int n;
		if (x == 1 || x == 2)
		{
		   n = 1;
		}
		else
		{
		   n = f(x - 1) + f(x - 2);
		}
		return n;
	}
	public static int Main()
	{
		  int n;
		  int x;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int i;
		  int j;
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  x = Integer.parseInt(tempVar2);
						  }
						  System.out.printf("%d\n",f(x));
		  }
	}


}

