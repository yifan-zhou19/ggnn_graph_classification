package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int k = 0;
		int x;
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

	if (a.length() == b.length())
	{
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			for (j = 0;b.charAt(j) != '\0';j++)
			{
				if (a.charAt(i) == b.charAt(j))
				{
					for (x = j;b.charAt(x) != '\0';x++)
					{
						b = tangible.StringFunctions.changeCharacter(b, x, b.charAt(x + 1));
					}
					k++;
					break;
				}
			}
		}

		if (k == a.length())
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}

	else
	{
	System.out.print("NO");
	}

	}

}

