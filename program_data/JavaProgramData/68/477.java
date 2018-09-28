package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int m;
		int j;
		int k;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int n,n1,n2,N;
		int n;
		int n1;
		int n2;
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (N = 6;N <= n;N += 2)
		{
		System.out.printf("%u=",N);
		n1 = Math.sqrt(N);
		i = 2;
		n2 = N - 2;
		for (i = 2;i <= n1;i++)
		{
			if (n2 % i == 0)
			{
				i = n2;
			}
		}
		if (i < n2)
		{
			System.out.printf("2+%u\n",n2);
		}
		for (i = 3;i <= N / 2;i += 2)
		{
			n2 = N - i;
			if (n2 % 2 == 0)
			{
				break;
			}
			else
			{
				for (j = 3;j <= Math.sqrt(n2);j += 2)
				{
				if (n2 % j == 0)
				{
					j = n2 + 4;
				}
				}
			}
			if (i % 2 == 0)
			{
				break;
			}
			else
			{
				for (k = 3;k <= Math.sqrt(i);k += 2)
				{
				if (i % k == 0)
				{
					j = n2 + 4;
				}
				}
			}
			if (j <= n2)
			{
				System.out.printf("%d+%u\n",i,n2);
				break;
			}
		}
		}
	}
}

