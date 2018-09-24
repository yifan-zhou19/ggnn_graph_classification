package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int flag = 0;
		int temp;
		int z;
		String a = new String(new char[1000]);
	while (gets(a) != null)
	{
		System.out.printf("%s\n",a);
		l = a.length();
		for (z = 1;z <= l;z++)
		{
			flag = 0;
			for (i = 0;i < l;i++)
			{
			if (a.charAt(i) != '(' && a.charAt(i) != ')')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			}
			if (a.charAt(i) == '(')
			{
				flag = 1;
				temp = i;
			}
			if (a.charAt(i) == ')' && flag == 1)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				a = tangible.StringFunctions.changeCharacter(a, temp, ' ');
				flag = 0;
			}
			}
		}
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) == '(')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '$');
			}
			if (a.charAt(i) == ')')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '?');
			}
		}
		System.out.printf("%s\n",a);
	}

		return 0;
	}
}

