package <missing>;

public class GlobalMembers
{
	/*
	 * 1000010175_mte9.cpp
	 *
	 *  Created on: 2010-11-14
	 *      Author: ???
	 *      function:1134 ??
	 */



	public static int Main()
	{
		int[] iNum = new int[20];
		int i;
		int j;
		int n;
		int iPair;
		while (true)
		{
			iPair = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(iNum,0,80);
			iNum[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = 1;
			if (iNum[0] == -1)
			{
				break;
			}
			do //??,????0???
			{
				iNum[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				n++;
			}while (iNum[n - 1] != 0);
			n--; //????0????

			for (i = 0;i < n;i++) //????,???????????
			{
				for (j = 0;j < n;j++)
				{
					if (iNum[j] == iNum[i] * 2)
					{
						iPair++;
					}
				}
			}
			System.out.print(iPair);
			System.out.print("\n");
		}
		return 0;
	}
}

