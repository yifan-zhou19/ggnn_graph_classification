package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int p;
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		p = b.length();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == b.charAt(0))
			{
				for (j = i,k = 0;k < p;j++,k++)
				{
					if (a.charAt(j) != b.charAt(k))
					{
						break;
					}
				}
					if (k == p)
					{
						for (j = i,k = 0;k < p;j++,k++)
						{
							a = tangible.StringFunctions.changeCharacter(a, j, c.charAt(k));
						}
							System.out.printf("%s",a);
							break;
					}
			}
		}
			if (a.charAt(i) == '\0')
			{
				System.out.printf("%s",a);
			}
	}
}

