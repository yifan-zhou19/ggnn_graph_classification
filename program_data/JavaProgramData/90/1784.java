package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int M;
		int N;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int f = new int(int x, int y);
		for (i = 0;i < t;i++)
		{
			M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(M, N));
			System.out.print("\n");
		}
		return 0;
	}
	public static int f(int x, int y) //?????
	{
		int num;
		int m;
		int n;
		if (y == 1 || x == 0) //????????????????1
		{
			return 1;
		}
		else if (y != 1 && x != 0 && x < y) //?????????,???????
		{
			return (f(x, y - 1));
		}
		else
		{
		return (f(x, y - 1) + f(x - y, y)); //?????????
		}
	}
}

