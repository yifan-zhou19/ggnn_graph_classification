import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012795-????.cpp
	 *
	 *  Created on: 2010-12-29
	 *      Author: Administrator
	 */
	public static int Main()
	{
		String str = new String(new char[31]);
		String a = new String(new char[31]);
		int len;
		int i;
		int j = 0;
		int num = 0;
		int sum = 0;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				a = tangible.StringFunctions.changeCharacter(a, j, str.charAt(i));
				num = num + 1;
				j = j + 1;
			}
			if (str.charAt(i) < '0' || str.charAt(i)>'9')
			{
				for (j = 0;j < num;j++)
				{
					if (a.charAt(j) != '0')
					{
						break;
					}
					sum = sum + 1;
				}
				if (sum == num && sum != 0)
				{
					System.out.print("0");
					System.out.print("\n");
					num = 0;
					sum = 0;
				}
				else
				{
				for (j = sum;j < num - 1;j++)
				{
					System.out.print(a.charAt(j));
				}
				System.out.print(a.charAt(num - 1));
				System.out.print("\n");
				j = 0;
				num = 0;
				sum = 0;
				}
			}
		}
		for (j = 0;j < num;j++)
		{
			if (a.charAt(j) != '0')
			{
				break;
			}
			sum = sum + 1;
		}
		if (sum == num && sum != 0)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else
		{
		   for (j = sum;j < num - 1;j++)
		   {
				System.out.print(a.charAt(j));
		   }
			System.out.print(a.charAt(num - 1));
			System.out.print("\n");
		}
		return 0;
	}

}

