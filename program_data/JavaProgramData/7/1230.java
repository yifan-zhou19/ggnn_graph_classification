package <missing>;

public class GlobalMembers
{
	//***??? 1200012772 *********
	//***???????    *********
	//***2012?12?29?    *********
	public static int Main()
	{
		String str1 = new String(new char[256]);
		String str2 = new String(new char[256]);
		String str3 = new String(new char[256]);
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str3 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i = 0;
		int j = 0;
		int l1 = str1.length();
		int l2 = str2.length();
		for (i = 0; i < l1; i++)
		{
			for (j = 0; j < l2; j++)
			{
				if (str1.charAt(i + j) != str2.charAt(j))
				{
					break;
				}
			}
			if (j == l2)
			{
				for (j = 0; j < l2; j++)
				{
					str1 = tangible.StringFunctions.changeCharacter(str1, i + j, str3.charAt(j));
				}
				break;
			}
		}
		for (i = 0; i < l1; i++)
		{
			System.out.print(str1.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}
}

