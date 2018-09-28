package <missing>;

public class GlobalMembers
{
	/*
	 * jiaogucaixiang.cpp
	 *
	 *  Created on: 2011-12-21
	 *      Author: 1100012857
	 */
	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			if (num == 1)
			{
				break;
			}
			else
			{
				switch (num % 2)
				{
				case 0:
				{
					System.out.print(num);
					System.out.print("/2=");
					System.out.print(num / 2);
					System.out.print("\n");
					num /= 2;
					break;
				}
				case 1:
				{
					System.out.print(num);
					System.out.print("*3+1=");
					System.out.print(num * 3 + 1);
					System.out.print("\n");
					num = num * 3 + 1;
					break;
				}
				default:
					;
				}
			}
		}
		System.out.print("End");
		System.out.print("\n");
		return 0;
	}

}

