package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String c = new String(new char[50]);
		int i;
		int j;
		int k;
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
		k = a.length();
		for (i = 0;i < 50;i++)
		{
			for (j = i;j < i + k;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j - i, b.charAt(j));
			}
			c = tangible.StringFunctions.changeCharacter(c, k, '\0');
			a = tangible.StringFunctions.changeCharacter(a, k, '\0');
			if (strcmp(a,c) == 0)
			{
				System.out.printf("%d",i);
				break;
			}
		}
	}

}

