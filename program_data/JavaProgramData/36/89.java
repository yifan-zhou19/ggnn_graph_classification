package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d = tempVar2.charAt(0);
		}
		if (c.length() == d.length())
		{
		for (i = 0;c.charAt(i) != '\0';)
		{
			k = 0;
			for (j = 0;d.charAt(j) != '\0';j++)
			{
				if (c.charAt(i) == d.charAt(j))
				{
					k = 1;
					d = tangible.StringFunctions.changeCharacter(d, j, ' ');
					i = i + 1;
					break;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print("YES");
		}
		}
		else
		{
			System.out.print("NO");
		}
	}

}

