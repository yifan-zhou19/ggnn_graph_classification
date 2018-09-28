package <missing>;

public class GlobalMembers
{
	/*
	 * 243.cpp
	 *
	 *  Created on: 2011-12-22
	 *      Author: think
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] knowcount = new int[n];
		int[] knowncount = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(knowcount,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(knowncount,0,(Integer.SIZE / Byte.SIZE));
		int temp1;
		int temp2;
		for (;;)
		{
			temp1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			temp2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (temp1 == 0 && temp2 == 0)
			{
				break;
			}
			knowcount[temp1]++;
			knowncount[temp2]++;
		}
		int i;
		int count = 0;
		for (i = 0;i < n;i++)
		{
			if (knowcount[i] == 0 && knowncount[i] == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				count++;
			}
		}
		if (count == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}

}

