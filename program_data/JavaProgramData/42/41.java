package <missing>;

public class GlobalMembers
{
	/**
	* @file 1000012800_2.cpp
	* @author ??
	* @date 2010-10-27
	* @description
	* ??????:????
	*/

	public static int Main()
	{
		int n;
		int i = 0;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[100000];
		for (; i < n; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			if (m == num[i])
			{
				int j = i;
				for (; j < n - 1; j++)
				{
					num[j] = num[j + 1];
				}
				n--;
				i--;
			}
		}

		System.out.print(num[0]);
		for (i = 1; i <= (n - 1); i++)
		{
			System.out.print(" ");
			System.out.print(num[i]);
		}
		System.out.print("\n");
		return 0;
	}

}

