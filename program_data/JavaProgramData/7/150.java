package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int result;
		String input = new String(new char[100]);
		String substring = new String(new char[20]);
		String replace = new String(new char[20]);
		String cpy = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			input = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			substring = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			replace = tempVar3.charAt(0);
		}
		result = input.length() - substring.length();
		for (i = 0;i <= result;i++)
		{
			if (input.charAt(i) == substring.charAt(0))
			{
				int a;
				a = substring.length();
				for (j = 0;j < a;j++)
				{
					cpy = tangible.StringFunctions.changeCharacter(cpy, j, input.charAt(i + j));
					cpy = tangible.StringFunctions.changeCharacter(cpy, j + 1, '\0');
				}
				int m;
				m = strcmp(cpy,substring);
				if (m == 0)
				{

					for (k = 0;k < i;k++)
					{
						System.out.printf("%c",input.charAt(k));
					}
					System.out.printf("%s",replace);
					for (k = i + a;k < input.length();k++)
					{
						System.out.printf("%c",input.charAt(k));
					}
					return 0;
				}
			}
		}
		System.out.printf("%s",input);
		return 0;
	}
}

