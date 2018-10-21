package <missing>;

public class GlobalMembers
{
	//Patricia.Xiao
	//????????
	public static String a = new String(new char[110]);
	public static int match(int i)
	{
		int j;
		int l = a.length();
		if (i == l)
		{
			return 0; //??
		}
		if (a.charAt(i) == '?') //????
		{
			for (j = i - 1;j >= 0;j--)
			{
				if (a.charAt(j) == '$')
				{
					//printf("%d %d\n",i,j);  //debug
					a = tangible.StringFunctions.changeCharacter(a, j, ' ');
					a = tangible.StringFunctions.changeCharacter(a, i, ' ');
					break; //????????????????else?????bug?
				}
			}
		}
		match(i + 1);
		return 0;
	}
	public static int Main()
	{
		int l;
		int i;
		while (scanf("%s",a) != EOF)
		{
			System.out.printf("%s\n",a);
			l = a.length();
			for (i = 0;i < l;i++) //??
			{
				if (a.charAt(i) == '(')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '$');
				}
				else
				{
					if (a.charAt(i) == ')')
					{
						a = tangible.StringFunctions.changeCharacter(a, i, '?');
					}
					else
					{
						a = tangible.StringFunctions.changeCharacter(a, i, ' ');
					}
				}
			}
			match(1);
			System.out.printf("%s\n",a);
		}
		return 0;
	}

}

