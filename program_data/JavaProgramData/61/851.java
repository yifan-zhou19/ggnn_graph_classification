package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		if (x == 1 || x == 2)
		{
		  return 1;
		}
		else
		{
		 return (f(x - 1) + f(x - 2));
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int k;
		int m;
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
			  k = Integer.parseInt(tempVar2);
		  }
		  m = f(k);
		  System.out.printf("%d\n",m);
		}
		System.in.read();
		System.in.read();
	}

}

