package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		String a = new String(new char[55]);
		String b = new String(new char[55]);
		String c = new String(new char[55]);
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
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			if (b.charAt(i) == a.charAt(0))
			{
				k = 0;
				for (j = i;j < i + a.length();j++)
				{
					c = tangible.StringFunctions.changeCharacter(c, k, b.charAt(j));
					k++;
				}
				c = tangible.StringFunctions.changeCharacter(c, k, '\0');
				if (strcmp(a,c) == 0)
				{
					System.out.printf("%d",i);
					return 0;
				}
			}
		}
	}

}

