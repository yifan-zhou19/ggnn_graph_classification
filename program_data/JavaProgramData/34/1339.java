package <missing>;

public class GlobalMembers
{
	/* ????.cpp
	 *  Created on: 2012-11-20
	 *      Author: ??
	 */
	public static int ans(int n)
	{
		if (n == 1)
		{
			return 0;
		}
		if (n % 2 == 0)
		{
			System.out.print(n);
			System.out.print("/2=");
			System.out.print(n / 2);
			System.out.print("\n");
			return ans(n / 2); //??
		}
		else
		{
			System.out.print(n);
			System.out.print("*3+1=");
			System.out.print(n * 3 + 1);
			System.out.print("\n");
			return ans(n * 3 + 1); //??
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ans(n);
		System.out.print("End");
		return 0;
	}

}

