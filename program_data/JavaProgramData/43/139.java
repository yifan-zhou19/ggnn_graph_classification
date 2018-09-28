package <missing>;

public class GlobalMembers
{
	public static int yes(int n)
	{
		int m;
		int i;
		m = (int)Math.sqrt(n);
		for (i = 3;i <= m;i += 2)
		{
		   if (n % i == 0)
		   {
		   return 0;
		   }
		}
		return 1;
	}
	public static int Main()
	{
		  int m;
		  int n;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 3;i <= n / 2;i += 2)
		  {
						  if (yes(i) != 0 && yes(n - i) != 0)
						  {

									System.out.printf("%d %d\n",i,n - i);
						  }
		  }
		  System.in.read();
		  System.in.read();
	}

}

