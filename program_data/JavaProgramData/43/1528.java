package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int i;
		int a;
		a = Math.sqrt(n);
		for (i = 2;i <= a;i++)
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
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 3;i <= (n / 2);i++)
		{

			  if (f(i) != 0 && f(n - i) != 0)
			  {
				  System.out.printf("%d %d\n",i,(n - i));
			  }
		}
		System.in.read();
		System.in.read();
		System.in.read();
	}



}

