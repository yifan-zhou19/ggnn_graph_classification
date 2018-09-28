package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] number = new int[500]; //??????

		for (int i = 1 ; i <= n ; i++) //??
		{
			number[i - 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (int i = 1 ; i <= n - 1 ; i++) //?????
		{
			for (int j = 1 ; j <= n - i ; j++)
			{
				int change = 0;
				if (number[j - 1] > number[j])
				{
					 change = number[j - 1];
					 number[j - 1] = number[j];
					 number[j] = change;
				}
			}
		}

		int sum = 0; //???????????????????
		for (int i = 1 ; i <= n ; i++)
		{
			if (number[i - 1] % 2 == 1)
			{
			   sum++;
			}
		}

		int rank = 0; //??????????????
		for (int i = 1 ; i <= n ; i++) //??
		{
			if (number[i - 1] % 2 == 1)
			{
			   rank++; //rank = ??????????
			   if (rank == sum) //???????
			   {
				   System.out.print(number[i - 1]);
				   break; //?????????
			   }
			   else //??????????
			   {
				   System.out.print(number[i - 1]);
				   System.out.print(",");
			   }
			}
		}
		return 0;
	}
	// ( > w < ) finished~
}

