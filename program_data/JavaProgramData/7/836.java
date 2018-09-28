package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		int i;
		int j;
		int f;
		int d;
		int k = 0;
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
		d = a.length();
		f = c.length();
		for (i = 0;i < d;i++)
		{
			if (a.charAt(i) == b.charAt(0) && a.charAt(i + 1) == b.charAt(1) && a.charAt(i + 2) == b.charAt(2) && a.charAt(i + 3) == b.charAt(3))
			{
				for (j = i;j < i + f;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, c.charAt(k));
					k++;
				}
				break;
			}
		}
		System.out.printf("%s",a);
		return 0;
	}

}

