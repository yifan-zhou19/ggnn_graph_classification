package <missing>;

public class GlobalMembers
{
	/*
	 * ?7???????.cpp
	 *
	 *  Created on: 2010-11-12
	 *      Author: ???
	 */
	public static int Main()
	{
		int n; //??n?????i?????sum
		int i;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = 0; //???
		if (n < 70) //???70????
		{
		   for (i = 1;i <= n;i++)
		   {
				if ((i % 7 != 0) && (i % 10 != 7))
				{
					sum = sum + i * i;
				}
		   }
		}
		else if (70 <= n != 0 && n < 80) //???70?79
		{
			for (i = 1;i <= 69;i++)
			{
				if ((i % 7 != 0) && (i % 10 != 7))
				{
					sum = sum + i * i;
				}
			}
		}
		else if (n >= 80) //???????80?
		{
			for (i = 1;i <= 69;i++)
			{
				if ((i % 7 != 0) && (i % 10 != 7))
				{
					sum = sum + i * i;
				}
			}
			for (i = 80;i <= n;i++)
			{
				if ((i % 7 != 0) && (i % 10 != 7))
				{
					sum = sum + i * i;
				}
			}
		}
		   System.out.print(sum);
	}
}

