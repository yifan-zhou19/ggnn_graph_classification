package <missing>;

public class GlobalMembers
{
	/**
	 *  ????buchongfushu.cpp
	 *  ?????????
	 *  ??????
	 *  ???2010.10.30
	 */


	public static int Main()
	{
		int n;
		int i;
		int j;
		int number;
		int[] a = new int[100]; //??????????????

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;
		for (j = 1 ; j <= n ; j++)
		{
			number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[number] == 0) //????????????
			{
				a[number]++;
				if (i == 0) //????????????
				{
					System.out.print(number);
					i = 1;
				}
				else
				{
					System.out.print(" ");
					System.out.print(number);
				}
			}
		}
		return 0;
	}

}

