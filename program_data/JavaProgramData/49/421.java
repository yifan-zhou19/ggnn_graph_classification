package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[500]);
		String str2 = new String(new char[500]);
		int i;
		int j;
		int length;
		int k = 0;
		int m = 0;
		int n;
		int flag = 0;
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (length = 2; length <= str1.length(); length++)
		{
			for (i = 0; i <= str1.length() - length; i++)
			{
				for (j = i; j <= i + length - 1; j++)
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, k++, str1.charAt(j));
				}
				k = 0;
				for (m = 0; m <= length - 1; m++)
				{
					if (str2.charAt(m) != str2.charAt(length - 1 - m))
					{
						flag = 1;
						break;
					}
				}
				if (flag == 0)
				{
					for (n = 0; n <= length - 1; n++)
					{
						System.out.print(str2.charAt(n));
					}
					System.out.print("\n");
				}
				flag = 0;
			}
		}
		return 0;
	}





}

