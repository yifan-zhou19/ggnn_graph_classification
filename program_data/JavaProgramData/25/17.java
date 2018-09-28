package <missing>;

public class GlobalMembers
{
	/**
	* @file 1000012800_2.cpp
	* @author ??
	* @date 2010-12-15
	* @description
	* ??????:??2?N?? 
	*/
	public static int Main()
	{
		int n;
		int[] num = new int[100];
		int count = 0;
		num[0] = 1;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j <= count; j++)
			{
				num[j] *= 2;
			}
			for (int j = 0; j <= count; j++)
			{
				if ((num[j] / 10) != 0)
				{
					num[j + 1] += num[j] / 10;
					num[j] = num[j] % 10;
				}
			}
			if (num[count + 1] != 0)
			{
				count++;
			}

		}
		for (int i = count; i >= 0; i--)
		{
			System.out.print(num[i]);
		}
		System.out.print("\n");
		return 0;
	}

}

