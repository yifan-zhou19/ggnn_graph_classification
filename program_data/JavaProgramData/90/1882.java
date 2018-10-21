package <missing>;

public class GlobalMembers
{
	public static int apple(int x, int y)
	{
		int a = 0;
		int b = 0;
		int result;
		if (x == 1 || y == 1)
		{
				 result = 1;
		}
		else
		{
			 if (x <= 0 || y <= 0)
			 {
							 return 0;
			 }
			 else if (x <= y)
			 {
					  y = x;
					  a = apple(x, y - 1);
					  result = 1 + a;
			 }
			 else
			 {
			 a = apple(x, y - 1);
			 b = apple(x - y, y);
			 result = a + b;
			 }
		}
		return result;
	}
	public static int Main()
	{
		int t;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
						 int M;
						 int N;
						 int K;
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
						 K = apple(M, N);
						 System.out.printf("%d\n",K);
		}
		return 0;
	}
}

