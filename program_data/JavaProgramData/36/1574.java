package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char t;
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
		int i;
		int j;
		int la = a.length();
		int lb = b.length();
		if (la != lb)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < la;i++)
			{
				for (j = 0;j < la;j++)
				{
					if (a.charAt(i) > a.charAt(j))
					{
						t = a.charAt(i);
						a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(j));
						a = tangible.StringFunctions.changeCharacter(a, j, t);
					}
					if (b.charAt(i) > b.charAt(j))
					{
						t = b.charAt(i);
						b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
						b = tangible.StringFunctions.changeCharacter(b, j, t);
					}
				}
			}
		if (strcmp(a,b))
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print("YES");
		}
		}
		return 0;
	}
}

