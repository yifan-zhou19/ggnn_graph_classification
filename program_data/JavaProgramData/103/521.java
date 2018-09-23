package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[100]);
		int i;
		int j;
		int count = 0;
		int m;
		ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i < ch.length();i++)
		{
			if (ch.charAt(i) >= 'a' && ch.charAt(i) <= 'z')
			{
				ch = tangible.StringFunctions.changeCharacter(ch, i, ch.charAt(i) - 32);
			}
		}
			j = 0;

			while (true)
			{
				m = 'A';
			for (i = m;i <= 'Z';i++)
			{
				if (i == ch.charAt(j))
				{
					while (i == ch.charAt(j))
					{
					count++;
					j++;
					}
				   System.out.print('(');
				   System.out.print((char)i);
				   System.out.print(',');
				   System.out.print(count);
				   System.out.print(')');
				   count = 0;
				   m = 'A';
				}
			}
			if (j == ch.length())
			{
				break;
			}
			}
			return 0;
	}


}

