package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num1 = new String(new char[250]);
		String num2 = new String(new char[250]);
		String num3 = new String(new char[250]);
		String t = new String(new char[250]);
		int i;
		int j;
		int k;
		int len1;
		int len2;
			num1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			num2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len1 = num1.length();
			len2 = num2.length();
			if (len1 > len2)
			{
				num3 = tangible.StringFunctions.changeCharacter(num3, len1, '\0');
				for (i = (len1 - 1);i >= (len1 - len2);i--)
				{
					if (num1.charAt(i) + num2.charAt(i - (len1 - len2)) < 106)
					{
					num3 = tangible.StringFunctions.changeCharacter(num3, i, num1.charAt(i) + num2.charAt(i - (len1 - len2)) - 48);
					}
					else
					{
					num3 = tangible.StringFunctions.changeCharacter(num3, i, num1.charAt(i) + num2.charAt(i - (len1 - len2)) - 58);
					num1 = tangible.StringFunctions.changeCharacter(num1, i - 1, num1.charAt(i - 1) + 1);
					}
				}
				for (j = (len1 - len2 - 1);j >= 0;j--)
				{
					if (num1.charAt(j) >= 58 && j != 0)
					{
						num3 = tangible.StringFunctions.changeCharacter(num3, j, num1.charAt(j) - 10);
						num1 = tangible.StringFunctions.changeCharacter(num1, j - 1, num1.charAt(j - 1) + 1);
					}
					if (num1.charAt(j) >= 58 && j == 0)
					{
						num3 = tangible.StringFunctions.changeCharacter(num3, j, num1.charAt(j) - 10);
						System.out.print("1");
						System.out.print(num3);
						System.out.print("\n");
						break;
					}
					else if (num1.charAt(j) < 58)
					{
						num3 = tangible.StringFunctions.changeCharacter(num3, j, num1.charAt(j));
					}
					if (j == 0 && num1.charAt(j) < 58)
					{
						if (num3.charAt(0) == 48)
						{
							for (i = 0;i < len1;i++)
							{
								num3 = tangible.StringFunctions.changeCharacter(num3, i, num3.charAt(i + 1));
							}
						}
						System.out.print(num3);
						System.out.print("\n");
					}
				}
			}
			if (len1 < len2)
			{
				num3 = tangible.StringFunctions.changeCharacter(num3, len2, '\0');
				for (i = (len2 - 1);i >= (len2 - len1);i--)
				{
					if (num2.charAt(i) + num1.charAt(i - (len2 - len1)) < 106)
					{
					num3 = tangible.StringFunctions.changeCharacter(num3, i, num2.charAt(i) + num1.charAt(i - (len2 - len1)) - 48);
					}
					else
					{
					num3 = tangible.StringFunctions.changeCharacter(num3, i, num2.charAt(i) + num1.charAt(i - (len2 - len1)) - 58);
					num2 = tangible.StringFunctions.changeCharacter(num2, i - 1, num2.charAt(i - 1) + 1);
					}
				}
				for (j = (len2 - len1 - 1);j >= 0;j--)
				{
					if (num2.charAt(j) >= 58 && j != 0)
					{
						num3 = tangible.StringFunctions.changeCharacter(num3, j, num2.charAt(j) - 10);
						num2 = tangible.StringFunctions.changeCharacter(num2, j - 1, num2.charAt(j - 1) + 1);
					}
					if (num2.charAt(j) >= 58 && j == 0)
					{
						num3 = tangible.StringFunctions.changeCharacter(num3, j, num2.charAt(j) - 10);
						System.out.print("1");
						System.out.print(num3);
						System.out.print("\n");
						break;
					}
					else if (num2.charAt(j) < 58)
					{
						num3 = tangible.StringFunctions.changeCharacter(num3, j, num2.charAt(j));
					}
					if (j == 0)
					{
						System.out.print(num3);
						System.out.print("\n");
					}
				}
			}
			if (len1 == len2)
			{
				num3 = tangible.StringFunctions.changeCharacter(num3, len1, '\0');
				for (i = len1 - 1;i >= 0;i--)
				{
					if (i > 0)
					{
					if (num1.charAt(i) + num2.charAt(i) < 106)
					{
						num3 = tangible.StringFunctions.changeCharacter(num3, i, num1.charAt(i) + num2.charAt(i) - 48);
					}
					if (num1.charAt(i) + num2.charAt(i) >= 106)
					{
						num3 = tangible.StringFunctions.changeCharacter(num3, i, num1.charAt(i) + num2.charAt(i) - 58);
						num1 = tangible.StringFunctions.changeCharacter(num1, i - 1, num1.charAt(i - 1) + 1);
					}
					}
					if (i == 0)
					{
						if (num1.charAt(0) + num2.charAt(0) >= 106)
						{
							num3 = tangible.StringFunctions.changeCharacter(num3, 0, num1.charAt(0) + num2.charAt(0) - 58);
							System.out.print("1");
							System.out.print(num3);
							System.out.print("\n");
						}
						if (num1.charAt(0) + num2.charAt(0) < 106)
						{
							num3 = tangible.StringFunctions.changeCharacter(num3, 0, num1.charAt(0) + num2.charAt(0) - 48);
							if (num3.charAt(0) == 48 && num3.length() != 1)
							{
								for (k = 0;k < num3.length();k++)
								{
									num3 = tangible.StringFunctions.changeCharacter(num3, k, num3.charAt(k + 1));
								}
							}
							System.out.print(num3);
							System.out.print("\n");
						}
					}
				}
			}
		return 0;
	}
}

