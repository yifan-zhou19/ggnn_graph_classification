package <missing>;

public class GlobalMembers
{
	/**
	* @file		????.cpp
	* @author	??	1000012792
	* @date		2010.12.3
	*/

	public static int f(int n, int m)
	{
		int i;
		int count = 0;
		if (n == 1)
		{
			return 1; //??n=1?????????1
		}
		for (i = m;i <= n;i++) //?????i?m?????n??
		{
			if (n % i == 0) //??n??i???????n/i????(???????i)???????f(n/i,i)
			{
				count += f(n / i, i); //count?????????
			}
		}
		return count; //??count??
	}
	public static int Main()
	{
		int n;
		int num;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(num, 2));
			System.out.print("\n");
		}
		return 0;
	}
}

