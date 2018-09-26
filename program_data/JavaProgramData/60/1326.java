package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	int n;
	int N;
	int M;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
		System.out.print("empty");
		}
	if (n >= 5)
	{
		for (a = 5;a <= n;a++)
		{
		   b = a - 2;
		   N = a;
		   M = b;
		   double p;
		   double q;
		   p = Math.sqrt(a);
		   q = Math.sqrt(b);
		for (c = 2;c <= p;c++)

		{
		   if ((a % c) == 0)
		   {
			   a = a + 1;
		   }
		   else
		   {
			   a = a;
		   }
		}

		for (e = 2;e <= q;e++)

		{
		   if ((b % e) == 0)
		   {
			   b = b + 1;
		   }
		   else
		   {
			   b = b;
		   }
		}
		   if (a == N && b == M)
		   {
		   System.out.printf("%d %d\n",b,a);
		   }
		   a = N;
		  b = M;
		}
	}
	}
}

