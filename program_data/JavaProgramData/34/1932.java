package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int N;
		  int a;
		  int odd = int x;
		  int even = int x;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  N = Integer.parseInt(tempVar);
		  }
		  while (N != 1)
		  {

			   if (N % 2 == 1)
			   {
						 a = N;
						 N = odd(N);
						 System.out.printf("%d*3+1=%d\n",a,N);
			   }
			   else
			   {
						 a = N;
						 N = even(N);
						 System.out.printf("%d/2=%d\n",a,N);
			   }
		  }
		  System.out.print("End\n");

	}

	public static int odd(int x)
	{
		int z;
		z = 3 * x + 1;
		return z;
	}

	public static int even(int x)
	{
		int y;
		y = x / 2;
		return y;
	}

}

