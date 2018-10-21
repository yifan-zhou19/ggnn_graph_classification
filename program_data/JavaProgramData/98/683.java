package <missing>;

public class GlobalMembers
{
	/*
	 * 111202_03_makeup.cpp
	 *
	 *  Created on: 2011-12-2
	 *      Author: Alfalfa
	 */
	public static int Main()
	{
		int n1;
		int max = 0;
		int i;
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int n = n1;
		char[][] word = new char[n + 1][41];
		int[] len = new int[n + 1];
		for (i = 1;i <= n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				word[i] = tempVar.charAt(0);
			}
			len[i + 1] = 0;
			len[i] = String.valueOf(word[i]).length(); //??len????????
		}
		for (i = 1;i <= n;i++)
		{
			max = max + len[i];
			if (max <= 80 && max + len[i + 1] + 1 <= 80 && i != n)
			{
				System.out.print(word[i]);
				System.out.print(" ");
				max++;
			} //??????????????????????80
			else if (max <= 80 && max + len[i + 1] + 1>80 && i != n)
			{
				System.out.print(word[i]);
				System.out.print("\n");
				max = 0;
			} //?????????
			else
			{
				System.out.print(word[i]);
			}
		}

	}

}

