package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y)
	{
		int k;
		if (x != 0 && y != 1)
		{
					  if (x >= y)
					  {
					  k = f(x, y - 1) + f(x - y, y);
					  }
					  else
					  {
					  k = f(x, y - 1);
					  }
		}
		else
		{
			if (x == 0)
			{
			k = 1;
			}
			if (y == 1)
			{
			k = 1;
			}
		}
		return k;
	}
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (int i = 1;i <= n;i++)
		  {
				  int x;
				  int y;
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
				  System.out.printf("%d\n",f(x, y));
		  }
	}

}

