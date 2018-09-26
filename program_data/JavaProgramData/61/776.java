package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int c;
		if (n == 1 || n == 2)
		{
		c = 1;
		}
		else
		{
		c = f(n - 1) + f(n - 2);
		}
		return (c);
	}
	public static int Main()
	{
		  int n;
		  int i;
		  int m;
		  int f = int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 m = Integer.parseInt(tempVar2);
				 }
				 System.out.printf("%d\n",f(m));
		  }
		  System.in.read();
		  System.in.read();
	}
}

