package <missing>;

public class GlobalMembers
{
	/*
	 * hwzc.cpp
	 *
	 *  Created on: 2011-12-30
	 *      Author: miaomiao
	 */
	public static int Main()
	{
		String string = new String(new char[501]);
		String = ConsoleInput.readToWhiteSpace(true);
		int length = String.length();
		int i;
		int j;
		int k = 1;
		while (k < length)
		{
			for (i = 0,j = k;j < length;i++,j++)
			{
				int begin = i;
				int end = j;
				while (begin < end)
				{
					if (String[begin] != string.charAt(end))
					{
						break;
					}
					if (String[begin] == string.charAt(end))
					{
						begin++;
						end--;
					}
				}
				if (begin >= end)
				{
					int print = i;
					for (print;print <= j;print++)
					{
						System.out.print(String[print]);
					}
					System.out.print("\n");
				}
			}
			k++;
		}
		return 0;
	}


}

