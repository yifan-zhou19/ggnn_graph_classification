package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		final String c = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int la = a.length();
		int lb = b.length();
		int i;
		int j;
		for (i = 0;i < lb;i++)
		{
			for (j = i;j < i + la;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j - i, b.charAt(j));
			}
			if (strcmp(a,c) == 0)
			{
				System.out.printf("%d\n",i);
				break;
			}
		}
		return 0;
	}
}

