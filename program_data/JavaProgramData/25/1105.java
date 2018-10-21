package <missing>;

public class GlobalMembers
{
	/*
	 * 2Npower.cpp
	 * ?????2?N??
	 *  Created on: 2013-1-11
	 *      Author: ???
	 */



	public static void operate(int N)
	{
		int i;
		int j;
		int num = 0;
		int[] result = new int[51]; //????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(result,0,(Integer.SIZE / Byte.SIZE)); //???
		if (N == 0)
		{
			System.out.print('1');
			return;
		}
		result[50] = 2; //????
		for (i = 2;i <= N;i++)
		{
			for (j = 50;j >= 0;j--)
			{
				result[j] = result[j] * 2 + num;
				if (result[j] >= 10)
				{
					result[j] = result[j] - 10;
					num = 1;
				}
				else
				{
					num = 0;
				}
			}
		}
		for (i = 0;i <= 50;i++) //?????
		{
			if (result[i] != 0)
			{
				break;
			}
		}
		for (j = i;j <= 50;j++) //??
		{
			System.out.print(result[j]);
		}
		return;
	}

	public static int Main()
	{
		int N; //?????
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		operate(N); //????operate
		return 0;
	}

}

