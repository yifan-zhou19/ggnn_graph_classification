package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int n;
	public static int m;
	public static int max(int x,int y)
	{
		int c;
		if (y <= 0)
		{
			if (y == 0)
			{
			c = 1;
			}
			else
			{
			c = 0;
			}
		}
		else
		{
			if (x == 1)
			{
				c = 1;
			}
			else
			{
				c = max(x - 1, y) + max(x, y - x);
			}
		}
		return (c);
	}
	public static int Main()
	{
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  N = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= N;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  n = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  m = Integer.parseInt(tempVar3);
			  }
			  System.out.printf("%d\n",max(m, n));
		  }
	}
}

