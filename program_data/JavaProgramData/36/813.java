package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int d = 0;
		int j;
		int x;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
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
		if (a.length() == b.length())
		{
			x = a.length();
			for (i = 0;i < x;i++)
			{
				d = 0;
				for (j = 0;j < x;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						d = 1;
						b = tangible.StringFunctions.changeCharacter(b, j, 2);
						break;
					}
				}
				if (d == 0)
				{
					break;
				}
			}
			if (d == 1)
			{
				for (i = 0;i < x;i++)
				{
					if (b.charAt(i) != 2)
					{
						d = 0;
						break;
					}
				}
			}
		}
		if (d == 1)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}

		return 0;
	}


}

