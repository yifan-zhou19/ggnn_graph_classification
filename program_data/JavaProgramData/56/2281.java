package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[10]);
		char temp;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = tempVar.charAt(0);
		}
		for (i = 0;i < Math.floor(num.length() / 2);i++)
		{
																	  temp = num.charAt(i);
																	  num = tangible.StringFunctions.changeCharacter(num, i, num.charAt(num.length() - i - 1));
																	  num = tangible.StringFunctions.changeCharacter(num, num.length() - i - 1, temp);
		}
		for (i = 0;i < num.length();i++)
		{
								  System.out.printf("%c",num.charAt(i));
		}
		return 0;
	}

}

