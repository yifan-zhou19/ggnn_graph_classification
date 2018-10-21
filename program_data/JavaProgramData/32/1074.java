package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int times = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{

		String ch1 = new String(new char[100]);
		String ch2 = new String(new char[100]);
		String ch3 = new String(new char[100]);
		char temp;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ch1,0,100);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ch2,0,100);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ch3,0,100);
		ch1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		ch2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len1 = ch1.length();
		int len2 = ch2.length();
		for (int i = 0;i <= len1 / 2 - 1;i++)
		{
			temp = ch1.charAt(i);
			ch1 = tangible.StringFunctions.changeCharacter(ch1, i, ch1.charAt(len1 - i - 1));
			ch1 = tangible.StringFunctions.changeCharacter(ch1, len1 - i - 1, temp);
		}
		for (int i = 0;i <= len2 / 2 - 1;i++)
		{
			temp = ch2.charAt(i);
			ch2 = tangible.StringFunctions.changeCharacter(ch2, i, ch2.charAt(len2 - i - 1));
			ch2 = tangible.StringFunctions.changeCharacter(ch2, len2 - i - 1, temp);
		}
		for (int i = len2;i <= len1 - 1;i++)
		{
		ch2 = tangible.StringFunctions.changeCharacter(ch2, i, '0');
		}
		for (int i = 0;i <= len1 - 1;i++)
		{
		ch3 = tangible.StringFunctions.changeCharacter(ch3, i, ch1.charAt(i) - ch2.charAt(i) + 48);
		}
		for (int i = 1;i <= len1;i++)
		{
			for (int j = 0;j <= len1 - 1;j++)
			{
				if (ch3.charAt(j) < '0')
				{
					ch3.charAt(j) += 10;
					ch3.charAt(j + 1) -= 1;
				}
			}
		}

		if (ch3.charAt(len1 - 1) == '0')
		{
			for (int i = len1 - 2;i >= 0;i--)
			{
			System.out.print(ch3.charAt(i));
			}
		}
		else
		{
			for (int i = len1 - 1;i >= 0;i--)
			{
			System.out.print(ch3.charAt(i));
			}
		}
		System.out.print("\n");
		System.in.read();
		times++;
		if (times == n)
		{
			break;
		}

		}
		return 0;
	}

}

