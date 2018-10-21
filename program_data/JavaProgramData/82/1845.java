package <missing>;

public class GlobalMembers
{
	/**
	*@file 6.cpp
	*@author ???
	*@date 2013-10-24
	*@description ????
	*/


	public static int Main()
	{
		int n;
		int high;
		int low;
		int pre;
		int hour;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		pre = 0;
		hour = 0;
		while (n-- != 0)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			high = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			low = Integer.parseInt(tempVar2);
		}
		if (high >= 90 && high <= 140 && low >= 60 && low <= 90)
		{
		pre++;
		}
		if (!(high >= 90 && high <= 140 && low >= 60 && low <= 90))
		{
		pre = 0;
		}
		hour = pre >= hour != 0?pre:hour;
		}

		System.out.print(hour);
		System.out.print("\n");
		return 0;
	}
}

