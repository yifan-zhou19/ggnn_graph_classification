package <missing>;

public class GlobalMembers
{
	/**
	* @file homework.cpp
	* @author ???
	* @date 2011-11-3
	* @description
	* ??????: ??13
	*/
	public static int Main()
	{
		char a;
		int k;
		int cnt = 0;
		int flag = 1;
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0) // ????????
		{
			cnt = cnt * 10 + (a - '0'); // a????????cnt????????10???????
			k = cnt / 13; // k???
			if (k != 0)
			{
				System.out.print(k);
				flag = 0; // ????????0??flag?0
			}
			else if (flag == 0)
			{
				System.out.print("0");
			}
			cnt = cnt % 13; // cnt???
		}
		if (flag != 0)
		{
			System.out.print("0");
		}
		System.out.print("\n");
		System.out.print(cnt);
		return 0;
	}
}

