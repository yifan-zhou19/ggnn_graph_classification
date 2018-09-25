package <missing>;

public class GlobalMembers
{
	/**
	 * author:liucheng
	 * date:2010-10-23 13:04:16
	 * file:factors.cpp
	 */

	public static int factor(int num,int minA1)
	{
			int count = 0;
			int sqrtNum;
			int i;

			if (num <= minA1)
			{
					return 0;
			}

			sqrtNum = (int)Math.sqrt((double)num);
			for (i = minA1;i <= sqrtNum;i++)
			{
					if (num % i == 0)
					{
							count++; //num=i*(num/i)
							count += factor(num / i, i); //num=i*(factor(num/i))
					}
			}

			return count;
	}


	public static int Main()
	{
			int n;
			int num;

			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			while (n -- != 0)
			{
					num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					System.out.print(factor(num, 2) + 1);
					System.out.print("\n");
			}

			return 0;
	}
}

