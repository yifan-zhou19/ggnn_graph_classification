package <missing>;

public class GlobalMembers
{
	/*
	 * yi.cpp
	 *
	 *  Created on: 2012-10-20
	 *      Author: 7
	 */
	public static int Main()
	{
		String s = new String(new char[500]);
		int[] left = new int[500];
		int[] num = new int[500];
		int flag = 0;
		int temp;
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l;
		int i = 0;
		int k = 0;
		int j;
		for (i = 0;i < 500;i++)
		{
			num[i] = 1000;
		}
		l = s.length();
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) == s.charAt(0))
			{
				left[k] = i;
				k++;
			}
			else
			{
				k--;
				num[flag] = left[k];
				num[flag + 1] = i;
				flag = flag + 2;
			}
		}
		for (i = 0;i < flag;i = i + 2)
		{
			for (j = 0;j < flag - i;j = j + 2)
			{
				if (num[j + 1] > num[j + 3])
				{
					temp = num[j];
					num[j] = num[j + 2];
					num[j + 2] = temp;
					temp = num[j + 1];
					num[j + 1] = num[j + 3];
					num[j + 3] = temp;
				}
			}
		}
			for (i = 0;i < flag;i = i + 2)
			{
				System.out.print(num[i]);
				System.out.print(' ');
				System.out.print(num[i + 1]);
				System.out.print("\n");
			}

	}

}

