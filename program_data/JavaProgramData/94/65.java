package <missing>;

public class GlobalMembers
{
	/**
	* @file 1000012800_1.cpp
	* @author ??
	* @date 2010-11-18
	* @description
	* ??????:????
	*/


	public static int Main()
	{
		int n;
		int[] num = new int[500];
		int tmp;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0; i < n; i++)
		{
			for (int j = n - 1; j > i; j--)
			{
				if (num[j] < num[j - 1])
				{
					tmp = num[j];
					num[j] = num[j - 1];
					num[j - 1] = tmp;
				}
			}
		}
		for (int i = 0; i < n; i++)
		{
			if (num[i] % 2 != 0)
			{
				if (flag == 0)
				{
					System.out.print(num[i]);
				}
				else
				{
					System.out.print(",");
					System.out.print(num[i]);
				}
				flag++;
			}
		}
		System.out.print("\n");

			return 0;
	}


}

