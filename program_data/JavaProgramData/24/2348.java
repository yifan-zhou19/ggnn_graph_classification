package <missing>;

public class GlobalMembers
{
	// 13.1.cpp 

	public static int Main()
	{
		String ch = new String(new char[3000]);
		int len1 = 0;
		int len2 = 0;
		int len = 0;
		int i;
		int j;
		int m = 0;
		int n = 0;
		int p = 0;
		int num = 0;
		while (ConsoleInput.lastReadWasGood())
		{
			ch = tangible.StringFunctions.changeCharacter(ch, len, System.in.read());
			if (ch.charAt(len) == ' ' || ch.charAt(len) == '\n')
			{
				num++;
			}
			if (num == 1)
			{
				n = 0;
				len2 = len;
			}
			if (ch.charAt(len) == '\n')
			{
				break;
			}
			len++;
		}
		ch = tangible.StringFunctions.changeCharacter(ch, len, ' ');
		for (i = 0; i <= len; i++)
		{
			if (ch.charAt(i) != ' ')
			{
				 p++;
			}
			else
			{
				if (p > len1)
				{
					len1 = p;
					m = i - p;
				}
				if (p < len2)
				{
					len2 = p;
					n = i - p;
				}
				p = 0;
			}
		}
		for (i = m; i < m + len1; i++)
		{
			System.out.print(ch.charAt(i));
		}
		System.out.print("\n");
		for (i = n; i < n + len2; i++)
		{
			System.out.print(ch.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}










}

