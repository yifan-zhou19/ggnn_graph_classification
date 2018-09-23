package <missing>;

public class GlobalMembers
{
	public static int f(int n,int i)
	{
		int sum = 0;
		for (i;i <= (int)Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				sum += f(n / i, i);
			}
		}
		return sum + 1;
	}
	public static int Main()
	{
		  int i0;
		  int n0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n0 = Integer.parseInt(tempVar);
		  }
		  for (i0 = 0;i0 < n0;i0++)
		  {
			  int n;
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  n = Integer.parseInt(tempVar2);
			  }
			  System.out.printf("%d\n",f(n, 2));
		  }
	}

}

