package <missing>;

public class GlobalMembers
{
	/**
	* @file 1000012800_1.cpp
	* @author ??
	* @date 2010-11-24
	* @description
	* ??????:??
	*/

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			int time = 0;
			int count = 0;
			int[] counter = new int[21];
			int num;
			int flag = 1;
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0; j < num; j++)
			{
				counter[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int j = 0; j < num; j++)
			{
				time = counter[j] + 3 * (j + 1);
				if (time - 3 >= 60)
				{
					count = counter[j] - (time -63);
					flag = 0;
					break;
				}
				else if (time >= 60)
				{
					count = counter[j];
					flag = 0;
					break;
				}
				else
				{
					count = counter[j];
				}
			}
			if (flag != 0)
			{
				count += 60 - time;
			}
			System.out.print(count);
			System.out.print("\n");
		}





		return 0;
	}





}

