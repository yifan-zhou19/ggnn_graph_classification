package <missing>;

public class GlobalMembers
{
	public static int zhishu(int n)
	{
		int m;
		int d;
		int i;
	m = (int)Math.sqrt(n);
	for (i = 2;i <= m;i++)
	{
		if (n % i == 0)
		{
	   break;
		}
	}
	if (i == m + 1)
	{
	   d = 1;
	}
	   else
	   {
	   d = 0;
	   }
	   return (d);
	}
	public static int Main()
	{
		  int p;
		  int m;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  for (p = 3;p <= m / 2;p++)
		  {
			  if ((zhishu(p) == 1) && (zhishu(m - p) == 1))
			  {
		  System.out.printf("%d %d\n",p,m - p);
			  }
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}




}

