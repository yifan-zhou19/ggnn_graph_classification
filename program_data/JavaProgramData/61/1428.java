package <missing>;

public class GlobalMembers
{
	/*
	 *???: fibonacci.cpp
	 *??: ???
	 *????: 2012-10-13
	 *??: ?????????a??
	 */



	public static final int AMAX = 20;

	public static int Main()
	{
		int[] fib = new int[AMAX + 1]; //??????????20?
		fib[1] = fib[2] = 1;
		for (int i = 3;i <= AMAX;i++)
		{
			fib[i] = fib[i - 1] + fib[i - 2]; //??fib[i],i=3,4,...,20
		}

		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fib[a]);
			System.out.print("\n");
		}
		return 0;
	}



}

