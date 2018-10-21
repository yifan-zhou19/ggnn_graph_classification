package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int yu = 0;
		int yu0 = 0;
		int he = 0;
		int i;
		int n;
		int sum;
		String str1 = new String(new char[260]);
		String str2 = new String(new char[260]);
		String str0 = new String(new char[260]);
		String stra = new String(new char[260]);
		String strb = new String(new char[260]);
		String res = new String(new char[260]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}

		if (str1.length() == str2.length())
		{
			stra = str1;
			strb = str2;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto final;
		}
		if (str1.length() > str2.length())
		{
			stra = str1;
			str0 = str2;
		}
		else
		{
			stra = str2;
			str0 = str1;
		} //???stra??????str0?????strb??0???str0???final??


		n = stra.length() - str0.length();
		for (i = 0;i <= n - 1;i++)
		{
			strb = tangible.StringFunctions.changeCharacter(strb, i, '0');
		}
		strb = tangible.StringFunctions.changeCharacter(strb, n, '\0');
		strb += str0; //???stra?strb?????????

//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	final:

		i = stra.length() - 1;
		for (i = i;i >= 0;i--)
		{
			he = stra.charAt(i) + strb.charAt(i) - '0'-'0' + yu;
			yu0 = he / 10;
			if (he / 10 != 0)
			{
				he = he % 10;
			}
			res = tangible.StringFunctions.changeCharacter(res, i + 1, he + '0');
			yu = yu0;
		}
		res = tangible.StringFunctions.changeCharacter(res, stra.length() + 1, '\0');
		res = tangible.StringFunctions.changeCharacter(res, 0, yu + 48); //res?????????0

		for (i = 0;i <= stra.length();i++)
		{
			sum = i;
			if (res.charAt(i) != '0')
			{
				break;
			}
		}
		for (i = sum;i <= stra.length();i++)
		{
			System.out.printf("%c",res.charAt(i));
		}

		return 0;
	}

}

