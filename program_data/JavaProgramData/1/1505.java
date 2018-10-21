package <missing>;

public class GlobalMembers
{
	//*********************************
	//* file?1.cpp
	//* description: ????
	//* author: ?? 1200012858		
	//* date: 2012-12-1
	//*********************************
	public static int decompose(int x, int y)
	{
		int sum = 1;
		int b;
		b = (int)Math.sqrt(x);
		if (x == 1)
		{
			return 0;
		}
		for (int i = y; i <= b; i++)
		{
			if (x % i == 0)
			{
				 sum = sum + decompose(x / i, i);
			}
		}
		return sum;
	}
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 1; j <= n; j++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(decompose(m, 2));
			System.out.print("\n");
		}
		return 0;
	}

}

