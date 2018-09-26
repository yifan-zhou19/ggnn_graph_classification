package <missing>;

public class GlobalMembers
{
	//********************************
	//*????1.cpp   **
	//*?????? 1300012966 **
	//*???2013.12.05  **
	//*????????   **
	//********************************
	public static int i;
	public static int n;
	public static int k;
	public static int f(int m)
	{
		if (i < n)
		{
			if (m % (n - 1) != 0)
			{
				return 0;
			}
			i++;
			return f(m * n / (n - 1) + k);
		}
		return m;
	}
	public static int Main()
	{
		int j = 0;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			i = 1;
			j++;
			m = f(j * n + k);
		} while (m == 0);
		System.out.print(m);
		System.out.print("\n");

		return 0;
	}
}

