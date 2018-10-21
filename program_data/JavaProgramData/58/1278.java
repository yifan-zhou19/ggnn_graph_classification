package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[100]);
	public static int Main()
	{
		//freopen("in.txt","r",stdin);
		int i;
		int j;
		int k;
		char c;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			while (true)
			{
				c = System.in.read();
				if (c != '\n')
				{
					break;
				}
			}
			i = 0;
			while (c != '\n')
			{
				s = tangible.StringFunctions.changeCharacter(s, i++, c);
				c = System.in.read();
			}
			s = tangible.StringFunctions.changeCharacter(s, i, '\0');
			//printf("%s\n",s);
			if (s.charAt(0) == '_' || s.charAt(0) >= 'a' && s.charAt(0) <= 'z' || s.charAt(0) >= 'A' && s.charAt(0) <= 'Z')
			{
				int ok = 1;
				for (i = 1;i < s.length();i++)
				{
					if (s.charAt(i) == '_' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= '0' && s.charAt(i) <= '9')
					{
						;
					}
					else
					{
						ok = 0;
						break;
					}
				}
				if (ok == 1)
				{
					System.out.print("1\n");
				}
				else
				{
					System.out.print("0\n");
				}
			}
			else
			{
				System.out.print("0\n");
			}
		}
		return 0;
	}
}

