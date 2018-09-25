package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????? 1300012733 **
	//*???2013?11?29?
	//********************************
	//????
	public static int N;
	public static int M;
	public static int c = 0;
	public static int[] plate = new int[11];
	//????????????
	public static void Put(int k, int num)
	{
		if ((k == N) && (num >= plate[N - 1]))
		{
			c++;
			return;
		}
		for (int i = plate[k - 1]; i <= num; i++)
		{
			plate[k] = i;
			Put(k + 1, num - i);
		}
	}
	public static int Main()
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= t; i++)
		{
			M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = 0;
			//????
			Put(1, M);
			System.out.print(c);
			System.out.print("\n");
		}
		return 0;
	}
}

