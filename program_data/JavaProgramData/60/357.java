package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int i = 2;
		int k = 0;
		for (i = 2;i < n;i++)
		{
		  if (n % i == 0)
		  {
		  k++;
		  }
		}
		  if (k == 0)
		  {
		  return (0);
		  }
		  else
		  {
		  return (1);
		  }

	}
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
		System.out.print("empty\n");
		}
		else
		{
		for (i = 5;i <= n;i++)
		{
			 t = i - 2;
		  if (f(i) == 0 && f(t) == 0)
		  {
			 //t=i-2;                   
			 System.out.printf("%d %d\n",t,i);
			 sum++;
		  }
		}

		if (sum == 0)
		{
		System.out.print("empty\n");
		}
		}
		System.in.read();
		System.in.read();
	}

}

