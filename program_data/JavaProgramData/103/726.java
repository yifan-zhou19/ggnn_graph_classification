package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int c;
		int d = 1;
		String a = new String(new char[10000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		c = a.length();
		for (i = 0;i < c;i++)
		{
			if (a.charAt(i) > 96 && a.charAt(i) < 123)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		for (i = 0;i < c;i++)
		{
				if (a.charAt(i) == a.charAt(i + 1))
				{
					d++;
				}
				else
				{
					System.out.printf("(%c,%d)",a.charAt(i),d),d = 1;
				}
		}
	}
}

