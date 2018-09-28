package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int N; //N????N??, i?????
		 int i = 1;
		int[] result = new int[40]; //result????,2?100??????40??

		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		result[0] = 1; //2?0???1

		while (i <= N)
		{
			   for (int j = 0; j < 39; j++)
			   {
						result[j] *= 2; //?????2
			   }

			   for (int k = 0; k < 39; k++)
			   {
						if (result[k] >= 10)
						{
						 result[k + 1] += result[k] / 10; //??
					 result[k] %= 10; //?????????
						}
			   }
				i++;
		}

		 i = 39; //??????????????????result

		while (result[i] == 0)
		{
				i--; //???????
		}

		for (int k = i; k >= 0; k--)
		{
			  System.out.print(result[k]);
		}

		return 0;
	}
}

