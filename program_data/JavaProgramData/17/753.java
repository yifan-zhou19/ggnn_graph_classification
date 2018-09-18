package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		for (;;)
		{

			String str = new String(new char[300]);
			int i;
			int j;
			int k;
			int a1 = 0;
			int js1 = 0;
			int l;
			str = new Scanner(System.in).nextLine();
	if (feof(stdin))
	{
		break;
	}
			System.out.println(str);
			l = str.length();
			for (i = 0;i < l;i++)
			{
				if (str.charAt(i) == '(')
				{
					a1 = 1;
					js1++;
				}
				if (str.charAt(i) == ')' && a1 == 0)
				{
					str = tangible.StringFunctions.changeCharacter(str, i, '?');
				}
				if (str.charAt(i) == ')' && a1 == 1)
				{
					if (js1 > 0)
					{
						js1--;
					}
					else
					{
						str = tangible.StringFunctions.changeCharacter(str, i, '?');
					}
				}
			}
			a1 = 0;
			js1 = 0;

					for (;i >= 0;i--)
					{
				if (str.charAt(i) == ')')
				{
					a1 = 1;
					js1++;
				}
				if (str.charAt(i) == '(' && a1 == 0)
				{
					str = tangible.StringFunctions.changeCharacter(str, i, '$');
				}
				if (str.charAt(i) == '(' && a1 == 1)
				{
					if (js1 > 0)
					{
						js1--;
					}
					else
					{
						str = tangible.StringFunctions.changeCharacter(str, i, '$');
					}
				}
					}

			for (i = 0;i < l;i++)
			{
				if (str.charAt(i) != '?' && str.charAt(i) != '$')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, ' ');
				}
			}
			System.out.println(str);

		}
	}
}

