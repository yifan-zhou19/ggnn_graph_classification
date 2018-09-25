package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int full = new int(int M,int N);
	int empty = new int(int M,int N);
	int t;
	int[] a = new int[20];
	int[] b = new int[20];
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
		a[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < t;i++)
	{
		System.out.printf("%d\n",full(a[i], b[i]) + empty(a[i], b[i]));
	}
	}
	public static int full(int M,int N)
	{
		int empty = new int(int M,int N);
	int c;
	if (N == 1)
	{
	c = 1;
	}
	else
	{
	if (M < N)
	{
	c = 0;
	}
	else
	{
	if (M == N)
	{
	c = 1;
	}
	else
	{
	if (M > N)
	{
	c = full(M - N, N) + empty(M - N, N);
	}
	}
	}
	}
	return (c);
	}
	public static int empty(int M,int N)
	{
		int full = new int(int M,int N);
	int c;
	if (N == 1)
	{
	c = 0;
	}
	else
	{
	if (N == 2)
	{
	c = 1;
	}
	else
	{
	c = full(M, N - 1) + empty(M, N - 1);
	}
	}
	return (c);
	}

}

