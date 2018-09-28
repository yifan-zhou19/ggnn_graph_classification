package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int point;
		int p;
		String str1 = new String(new char[50]);
		String str2 = new String(new char[50]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print('1');
			System.out.print("\n");
		}
		else
		{
		for (i = 0;i < 50;i++)
		{
			str1 = tangible.StringFunctions.changeCharacter(str1, i, '0');
			str2 = tangible.StringFunctions.changeCharacter(str2, i, '0');
		}
		str1 = tangible.StringFunctions.changeCharacter(str1, 0, '1');
		//???
			for (i = 1;i <= n;i++)
			{
				for (p = 49;p >= 0;p--)
				{
					if (str1.charAt(p) != '0' || str2.charAt(p) != '0')
					{
						point = p + 1;
						break;
					} //?????
				}

				for (j = 0;j <= point;j++)
				{

					str2 = tangible.StringFunctions.changeCharacter(str2, j + 1, ((str1.charAt(j) - '0') * 2 + (str2.charAt(j) - '0')) / 10 + '0'); //???????
					str1 = tangible.StringFunctions.changeCharacter(str1, j, ((str1.charAt(j) - '0') * 2 + (str2.charAt(j) - '0')) % 10 + '0');

				}
			}
			for (j = 49;j >= 0;j--)
			{
				if (str1.charAt(j) != '0')
				{
				  point = j;
				  break;
				}
			}
			for (j = point;j >= 0;j--)
			{
				System.out.print(str1.charAt(j));
			}
			System.out.print("\n");
		}
			return 0;
	}



}

