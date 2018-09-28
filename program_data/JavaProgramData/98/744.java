package <missing>;

public class GlobalMembers
{
	/*
	 * p.cpp
	 *
	 *  Created on: 2011-12-2
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int max;
		int n;
		int t;
		int i;
		String word = new String(new char[50]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		word = ConsoleInput.readToWhiteSpace(true).charAt(0);
		System.out.print(word);
		max = word.length(); //max?????????
		for (i = 2;i <= n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				word = tempVar.charAt(0);
			}
			t = word.length();
			max += t + 1;
			if (max > 80)
			{ //?????
				max = t;
				System.out.print("\n");
				System.out.print(word);
				continue;
			}
			System.out.print(' ');
			System.out.print(word);
		}
		return 0;
	}
}

