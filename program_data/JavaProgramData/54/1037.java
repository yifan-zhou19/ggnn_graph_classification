package <missing>;

public class GlobalMembers
{
	public static int f(int n,int k)
	{
	 int m;
	 int i = 1;
		 m = n * (Math.pow(n - 1,n - 1) - k) + k;
		while (i < n)
		{
		 m = m / (n - 1) * n + k;

		 i++;
		}
		return m;

	}
	public static void Main(String[] args)
	{
		int n;
		int k;
		int i = 1;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}

		System.out.printf("%d",f(n, k));
	}


}

