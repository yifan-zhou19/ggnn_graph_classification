package <missing>;

public class GlobalMembers
{
	// ?????

	public static void Main()
	{
		void max(char str[],char sub[]);
		int i;
		int j = 0;
		String str = new String(new char[11]);
		String sub = new String(new char[4]);
		char t;
		do
		{
			if (j != 0)
			{
				for (i = 1;;i++) //????????????????
				{
					if ((t = System.in.read()) != ' ')
					{
						str = tangible.StringFunctions.changeCharacter(str, i, t);
					}
					else
					{
						str = tangible.StringFunctions.changeCharacter(str, i, '\0');
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
				sub = tempVar2.charAt(0);
			}
			max(str, sub);
			j++;
		}while ((str[0] = System.in.read()) != EOF);
	} //EOF?????????????????

	public static void max(String str, String sub)
	{
		int i;
		int m = 0;
		int n;
		char r = str[0];
		n = str.length();
		for (i = 1;i <= n - 1;i++)
		{
			if (str[i].compareTo(r) > 0)
			{
				r = str[i];
				m = i;
			}
		}
		for (i = 0;i <= m;i++)
		{
			System.out.printf("%c",str[i]);
		}
		for (i = m + 1;i <= m + 3;i++)
		{
			System.out.printf("%c",sub[i - m - 1]);
		}
		for (i = m + 4;i < n + 3;i++)
		{
			System.out.printf("%c",str[i - 3]);
		}
		System.out.print("\n");
	}






}

