package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1001]);
	int[] num = new int[27];
	int flag;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		str = tempVar.charAt(0);
	}

	for (j = 0;j <= 27;j++)
	{
		num[j] = 1;
	}
	for (i = 0;i <= str.length();i++)
	{
		if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
		{
	 str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 'a'+'A');
		}
	}

	for (i = 1;i <= str.length();i++)
	{
		if (str.charAt(i) == str.charAt(i - 1))
		{
			num[str.charAt(i) - 'A']++;
		}
		else
		{

		System.out.printf("(%c,%d)",str.charAt(i - 1),num[str.charAt(i - 1) - 'A']);
		num[str.charAt(i - 1) - 'A'] = 1;

		}





	}



















		return 0;
	}



}

