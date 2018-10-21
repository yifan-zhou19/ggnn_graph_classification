package <missing>;

public class GlobalMembers
{
	/*
	 * homework3.cpp
	 *
	 *  Created on: 2012-12-4
	 *      Author: Lixurong
	 */


	public static int Main()
	{
		String a = new String(new char[1002]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 2; i <= a.length(); i++)
		{
			for (int j = 0; j <= a.length() - i; j++)
			{
				int p = 0;
				for (int x = 0; x < i; x++)
				{
					if (a.charAt(j + x) != a.charAt(j + i - x - 1))
					{
						p = 1;
						break;
					}
				}
				if (p == 0)
				{
					for (int x = j; x < j + i; x++)
					{
						System.out.print(a.charAt(x));
					}
					System.out.print("\n");
				}
			}
		}
	}







}

