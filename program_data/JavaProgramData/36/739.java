package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10]);
		String b = new String(new char[10]);
		int i;
		int j;
		char m;
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
		for (i = 0;i < 10;i++)
		{
			for (j = i;j < 10;j++)
			{
				if (b.charAt(j) == a.charAt(i))
				{
					if (a.charAt(i) == '\0')
					{
						break;
					}
					m = b.charAt(i);
					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
					b = tangible.StringFunctions.changeCharacter(b, j, m);
				}
			}
		}
		if (strcmp(a,b) != 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print("YES");
		}
	}
}

