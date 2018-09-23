package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int length;
		int count = 0;
		int i;
		String str = new String(new char[1001]);
		char cube;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		length = str.length();
		for (i = 0;i < length;i++)
		{
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
			str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) + 'A'-'a');
			}
		}
		cube = str.charAt(0);
		for (i = 0;i <= length;i++)
		{
			if (str.charAt(i) == cube)
			{
			count++;
			}
			if (str.charAt(i) != cube)
			{
				System.out.printf("(%c,%d)",cube,count);
				cube = str.charAt(i);
				count = 1;

			}
		}

	}




}

