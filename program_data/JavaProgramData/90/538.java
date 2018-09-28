package <missing>;

public class GlobalMembers
{
	/*???:???
	**???:??
	**?  ?:2010?12?5?
	*/
	public static int apple(int M, int N)
	{
		if (N == 1)
		{
			return 1; //??????,1???
		}
		else if (M < 0)
		{
			return 0; //???M - N < 0,??????,????1?????
		}
		else
		{
			return (apple(M, N - 1) + apple(M - N, N)); //????N???1,????????
		}
	}
	public static int Main()
	{
		int M;
		int N;
		int i;
		int t;
		int ways;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= t; i++)
		{
			M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ways = apple(M, N); //??
			System.out.print(ways);
			System.out.print("\n");
		}
			return 0;
	}
}

