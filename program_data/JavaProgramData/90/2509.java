package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int full = new int(int a,int b);
	int notfull = new int(int c,int d);
	int i;
	int m;
	int apple;
	int plate;
	int ways = new int(int M,int N);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= m;i++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 apple = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 plate = Integer.parseInt(tempVar3);
	 }
	 System.out.printf("%d\n",ways(apple, plate));
	}

	}

	public static int ways(int M,int N)
	{
	int full = new int(int a,int b);
	int notfull = new int(int c,int d);
	int i;
	int j;
	int k;
	int number;
	if (N > 1)
	{
		 if (M > N)
		 {
		 number = full(M, N) + notfull(M, N);
		 }
	   else if (M == N)
	   {
		 number = full(M, N) + notfull(M, N);
	   }
	   else if (N > M > 0)
	   {
		   number = ways(M, M);
	   }
	}
	if (N == 1)
	{
		number = 1;
	}
	if (M == 0)
	{
		number = 1;
	}
	return (number);

	}

	public static int full(int a,int b)
	{
	int f;
	f = ways((a - b), b);
	return (f);
	}

	public static int notfull(int c,int d)
	{
	int l;
	l = ways(c, (d - 1));
	return (l);
	}

}

