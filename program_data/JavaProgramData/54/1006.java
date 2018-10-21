package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int apple = new int(int n,int k);
		int N;
		int K;
		int M;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			K = Integer.parseInt(tempVar2);
		}
		M = apple(N, K);
		System.out.printf("%d",M);
		return 0;
	}

	public static int apple(int n, int k)
	{
	int i;
	int last = 1;
	float m = 1F;
	int Z;
	   for (i = 0;i < 2 * n - 1;i++)
	   {
		   if (i % 2 == 0)
		   {
			  m = m * n + k;
		   }
			  else
			  {
					m = m / (n - 1);
					Z = m;
					if ((m - Z) != 0)
					{
					  last += 1;
					  m = last;
					  i = -1;
					  continue;
					}
			  }
	   }
	return (m);
	}


}

