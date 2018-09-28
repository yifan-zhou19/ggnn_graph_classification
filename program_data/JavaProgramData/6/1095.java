package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //?????
		int times; //???times???
		int[][] p = new int[200][200];
		int hang; //??????????
		int lie;
		int sum = 0; //????????????
		int i; //????
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (times = 0;times < n;times++)
		{
			hang = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			lie = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < hang;i++)
			{
				for (j = 0;j < lie;j++)
				{
					*(*(p + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (i = 0;i < hang;i = i + hang - 1)
			{
				for (j = 0;j < lie;j++)
				{
					sum = sum + *(*(p + i) + j);
				}
			}
			for (i = 0;i < hang;i++)
			{
				for (j = 0;j < lie;j = j + lie-1)
				{
					sum = sum + *(*(p + i) + j);
				}
			}
			sum = sum - * p - *(p + lie-1) - *(*(p + hang - 1)) - *(*(p + hang - 1) + lie-1);
			System.out.print(sum);
			System.out.print("\n");
	sum = 0;
		}
		return 0;
	}


}

