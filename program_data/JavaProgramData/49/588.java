package <missing>;

public class GlobalMembers
{
	/*
	 * 12-6huiwen.cpp
	 *
	 *  Created on: 2011-12-30
	 *      Author: Dai Guangda
	 */
	public static int Main()
	{
		String a = new String(new char[501]);
		int start;
		int end;
		int zlen;
		int i;
		int j;
		int len;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		for (zlen = 2; zlen <= len; zlen++)
		{
			for (start = 0; start <= len - zlen; start++)
			{
				end = start + zlen - 1;
				i = start;
				j = end;
				while (a.charAt(i) == a.charAt(j) && i < j)
				{
					i++;
					j--;
				}
				if (i >= j)
				{
					for (i = start; i <= end; i++)
					{
						System.out.print(a.charAt(i));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

