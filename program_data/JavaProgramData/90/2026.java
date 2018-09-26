package <missing>;

public class GlobalMembers
{
	//*************************************************
	//***????????***
	//***??????***
	//***???2012.1.11***
	//*************************************************

	public static int f(int a,int b)
	{
		if (b == 1 || a == 0 || a == 1)
		{
			return 1;
		}
		else if (a >= b != 0 && b > 1)
		{
			return f(a - b, b) + f(a, b - 1);
		}
		else if (b > 1 && a < b)
		{
			return f(a, a);
		}
	}

	public static int Main()
	{
		int t;
		int i;
		int M;
		int N;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < t; i++)
		{
			M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(M, N));
			System.out.print("\n");
		}
		return 0;
	}
}

