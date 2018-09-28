package <missing>;

public class GlobalMembers
{
	/*
	 * 0.cpp
	 *
	 *  Created on: 2011-12-30
	 *      Author: Alfalfa
	 */
	public static int Main()
	{
		String string = new String(new char[500]);
		String = ConsoleInput.readToWhiteSpace(true);
		int len = String.length();
		int i;
		int j;
		int k = 1;
		while (k < len)
		{
			for (i = 0,j = k; j < len; i++,j++)
			{
				int begin = i;
				int end = j;
				while (begin < end)
				{
					if (String[begin] != string.charAt(end))
					{
						break;
					}
					else
					{
						begin++;
						end--;
					}
				}
				if (begin >= end)
				{
					int print = i;
					for (print; print <= j; print++)
					{
						System.out.print(String[print]);
					}
					System.out.print("\n");
				}
			}
			k++;
		}
	}

}

