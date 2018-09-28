package <missing>;

public class GlobalMembers
{
	//*************************************
	//* ????1.cpp *
	//* ??????1200012844 *
	//* ?????2012?11?13? *
	//* ?????????? *
	//**************************************

	public static int Main()
	{
		int w;
		int i;
		int j;
		int days;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= 12;i++)
		{
			days = 12;
			for (j = 1;j < i;j++)
			{
				days += month[j];
			}
			days %= 7;
			if ((w + days) % 7 == 5)
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

