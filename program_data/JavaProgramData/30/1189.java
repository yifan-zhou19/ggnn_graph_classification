package <missing>;

public class GlobalMembers
{
	/**
	* @file homework.cpp
	* @author ???
	* @date 2011-10-01
	* @description
	* ??????: ?7???????
	*/
	public static int Main()
	{
		int n;
		int i;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (0 < n < 100)
		{
			for (i = 1;i <= n;i++)
			{
				if ((i % 7 == 0) || (i % 10 == 7) || (i / 10 == 7))
				{
					s = s;
				}
				else
				{
					s = s + i * i;
				}
			}
		}
		else
		{
			System.out.print("error");
			System.out.print("\n");
		}
		System.out.print(s);
		System.out.print("\n");
	return 0;
	}
}

