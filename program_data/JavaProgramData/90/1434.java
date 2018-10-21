package <missing>;

public class GlobalMembers
{
	public static int apple(int m,int n)
	{
		int K;
		if (m == 0)
		{
			K = 1;
		}
		if (n == 1)
		{
			K = 1;
		}
		else if (m >= n)
		{
			K = apple(m, n - 1) + apple(m - n, n);
		}
		else if (m < n)
		{
			K = apple(m, n - 1);
		}
		return (K);
	}
	public static int Main()
	{
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *M,*N;
		int M;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *N;
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		M = (int)malloc(t * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		N = (int)malloc(t * (Integer.SIZE / Byte.SIZE));
		for (int i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				M + i = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				N + i = Integer.parseInt(tempVar3);
			}
		}
		for (int i = 0;i < t;i++)
		{
			System.out.printf("%d\n",apple(M[i], N[i]));
		}
		return 0;
	}
}

