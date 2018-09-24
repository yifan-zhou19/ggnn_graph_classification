package <missing>;

public class GlobalMembers
{
	/*
	 *??????????.cpp
	 *?????
	 *????: 2012-12-4
	 *??????????????????
	 */


	public static String c = new String(new char[110]);
	public static char ch;

	public static void PMP(String c, int len)
	{
		for (int i = 0; i < len; i++)
		{
			System.out.print(c[i]);
		}
		System.out.print("\n");
		int flag = 1;

		while (flag != 0)
		{
			flag = 0;
			for (int i = 0; i < len; i++)
			{
				if ((!c[i].equals('(')) && (!c[i].equals(')')))
				{
					c[i] = ' ';
				}
				else if (c[i].equals('('))
				{
					for (int j = i + 1; j < len; j++)
					{
						if (c[j].equals('('))
						{
							break;
						}
						if (c[j].equals(')'))
						{
							c[i] = ' ';
							c[j] = ' ';
							flag = 1;
							break;
						}
						else if (j == len - 1)
						{
							c[i] = '$';
						}

					}
				}
			}
		}
		for (int i = 0; i < len; i++)
		{
			if (c[i].equals('('))
			{
				c[i] = '$';
			}
			if (c[i].equals(')'))
			{
				c[i] = '?';
			}
		}

		for (int i = 0; i < len; i++)
		{
			System.out.print(c[i]);
		}
		System.out.print("\n");
		return;
	}


	public static int Main()
	{
		int len;
		ch = System.in.read();
		while (ch != '~')
		{
			len = 0;
			while (ch != '\n')
			{
				c = tangible.StringFunctions.changeCharacter(c, len, ch);
				len++;
				ch = System.in.read();
			}
			PMP(c, len);
			ch = System.in.read();
		}
		return 0;
	}

}

