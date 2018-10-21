public class word
{
	public String string = new String(new char[30]);
}

package <missing>;

public class GlobalMembers
{
	public static word[] word = tangible.Arrays.initializeWithDefaultwordInstances(50);

	public static void Main()
	{
		int n;
		int l;
		int i;
		String temp = new String(new char[30]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i].string = tempVar2.charAt(0);
			}
		}

		for (i = 0;i < n;i++)
		{
			temp = word[i].string;
			l = temp.length();
			if (temp.charAt(l - 1) == 'g' && temp.charAt(l - 2) == 'n' && temp.charAt(l - 3) == 'i')
			{
				temp = tangible.StringFunctions.changeCharacter(temp, l - 1, null);
				temp = tangible.StringFunctions.changeCharacter(temp, l - 2, null);
				temp = tangible.StringFunctions.changeCharacter(temp, l - 3, null);
				word[i].string = temp;
			}
			else if (temp.charAt(l - 1) == 'y' && temp.charAt(l - 2) == 'l')
			{
				temp = tangible.StringFunctions.changeCharacter(temp, l - 1, null);
				temp = tangible.StringFunctions.changeCharacter(temp, l - 2, null);
				word[i].string = temp;
			}
			else if (temp.charAt(l - 1) == 'r' && temp.charAt(l - 2) == 'e')
			{
				temp = tangible.StringFunctions.changeCharacter(temp, l - 1, null);
				temp = tangible.StringFunctions.changeCharacter(temp, l - 2, null);
				word[i].string = temp;
			}
		}

		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",word[i].string);
		}
	}

}

