package <missing>;

public class GlobalMembers
{
	/*
	 * file    homework 9_5
	 * author  ??
	 * date    2010-11-24
	 * description
	           ???????????????????
	*/



	public static int Main()
	{
		String str = new String(new char[501]);
		int i;
		int j;
		int k;
		int len;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();
		for (i = 2; i <= len; i++)
		{
			for (j = 0; j <= len - i; j++)
			{
				for (k = 0; k <= (i - 1) / 2; k++)
				{
					if (str.charAt(j + k) != str.charAt(j + i - 1 - k))
					{
						break;
					}
				}
				if (k > (i - 1) / 2)
				{
					for (k = 0; k < i; k++)
					{
						System.out.print(str.charAt(j + k));
					}
					System.out.print("\n");
				}
			}
		}

		return 0;
	}

}

