package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
		int i = 3;
		for (i = 2;i < n / 2 + 1;i++)
		{
	   if (n % i == 0)
	   {
		return (0);
	   }
		}
	 return (1);
	}
	public static int Main()
	{
	 int m;
	 int n;
	 int i;
	 int j;
	 int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 for (i = 3;i < (m / 2) + 1;i++)
	 {
		j = prime(i);
		k = m - i;
		n = prime(k);
		if (j != 0 && n != 0)
		{
		System.out.printf("%d %d\n",i,k);
		}

	 }
	  System.in.read();
	  System.in.read();
	}

}

