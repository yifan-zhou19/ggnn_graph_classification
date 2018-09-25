package <missing>;

public class GlobalMembers
{
	//********************************
	//*???1.cpp   **
	//*?????? 1200012768 **
	//*???2012.11.28  **
	//*???????  **
	//********************************
	public static int fun(int n, int m)
	{
		int sum = 1; //n??????????
		double t = Math.sqrt(n);
		for (int i = m; i <= t; i++) //???????????????t
		{
			if (n % i == 0) //???i?n???????????
			{
				sum += fun(n / i, i);
			}
		}
		return sum;
	}
	public static int Main()
	{
		int n;
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fun(num, 2));
			System.out.print("\n");
		}
		return 0;
	}
}

