package <missing>;

public class GlobalMembers
{
	/**
	* @file 1000010424_2.cpp
	* @author ???
	* @date 2010?12?17
	* @description
	* ??????: ??2?N??
	*/



	public static int Main()
	{
		int power; //???????
		int[] output = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int i;
		int j;
		int numEnd;

		power = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1; i <= power; i++) //????2????
		{
			for (j = 0; j < 34; j++)
			{
				output[j] *= 2; //??2?
			}

			for (j = 0; j < 34; j++)
			{
				if (output[j] >= 10) //???
				{
					output[j] -= 10;
					output[j + 1]++;
				}
			}
		}

		for (numEnd = 33; numEnd > 0; numEnd--)
		{
			if (output[numEnd] == 0) //??????
			{
				;
			}
			else
			{
				break; //?????????
			}
		}

		//???
		for (i = numEnd; i >= 0; i--)
		{
			System.out.print(output[i]);
		}
		System.out.print("\n");

		return 0;
	}
}

