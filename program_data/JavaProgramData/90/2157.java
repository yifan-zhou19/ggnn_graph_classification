package <missing>;

public class GlobalMembers
{
	public static int fact(int a,int b)
	{
		if ((a < 1) || (b < 1))
		{
			return 0;
		}
		if ((a == 1) || (b == 1))
		{
			return 1;
		}
		if (a < b)
		{
			return fact(a, a);
		}
		if (a == b)
		{
			return fact(a, b - 1) + 1;
		}
		if (a > b)
		{
			return fact(a, b - 1) + fact(a - b, b);
		}
	}
	public static int Main()
	{
		  int t;
		  int m;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  while (t-- != 0)
		  {
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						m = Integer.parseInt(tempVar2);
					}
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						n = Integer.parseInt(tempVar3);
					}
					System.out.printf("%d\n",fact(m, n));
		  }





	return 0;
	}

}

