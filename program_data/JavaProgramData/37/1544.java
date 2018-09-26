package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int c;
		int k;
		int l;
		int m;
		int x = 1;
		String a = new String(new char[100000]);
		String b = new String(new char[26]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			x = 1;
			for (j = 0;j < 26;j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, ' ');
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			c = a.length();
			l = 0;
			for (j = 0;j < c;j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (a.charAt(j) == b.charAt(k))
					{
						a = tangible.StringFunctions.changeCharacter(a, j, ' ');
						for (m = 0;m < c;m++)
						{
							if (a.charAt(m) == b.charAt(k))
							{
								a = tangible.StringFunctions.changeCharacter(a, m, ' ');
							}
						}
						break;
					}
					else if (k == 25)
					{
						b = tangible.StringFunctions.changeCharacter(b, l, a.charAt(j));
							l++;
					}
				}

			}
			for (j = 0;j < c;j++)
			{
				if (a.charAt(j) != ' ')
				{
					System.out.printf("%c\n",a.charAt(j));
					x = 0;
					break;
				}
			}
			if (x == 1)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}

