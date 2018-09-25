import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * md.cpp
	 *
	 *  Created on: 2010-12-31
	 *      Author: 10040
	 */



	public static int Main()
	{
		String str = new String(new char[40]);
		str = new Scanner(System.in).nextLine();
		//cout << str <<endl;
		int[] tens = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000};
		int num = 0;
		int k = 0;
		int len = str.length();
		for (int i = 0; i < len; i++)
		{
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				k++;
				continue;
			}
			else if (k == 0)
			{
				continue;
			}
			else
			{
				for (int j = 0; j < k; j++)
				{
					//cout << str[i-j] << endl;
					num += (str.charAt(i - j - 1) - '0') * tens[j];
				}
				k = 0;
				System.out.print(num);
				System.out.print("\n");
				num = 0;
			}
		}
		if (k != 0)
		{
			for (int j = 0; j < k; j++)
			{
				num += (str.charAt(len - j - 1) - '0') * tens[j];
			}
			k = 0;
			System.out.print(num);
			System.out.print("\n");
		}


		return 0;
	}

}
