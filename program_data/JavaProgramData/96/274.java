package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int b = 0;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		while (a.charAt(i) != '\0')
		{
				 b = b * 10 + a.charAt(i) - '0';
				 a = tangible.StringFunctions.changeCharacter(a, i, '0' + b / 13);
				 b = b % 13;
				 i++;
		}
		if (a.charAt(1) == '\0')
		{
			System.out.print("0");
		}
		else if (a.charAt(1) == '0')
		{
			   if (a.charAt(2) != '\0')
			   {
				   System.out.printf("%s", a.charAt(2));
			   }
			   else
			   {
				   System.out.print("0");
			   }
		}
		else
		{
			System.out.printf("%s", a.charAt(1));
		}
		System.out.printf("\n%d",b);
	}



}

