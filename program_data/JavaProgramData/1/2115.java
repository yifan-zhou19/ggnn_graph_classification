package <missing>;

public class GlobalMembers
{
	public static int count;

	public static void fun(int i, int j)
	{
		int k;
		for (k = i; k <= Math.sqrt(j); k++)
		{
			if (j % k == 0)
			{
				count++;
				fun(k, j / k);
			}
		}
	}
	public static int Main()
	{
		 int N;
		 int turn;
		 int c;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  turn = Integer.parseInt(tempVar);
		  }
		  for (c = 1;c <= turn;c++)
		  {
		int n;
		int i;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 2; i <= Math.sqrt(n); i++)
		{
			if (n % i == 0)
			{
				count++;
				fun(i, n / i);
			}
		}
		System.out.printf("%d\n",count + 1);
		count = 0;
		  }

	}

}

