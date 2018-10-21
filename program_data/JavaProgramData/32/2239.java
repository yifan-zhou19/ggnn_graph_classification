package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num1 = new String(new char[101]);
		String num2 = new String(new char[101]);
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		for (;i < n;i++)
		{
			num1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			num2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int len = num1.length();
			int j = num2.length();

			int k = len;
			int q = j;
			for (;k >= len - j;k--,q--)
			{
				num2 = tangible.StringFunctions.changeCharacter(num2, k, num2.charAt(q));
			}


			for (k = 0;k < len - j;k++)
			{
				num2 = tangible.StringFunctions.changeCharacter(num2, k, '0');
			}

			num1 = tangible.StringFunctions.changeCharacter(num1, len, num2[len] = 0);



			for (j = len - 1;j >= 0;j--)
			{
				if (num1.charAt(j) >= num2.charAt(j))
				{
					num1 = tangible.StringFunctions.changeCharacter(num1, j, num1.charAt(j) - num2.charAt(j) + 48);
				}
				else if (num1.charAt(j) >= num2.charAt(j) && num1.charAt(j - 1) == 0)
				{
					num1 = tangible.StringFunctions.changeCharacter(num1, j - 1, 9);
					num1 = tangible.StringFunctions.changeCharacter(num1, j, (10 + num1.charAt(j) - num2.charAt(j) + 48));
				}
				else
				{
					num1 = tangible.StringFunctions.changeCharacter(num1, j, (10 + num1.charAt(j) - num2.charAt(j) + 48));
					num1.charAt(j - 1)--;
				}
			}
			System.out.print(num1);
			System.out.print("\n");
		}

		return 0;
	}
}

