package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int s;
		int p = 0;
		int m = 0;
		String str = new String(new char[10]);
		String substr = new String(new char[3]);
		char d;
		do
		{
			if (p != 0)
			{
				for (k = 1;;k++)
				{
				str = tangible.StringFunctions.changeCharacter(str, k, System.in.read());
				if (str.charAt(k) == ' ')
				{
					str = tangible.StringFunctions.changeCharacter(str, k, '\0');
					break;
				}
				}
			}
			else
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					str = tempVar.charAt(0);
				}
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				substr = tempVar2.charAt(0);
			}
			d = System.in.read();
			for (k = 0;k < str.length();k++)
			{
				if ((int)str.charAt(k) > m)
				{
				s = k;
				m = (int)str.charAt(k);
				}
			}
			for (k = 0;k <= s;k++)
			{
				System.out.printf("%c",str.charAt(k));
			}
			System.out.printf("%s",substr);
			for (k = s + 1;k < str.length();k++)
			{
				System.out.printf("%c",str.charAt(k));
			}
			System.out.print("\n");
			m = 0;
			p += 1;
		}while ((str[0] = System.in.read()) != EOF);
	}
}

