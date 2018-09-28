package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		char[][] some = new char[30][30];
		String it = new String(new char[30]);
		for (i = 0;i < 30;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				some[i] = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				it = tangible.StringFunctions.changeCharacter(it, i, tempVar2);
			}
			if (it.charAt(i) == '\n')
			{
				break;
			}
		}
		for (j = 0;j <= i;j++)
		{
			System.out.printf("%s",some[i - j]);
			if (j != i)
			{
				System.out.print(" ");
			}
		}
	}
}

