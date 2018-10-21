package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int max = 0;
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		char c;
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
		for (i = 0;i < 1000;i++)
		{
			if (a.charAt(i) == '\0')
			{
				break;
			}
			for (j = i;j < 1000;j++)
			{
				if (a.charAt(j) == '\0')
				{
					break;
				}
				else
				{
					if (a.charAt(j) > a.charAt(max))
					{
						max = j;
					}
				}
			}
			c = a.charAt(i);
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(max));
			a = tangible.StringFunctions.changeCharacter(a, max, c);
			max = i + 1;
		}
			for (i = 0;i < 1000;i++)
			{
			if (b.charAt(i) == '\0')
			{
				break;
			}
			for (j = i;j < 1000;j++)
			{
				if (b.charAt(j) == '\0')
				{
					break;
				}
				else
				{
					if (b.charAt(j) > b.charAt(max))
					{
						max = j;
					}
				}
			}
			c = b.charAt(i);
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(max));
			b = tangible.StringFunctions.changeCharacter(b, max, c);
			max = i + 1;
			}
		if (strcmp(a,b) == 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
		return 0;
	}
}

