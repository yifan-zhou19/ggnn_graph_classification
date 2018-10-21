package <missing>;

public class GlobalMembers
{
	public static char swap(char x)
	{
		char y;
		if (x == 'A')
		{
			y = 'T';
		}
		if (x == 'T')
		{
			y = 'A';
		}
		if (x == 'G')
		{
			y = 'C';
		}
		if (x == 'C')
		{
			y = 'G';
		}
		return y;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		String str = new String(new char[50000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			len = str.length();
			for (j = 0;j < len;j++)
			{
				str = tangible.StringFunctions.changeCharacter(str, j, swap(str.charAt(j)));
			}
			System.out.printf("%s\n",str);
		}
		return 0;
	}

}

