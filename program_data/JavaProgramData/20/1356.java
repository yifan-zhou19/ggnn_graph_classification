package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[20]);
		char c;
		String substr = new String(new char[8]);
		int n;
		int max;
		int i;
		while (true)
		{
			max = 0;
			c = System.in.read();
			if (c == '\n')
			{
				c = System.in.read();
			}
			if (c == EOF)
			{
				break;
			}
			else
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					str = tempVar.charAt(0);
				}
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					substr = tempVar2.charAt(0);
				}
				n = str.length();
				for (i = n - 1;i >= 0;i--)
				{
					str = tangible.StringFunctions.changeCharacter(str, i + 1, str.charAt(i));
				}
				str = tangible.StringFunctions.changeCharacter(str, 0, c);
				str = str.substring(0, ++n);
				for (i = 1;i < n;i++)
				{
					if (str.charAt(i) > str.charAt(max))
					{
						max = i;
					}
				}
				for (i = 0;i <= max;i++)
				{
					System.out.printf("%c",str.charAt(i));
				}
				System.out.printf("%c%c%c",substr.charAt(0),substr.charAt(1),substr.charAt(2));
				for (;i < n;i++)
				{
					System.out.printf("%c",str.charAt(i));
				}
				System.out.print('\n');
			}
		}
	}
}

