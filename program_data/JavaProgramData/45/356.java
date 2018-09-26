package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		String c = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (i = 0;i < b.length();i++)
		{
			if (b.charAt(i) == a.charAt(0))
			{
				for (j = 0;j < a.length();j++)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, b.charAt(i + j));
				}
				c = tangible.StringFunctions.changeCharacter(c, j, '\0');
			}
			if (strcmp(c,a) == 0)
			{
				System.out.printf("%d\n",i);
				break;
			}
		}
	}
}

