package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int a;
		  int b;
		  int c;
		  int d;
		  int x;
		  int y;
		  int f = int a;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  c = n / 2;
		  for (b = 3;b <= c;b++)
		  {
				d = n - b;
				x = f(b);
				y = f(d);
				if (x == 2 && y == 2)
				{
				System.out.printf("%d %d\n",b,d);
				}
		  }
	}
	public static int f(int a)
	{
		int i;
		int e = 0;
		for (i = 1;i <= a;i++)
		{
			  if (a % i == 0)
			  {
			  e = e+1;
			  }
		}
		return (e);
	}

}

