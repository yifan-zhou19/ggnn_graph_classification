package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000 + 1]);
		int i;
		int j;
		int len;
		int flag = 0;
		int sum = 0;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();

		for (i = 0, j = 1; j <= len - 1; j++)
		{

			if (str.charAt(i) >= 'a')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
			}
			if (str.charAt(j) >= 'a')
			{
				str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j) - 32);
			}

			if (str.charAt(i) == str.charAt(j))
			{
				sum++;
			}
			if (str.charAt(i) != str.charAt(j) || (j == len - 1 && str.charAt(i) == str.charAt(j)))
			{
				flag = 1;
				System.out.printf("(%c,%d)",str.charAt(i),sum + 1);
				i = j;
				sum = 0;
			}

			if (j == len - 1 && sum == 0 && str.charAt(j) != str.charAt(j - 1))
			{
				System.out.printf("(%c,%d)",str.charAt(j),sum + 1);
			}
		}
		if (len == 1)
		{
			if (str.charAt(0) >= 'a')
			{
				str = tangible.StringFunctions.changeCharacter(str, 0, str.charAt(0) - 32);
			}
			System.out.printf("(%c,%d)",str.charAt(i),sum + 1);
		}

		return 0;
	}

}

