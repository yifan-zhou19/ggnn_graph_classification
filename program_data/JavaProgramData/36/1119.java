package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
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
		char c;
		if (la != lb)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < la;i++)
			{
				for (j = i + 1;j < la;j++)
				{
					if (a.charAt(i) < a.charAt(j))
					{
						c = a.charAt(i);
						a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(j));
						a = tangible.StringFunctions.changeCharacter(a, j, c);
					}
				}
			}
			for (i = 0;i < lb;i++)
			{
				for (j = i + 1;j < lb;j++)
				{
					if (b.charAt(i) < b.charAt(j))
					{
						c = b.charAt(i);
						b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
						b = tangible.StringFunctions.changeCharacter(b, j, c);
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
		return 0;
	}
}

