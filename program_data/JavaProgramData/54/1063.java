package <missing>;

public class GlobalMembers
{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int apple(unsigned int N,unsigned int K);
	public static int apple(int N, int K)
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i,j,l;
		int i;
		int j;
		int l;
		for (i = 1;;i++)
		{
			j = i;
			for (l = 1;l < N;l++)
			{
				if ((j * N + K) % (N - 1) == 0)
				{
					j = (j * N + K) / (N - 1);
				}
				else
				{
					break;
				}
			}
		if (l == N)
		{
			break;
		}
		}
		return j;
	}
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int m,n,k,J;
		int m;
		int n;
		int k;
		int J;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		J = apple(n, k);
		m = J * n + k;
		System.out.printf("%u",m);
		return 0;
	}
}

