package <missing>;

public class GlobalMembers
{
	/*
	 * ????1000012855_26.cpp
	 * ??????
	 * ????n: 2010-10-29
	 * ??????????
	 */
	public static int Main()
	{
		int a = 0; //???????
		int n = 0;
		int m = 0;
		int i = 0;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = n; //??????
		int[] num = new int[n]; //?????
		for (;i < n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < k;i++)
		{ //??????????
			for (m = i + 1;m < k;m++)
			{
				if (num[m] == num[i])
				{
					for (a = m;a < k;a++)
					{
						num[a] = num[a + 1];
					}
					k--; //????????????????????????
					m--;
				}
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.print(num[i]);
			System.out.print(" ");
		}
		System.out.print(num[k - 1]);
		System.out.print("\n");
		return 0;
	}

}

