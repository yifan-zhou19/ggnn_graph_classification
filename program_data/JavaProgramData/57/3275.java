package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String str = new String(new char[100]);
		for (i = 0;i < n;i++)
		{
			str = new Scanner(System.in).nextLine();
			num = str.length();
			num = num - 1;
			if (str.charAt(num) == 'r')
			{
				str = tangible.StringFunctions.changeCharacter(str, (num - 1), '\0');
			}
			if (str.charAt(num) == 'y')
			{
				str = tangible.StringFunctions.changeCharacter(str, (num - 1), '\0');
			}
			if (str.charAt(num) == 'g')
			{
				str = tangible.StringFunctions.changeCharacter(str, (num - 2), '\0');
			}
			System.out.println(str);
		}
	}

}

