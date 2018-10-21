package <missing>;

public class GlobalMembers
{
	/**
	* @file homework.cpp
	* @author ???
	* @date 2011-11-3
	* @description
	* ??????: ????????????
	*/
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int num;
		int flag = 1;
		char ch;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{
			String a = new String(new char[100001]);
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				if (a.charAt(j) == flag)
				{
					continue;
				}
				num = 1;
				ch = a.charAt(j);
				for (k = j + 1;a.charAt(k) != '\0';k++)
				{
					if (a.charAt(k) == flag)
					{
						continue;
					}
					if (a.charAt(k) == ch)
					{
						num++;
						a = tangible.StringFunctions.changeCharacter(a, k, flag);
					}
				}
				if (num == 1)
				{
					break;
				}
			}
			if (num == 1)
			{
				System.out.print(ch);
				System.out.print("\n");
			}
			else
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

