package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int h = 0;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
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
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) == b.charAt(0))
			{
				h = 0;
				for (j = 0;j < b.length();j++)
				{
					if (a.charAt(j + i) == b.charAt(j))
					{
						h++;
					}
				}
				if (h == b.length())
				{
					for (j = 0;j < c.length();j++)
					{
						a = tangible.StringFunctions.changeCharacter(a, j + i, c.charAt(j));
					}
					break;
				}
			}
		}
		System.out.printf("%s\n",a);
		return 0;
	}



}

