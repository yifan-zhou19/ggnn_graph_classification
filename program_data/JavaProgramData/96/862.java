package <missing>;

public class GlobalMembers
{
	//??13?????
	public static int Main()
	{
		String a = new String(new char[110]);
		String result = new String(new char[110]);
		int b;
		int last = 0; //?????,?????
		int y; //??
		int s; //?
		int l;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		for (i = 0;i < l;i++)
		{
			b = last + (a.charAt(i) - '0');
			y = b % 13;
			s = b / 13;
			result = tangible.StringFunctions.changeCharacter(result, i, '0' + s);
			last = y * 10;
		}
		result = tangible.StringFunctions.changeCharacter(result, l, '\0');
		if (result.charAt(0) == '0')
		{
			if (result.charAt(1) == '0')
			{
				for (i = 0;i <= l - 2;i++)
				{
					result = tangible.StringFunctions.changeCharacter(result, i, result.charAt(i + 2));
				}
			}
			else
			{
				for (i = 0;i <= l - 1;i++) //???�=�???
				{
					result = tangible.StringFunctions.changeCharacter(result, i, result.charAt(i + 1));
				}
			}
		}
		l = result.length();
		if (l == 0) //??????
		{
			result = tangible.StringFunctions.changeCharacter(result, 0, '0');
			result = tangible.StringFunctions.changeCharacter(result, 1, '\0');
		}
		System.out.printf("%s\n%d",result,y);
		return 0;
	}

}

