package <missing>;

public class GlobalMembers
{
	/*
	 *???: 1.cpp
	 *??????
	 *????: 2012-10-15
	 *??: ????????n??????????????????????????????
	 */


	public static int Main()
	{
		int n = 0;
		int iCounter = 1;
		int iHour = 0;
		int iResult = 0;
		int iHigh = 0;
		int iLow = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (iCounter <= n)
		{
			iHigh = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			iLow = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((iHigh >= 90) + (iHigh <= 140) == 2 && (iLow >= 60) + (iLow <= 90) == 2)
			{
				iHour++; //???? ??????1
				if (iResult < iHour)
				{
					iResult = iHour; //?????????
				}
			}

			else
			{
				iHour = 0; //?? ??????
			}
			iCounter++;
		}
		System.out.print(iResult);
		System.out.print("\n");
		return 0;
	}
}

