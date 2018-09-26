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
		int x;
		int y;
			 x = a.length();
			 y = b.length();
		int i;
		int j;
			 char t;
		if (x != y)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < x;i++)
			{
				for (j = i + 1;j < x;j++)
				{
					if (a.charAt(i) < a.charAt(j))
					{
						t = a.charAt(i);
						a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(j));
						a = tangible.StringFunctions.changeCharacter(a, j, t);
					}
				}
			}
			for (i = 0;i < y;i++)
			{
				for (j = i + 1;j < y;j++)
				{
					if (b.charAt(i) < b.charAt(j))
					{
						t = b.charAt(i);
						b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
						b = tangible.StringFunctions.changeCharacter(b, j, t);
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

