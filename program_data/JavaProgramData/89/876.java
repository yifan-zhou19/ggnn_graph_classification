package <missing>;

public class GlobalMembers
{
	/*
	 * 111220_Celebrity.cpp
	 *
	 *  Created on: 2011-12-23
	 *      Author: Alfalfa
	 */
	public static int Main()
	{
		int n1;
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int n = n1;
		int[] knowother = new int[n];
		int[] beknown = new int[n];
		int input1 = 1;
		int input2 = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(knowother,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(beknown,0,(Integer.SIZE / Byte.SIZE));
		while (input1 != 0 || input2 != 0)
		{
			input1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			input2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (input1 != input2)
			{
				knowother[input1]++;
				beknown[input2]++;
			}
		}
		int celebrity = 0;
		int flag = 0;
		for (int i = 0;i < n;i++)
		{
			if (knowother[i] == 0 && beknown[i] == n - 1)
			{
				celebrity = i;
				flag = 1;
			}
		}
		if (flag == 1)
		{
			System.out.print(celebrity);
		}
		else
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}

}

