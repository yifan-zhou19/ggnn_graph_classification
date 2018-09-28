package <missing>;

public class GlobalMembers
{
	public static int ss(int x)
	{
		int i;
		int a;
		i = 2;
		a = 1;
		while (i < x && a != 0)
		{
						a = x % i;
						i++;
		}
		return (a);
	}
	public static int Main()
	{
		  int n;
		  int m;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  m = 3;
		  if (n <= 4)
		  {
		  System.out.print("empty");
		  }
		  while (m <= n - 2)
		  {
					   if (ss(m) != 0 && ss(m + 2) != 0)
					   {
					   System.out.printf("%d %d\n",m,m + 2);
					   }
					   m++;
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

