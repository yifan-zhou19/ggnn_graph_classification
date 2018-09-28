package <missing>;

public class GlobalMembers
{
	public static void jiao(int n)
	{
		int m;
		int k;
		if (n == 1)
		{
			System.out.print("End\n");
		}
		if (n != 1)
		{
			if (n % 2 != 0)
			{
				m = n * 3 + 1;
				System.out.printf("%d*3+1=%d\n",n,m);
				jiao(m);
			}
			if (n % 2 == 0)
			{
				k = n / 2;
				System.out.printf("%d/2=%d\n",n,k);
				jiao(k);
			}
		}
	}
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		jiao(n);
	}


}

