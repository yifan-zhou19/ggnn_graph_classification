package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int c;
		int t;
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
		c = a.length();
		for (i = 0;i < c - 1;i++)
		{
			for (j = i + 1;j < c;j++)
			{
				if (a.charAt(j) > a.charAt(i))
				{
					t = a.charAt(j);
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(i));
					a = tangible.StringFunctions.changeCharacter(a, i, t);
				}
			}
		}
		for (i = 0;i < c - 1;i++)
		{
			for (j = i + 1;j < c;j++)
			{
				if (b.charAt(j) > b.charAt(i))
				{
					t = b.charAt(j);
					b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(i));
					b = tangible.StringFunctions.changeCharacter(b, i, t);
				}
			}
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
}

