package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int num = 0;
		int i;
		int j;
		for (i = 0;i < 101;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
			num++;
			if (a.charAt(i) == '\n')
			{
				break;
			}
		}
		for (i = 0;i < num;i++)
		{
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				for (j = i + 1;j < num - 1;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
				}
				num--;
				i--;
			}
		}
		for (i = 0;i < num;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		return 0;
	}
}

