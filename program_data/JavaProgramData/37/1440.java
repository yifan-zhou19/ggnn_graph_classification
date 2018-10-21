package <missing>;

public class GlobalMembers
{
	/*
	 * ????first.cpp
	 * ???00948343_??
	 * ?????2012/9/16
	 * ?????1???100?????????
	 */



	public static int Main()
	{
		int length;
		int t = 0;
		int i;
		int j;
		int k;
		int flag = 0;
		int count;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[100000]);
		for (i = 0;i < t;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			length = a.length();
			flag = 0, count = 0;
			for (j = 0;j < length;j++)
			{
				count = 0;
				if (a.charAt(j) != '0')
				{
				for (k = j + 1;k < length;k++)
				{
					if (a.charAt(j) == a.charAt(k))
					{
						a = tangible.StringFunctions.changeCharacter(a, k, '0');
						count++;
					}
				}
				if (k == length && count == 0)
				{
					System.out.print(a.charAt(j));
					System.out.print("\n");
					flag = 1;
					break;
				}
				}
			}
			if (flag == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

