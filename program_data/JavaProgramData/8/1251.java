package <missing>;

public class GlobalMembers
{
	/*
	 * functions.cpp
	 *
	 *  Created on: 2013-11-29
	 *      Author: 111
	 */
	public static int[] str1 = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	public static int[] str2 = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	public static int length1;
	public static int length2;
	public static void input_string()
	{
		length1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		length2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < length1;i++)
		{
			str1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < length2;i++)
		{
			str2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void rank_string()
	{
		int temp;
		for (int i = 0;i < length1 - 1;i++)
		{
			for (int j = i + 1;j < length1;j++)
			{
				if (str1[i] > str1[j])
				{
					temp = str1[i];
					str1[i] = str1[j];
					str1[j] = temp;
				}
			}
		}
		for (int i = 0;i < length2 - 1;i++)
		{
			for (int j = i + 1;j < length2;j++)
			{
				if (str2[i] > str2[j])
				{
					temp = str2[i];
					str2[i] = str2[j];
					str2[j] = temp;
				}
			}
		}
	}
	public static void combine_string()
	{
		for (int i = length1;i < length1 + length2;i++)
		{
			str1[i] = str2[i - length1];
		}
	}
	public static void output_string()
	{
		System.out.print(str1[0]);
		for (int i = 1;i < length1 + length2;i++)
		{
			System.out.print(' ');
			System.out.print(str1[i]);
		}
	}
	public static int Main()
	{
		input_string();
		rank_string();
		combine_string();
		output_string();
		return 0;
	}

}

