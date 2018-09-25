package <missing>;

public class GlobalMembers
{
	/*               ????
	??????         2010.11.24          */

	public static int Main()
	{
		int n;
		int count2;
		int count1;
		int i;
		int j;
		int[] stop = new int[30];
		int[][] num = new int[3000][30];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		count2 = 0;
		while (count2 < n) //count2?????????????
		{
			stop[count2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			count1 = 0; //count1?????????????
			while (count1 < stop[count2])
			{
				num[count2][count1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				count1++;
			}
			count2++;
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < stop[i]; j++)
			{
				if (num[i][j] + 3 * (j + 1) > 60)
				{
					break; //????????
				}
			}
			if (j == stop[i])
			{
				System.out.print(60 - 3 * stop[i]);
			}
			else
			{
				if (num[i][j] + 3 * (j + 1) > 63)
				{
					System.out.print(60 - 3 * j);
				}
				else //??????????????
				{
					System.out.print(num[i][j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}

