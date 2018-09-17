package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int a;
	int factor = new int(int N,int min);
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
			a = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d\n",factor(a, 2));
	}

	return 0;
	}
	public static int factor(int N,int min)
	{
		int i;
		int result;
		result = 1;

		if (N < min)
		{
			return 0;
		}
		for (i = min;i < N;i++)
		{
			if (N % i == 0)
			{
			  result += factor(N / i, i);
			}

		}
		return result;
	}

}

