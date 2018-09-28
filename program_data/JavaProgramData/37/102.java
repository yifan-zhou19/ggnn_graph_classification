package <missing>;

public class GlobalMembers
{
	//*????1000012912_002.cpp
	//*??????
	//*?????2010.11.17
	//*???????????????
	public static int Main()
	{
		int flag;
		int t;
		int i;
		int j;
		int k;
		int len;
		String letter = new String(new char[100000]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < t; i++)
		{
			letter = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = letter.length();
			for (j = 0; j < len; j++)
			{
				flag = 1;
				if (letter.charAt(j) != 0)
				{
					for (k = j + 1; k < len; k++)
					{
						if (letter.charAt(j) == letter.charAt(k)) //???????
						{
							flag = 0;
							letter = letter.substring(0, k);
						}
					}
					if (flag != 0) //?????????
					{
						System.out.print(letter.charAt(j));
						System.out.print("\n");
						break;
					}
				}
			}
			if (j == len) //??????????
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

