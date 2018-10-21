package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int number;
		String str1 = new String(new char[33]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,number = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str1 = tempVar2.charAt(0);
			}
			number = str1.length();
			if (str1.charAt(number - 1) == 'r')
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, number - 2, '\0');
				System.out.printf("%s\n",str1);
			}
			else
			{
				if (str1.charAt(number - 1) == 'y')
				{
					str1 = tangible.StringFunctions.changeCharacter(str1, number - 2, '\0');
					System.out.printf("%s\n",str1);
				}
				else
				{
					if (str1.charAt(number - 1) == 'g')
					{
						str1 = tangible.StringFunctions.changeCharacter(str1, number - 3, '\0');
						System.out.printf("%s\n",str1);
					}
				}
			}
		}
	}
}

