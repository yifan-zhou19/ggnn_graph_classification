package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[10000]);
		char a;
		int n;
		int i;
		int len = 1;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		num = tangible.StringFunctions.changeCharacter(num, 0, '1');
		for (i = 1 ; i <= n ; i++)
		{
			if ((num.charAt(0) + num.charAt(0)) > ('9' + '0'))
			{
				len++;
				for (k = len - 1 ; k >= 1 ; k--)
				{
					num = tangible.StringFunctions.changeCharacter(num, k, num.charAt(k - 1));
				}
				num = tangible.StringFunctions.changeCharacter(num, 0, '1');
				if (len > 2)
				{
					for (k = 1 ; k <= len - 2 ; k++)
					{
						if ((num.charAt(k) + num.charAt(k)) > ('9' + '0'))
						{
							num = tangible.StringFunctions.changeCharacter(num, k, num.charAt(k) + num.charAt(k) - '9' - '1' + '0');
							if ((num.charAt(k + 1) + num.charAt(k + 1)) > ('9' + '0'))
							{
								num = tangible.StringFunctions.changeCharacter(num, k, num.charAt(k) + '1' - '0');
							}
						}
						else
						{
							num = tangible.StringFunctions.changeCharacter(num, k, num.charAt(k) + num.charAt(k) - '0');
							if ((num.charAt(k + 1) + num.charAt(k + 1)) > ('9' + '0'))
							{
								num = tangible.StringFunctions.changeCharacter(num, k, num.charAt(k) + '1' - '0');
							}
						}
					}
				}
				if ((num.charAt(len - 1) + num.charAt(len - 1)) > ('9' + '0'))
				{
					num = tangible.StringFunctions.changeCharacter(num, len - 1, num.charAt(len - 1) + num.charAt(len - 1) - '9' - '1' + '0');
				}
				else
				{
					num = tangible.StringFunctions.changeCharacter(num, len - 1, num.charAt(len - 1) + num.charAt(len - 1) - '0');
				}
			}
			else
			{
				if (len > 1)
				{
					for (k = 0 ; k <= len - 2 ; k++)
					{
						if ((num.charAt(k) + num.charAt(k)) > ('9' + '0'))
						{
							num = tangible.StringFunctions.changeCharacter(num, k, num.charAt(k) + num.charAt(k) - '9' - '1' + '0');
							if ((num.charAt(k + 1) + num.charAt(k + 1)) > ('9' + '0'))
							{
								num = tangible.StringFunctions.changeCharacter(num, k, num.charAt(k) + '1' - '0');
							}
						}
						else
						{
							num = tangible.StringFunctions.changeCharacter(num, k, num.charAt(k) + num.charAt(k) - '0');
							if ((num.charAt(k + 1) + num.charAt(k + 1)) > ('9' + '0'))
							{
								num = tangible.StringFunctions.changeCharacter(num, k, num.charAt(k) + '1' - '0');
							}
						}
					}
				}
				if ((num.charAt(len - 1) + num.charAt(len - 1)) > ('9' + '0'))
				{
					num = tangible.StringFunctions.changeCharacter(num, len - 1, num.charAt(len - 1) + num.charAt(len - 1) - '9' - '1' + '0');
				}
				else
				{
					num = tangible.StringFunctions.changeCharacter(num, len - 1, num.charAt(len - 1) + num.charAt(len - 1) - '0');
				}
			}
		}
		for (k = 0 ; k <= len - 1 ; k++)
		{
				System.out.print(num.charAt(k));
		}
		System.out.print("\n");
		return 0;
	}

}

