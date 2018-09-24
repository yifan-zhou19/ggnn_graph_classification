package <missing>;

public class GlobalMembers
{
	/**
	* @file 1000012800_1.cpp
	* @author ??
	* @date 2010-11-24
	* @description
	* ??????:??
	*/

	public static int Main()
	{
		String a = new String(new char[501]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = a.length();
		for (int i = 2; i <= len; i++)
		{
			for (int j = 0; j + i - 1 < len; j++)
			{
				int flag = 1;
				int m = j + i - 1;
				for (int k = 0; j + k <= m - k; k++)
				{
					if (a.charAt(j + k) != a.charAt(m - k))
					{
						flag = 0;
						break;
					}
				}
				if (flag != 0)
				{
					for (int n = 0; n < i; n++)
					{
						System.out.print(a.charAt(j + n));
					}
					System.out.print("\n");
				}
			}
		}
			return 0;
	}





}

