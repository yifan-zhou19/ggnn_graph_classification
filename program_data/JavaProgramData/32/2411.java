package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num1 = new String(new char[100]);
		String num2 = new String(new char[100]);
		String num3 = new String(new char[100]);
		int i;
		int j;
		int n;
		int len1;
		int len2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			num2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len1 = num1.length();
			len2 = num2.length();
			num3 = tangible.StringFunctions.changeCharacter(num3, len1, '\0');
			for (j = (len1 - 1);j >= len1 - len2;j--)
			{
				if (num1.charAt(j) >= num2.charAt(j - len1 + len2))
				{
					num3 = tangible.StringFunctions.changeCharacter(num3, j, num1.charAt(j) - num2.charAt(j - len1 + len2) + 48);
				}
				else
				{
					num3 = tangible.StringFunctions.changeCharacter(num3, j, 58 - (num2.charAt(j - len1 + len2) - num1.charAt(j)));
					num1 = tangible.StringFunctions.changeCharacter(num1, j - 1, num1.charAt(j - 1) - 1);
				}
			}
			for (j = (len1 - len2 - 1);j >= 0;j--)
			{
				num3 = tangible.StringFunctions.changeCharacter(num3, j, num1.charAt(j));
			}
			System.out.print(num3);
			System.out.print("\n");
		}
		return 0;
	}
}

