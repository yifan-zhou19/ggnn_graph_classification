package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[1000]);
		int i;
		int k = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		for (i = 0;i <= 999;i++)
		{
			if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
			}
		}

		for (i = 0;i < 999;i++)
		{
			if (str.charAt(i + 1) == '\0')
			{
				System.out.printf("(%c,%d)",str.charAt(i),k);
				break;
			}

			else if (str.charAt(i) == str.charAt(i + 1))
			{
				k++;
			}
			else if (str.charAt(i) != str.charAt(i + 1))
			{
				System.out.printf("(%c,%d)",str.charAt(i),k);
				k = 1;
			}
		}
	}
}

