package <missing>;

public class GlobalMembers
{
	public static int Fibonacci(int n)
	{
		int s1;
		int s2;
		int s3;
		int i;
		if (n == 1)
		{
			return 1;
		}
		if (n == 2)
		{
			return 1;
		}
		s1 = 1;
		s2 = 1;
		for (i = 0;i < n - 2;i++)
		{
			s3 = s2 + s1;
			s1 = s2;
			s2 = s3;
		}
		return s3;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] sz = new int[20];
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
				j = Integer.parseInt(tempVar2);
			}
			sz[i] = Fibonacci(j);
			System.out.printf("%d\n",sz[i]);
		}
		return 0;
	}
}

