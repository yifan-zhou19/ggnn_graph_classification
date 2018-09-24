package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int len;
		int j;
		int num = 0;
		final String str = "";
		char a;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) >= 97)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
			}
		}
		num = 1;
		for (i = 0;i < len;i++)
		{
		   if (str.charAt(i) == str.charAt(i + 1))
		   {
			   num++;
		   }
		   else
		   {
			   System.out.print('(');
			   System.out.print(str.charAt(i));
			   System.out.print(',');
			   System.out.print(num);
			   System.out.print(')');
			   num = 1;
		   }
		}




		return 0;
	}

}

