package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : ex5.13.cpp
	// Author      : Zhang Yu
	// Version     :
	// Copyright   : Your copyright notice
	// Description : ????
	//============================================================================


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 1;j <= n;++j)
		{
			int breaktime; //???????
			breaktime = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (breaktime == 0) //???????
			{
				System.out.print("60");
				System.out.print("\n");
			}
			else //?????
			{
				int[] a = new int[breaktime];
				for (int i = 0;i <= breaktime-1;++i)
				{
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				int sum = 0; //?????????
				int k = 0; //?????????
				for (int i = 1;i <= 60;++i) //??????
				{
					if (a[k] == i) //??????????
					{
						++sum;
						++k;
						i = i + 3;
						for (int p = k;p <= breaktime-1;++p)
						{
							a[p] += 3;
						}
					}
					else //????????
					{
						++sum;
					}
				}
				System.out.print(sum);
				System.out.print("\n");
			}

		}

		return 0;
	}

}

