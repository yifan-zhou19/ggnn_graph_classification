package <missing>;

public class GlobalMembers
{
	/*
	 * paiduiyouxi.cpp
	 *
	 *  Created on: 2010-12-30
	 *      Author: qaj
	 */
	public static int Main()
	{
		String ch = new String(new char[20000]);
		ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l = ch.length();
		int[] num = new int[20000];
		for (int i = 0; i < l; i++)
		{
			num[i] = i;
		}
		int n = l;
		char boy;
		char girl;
		boy = ch.charAt(0);
		for (int i = 1; i < l; i++)
		{
			if (ch.charAt(i) != boy)
			{
				girl = ch.charAt(i);
				break;
			}
		}
		for (int k = 0; k < l / 2; k++)
		{
			for (int i = 0; i < n; i++)
			{
				if ((ch.charAt(i) == boy) && (ch.charAt(i + 1) == girl) || (ch.charAt(i) == girl) && (ch.charAt(i + 1) == boy))
				{
					System.out.print(num[i]);
					System.out.print(' ');
					System.out.print(num[i + 1]);
					System.out.print("\n");
					n = n - 2;
					for (int j = i; j < n; j++)
					{
						ch = tangible.StringFunctions.changeCharacter(ch, j, ch.charAt(j + 2));
						num[j] = num[j + 2];
					}
					break;
				}
			}
		}
		return 0;
	}
}

