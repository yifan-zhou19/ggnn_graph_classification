package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[110]);
		String tra = new String(new char[110]);
		String mark = new String(new char[110]);
		int n;
		int i;
		int j;
		int p;
		int q;
		while (gets(str))
		{
			p = q = -1;
			n = str.length();
			mark = tangible.StringFunctions.changeCharacter(mark, n, null);
			for (i = 0;i < n;i++)
			{
				if (str.charAt(i) == '(')
				{
					p = i;
				}
			}
			tra = str;
			for (i = p;i >= 0;i--)
			{
				if (tra.charAt(i) == '(')
				{
					for (j = i + 1;j < n;j++)
					{
						if (tra.charAt(j) == ')')
						{
							tra = tangible.StringFunctions.changeCharacter(tra, i, tra[j] = 'a');
							break;
						}
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				if (tra.charAt(i) == '(')
				{
					mark = tangible.StringFunctions.changeCharacter(mark, i, '$');
				}
				else if (tra.charAt(i) == ')')
				{
					mark = tangible.StringFunctions.changeCharacter(mark, i, '?');
				}
				else
				{
					mark = tangible.StringFunctions.changeCharacter(mark, i, ' ');
				}
			}
			System.out.printf("%s\n%s\n",str,mark);
		}
		return 0;
	}

}

