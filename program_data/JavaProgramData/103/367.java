package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1001]);
		String str2 = new String(new char[1001]);
		int i;
		int[] num = new int[1000];
		int j = 0;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i < 1000;i++)
		{
			num[i] = 1;
		}
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
			}
		}
		str2 = tangible.StringFunctions.changeCharacter(str2, 0, str.charAt(0));
		for (i = 1;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == str2.charAt(j))
			{
				num[j]++;
			}
			else
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, j + 1, str.charAt(i));
				j++;
			}
		}
		for (i = 0;i < j + 1;i++)
		{
			System.out.print("(");
			System.out.print(str2.charAt(i));
			System.out.print(",");
			System.out.print(num[i]);
			System.out.print(")");
		}
		System.out.print("\n");
		return 0;
	}
}

