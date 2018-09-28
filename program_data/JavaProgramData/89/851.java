package <missing>;

public class GlobalMembers
{
	/**
	* @file homework.cpp
	* @author ???
	* @date 2010-12-9
	* @description
	* ??????: ?????? 
	*/
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[100000];
		int[] p = num;
		while (ConsoleInput.lastReadWasGood())
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 0 && b == 0)
			{
				break;
			}
			else
			{
				p[b] = (p + b) + 1;
			}
		}
		for (p = num;p < num + n;p++)
		{
			if (p[0] == n - 1)
			{
				System.out.print(p - num);
				break;
			}
			if (p == num + n - 1)
			{
				System.out.print("NOT FOUND");
			}
		}

		return 0;
	}

}

