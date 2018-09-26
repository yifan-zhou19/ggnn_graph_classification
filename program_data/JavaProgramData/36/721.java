package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		char t;
		int i;
		int j;
		int na;
		int nb;
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
		na = a.length();
		nb = b.length();
		if (na != nb)
		{
			System.out.print("NO\n");
		}
		else
		{
			for (i = 0;i < na;i++)
			{
				for (j = i;j < nb;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						t = b.charAt(j);
						b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(i));
						b = tangible.StringFunctions.changeCharacter(b, i, t);
					}
				}
			}

			if (strcmp(a,b) == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}
}

