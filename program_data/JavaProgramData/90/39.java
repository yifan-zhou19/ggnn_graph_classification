package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int m,int n);

		int M;
		int N;
		int K;
		int t;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				M = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				N = Integer.parseInt(tempVar3);
			}
			K = f(M, N);
			System.out.printf("%d\n",K);
		}

	}
	public static int f(int m,int n)
	{

		int z;
		z = 0;
		if (n == 1 || m == 0 || m == 1)
		{
			z = 1;
		}
		else
		{
			if (m < n)
			{
			 n = m;
			}
			  z = f(m - n, n) + f(m, n - 1);
		}
			return z;
	}


}

