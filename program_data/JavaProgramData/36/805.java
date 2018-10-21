package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n = 0;
		int temp1;
		int temp2;
		String c1 = new String(new char[100]);
		String c2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c2 = tempVar2.charAt(0);
		}

		if (c1.length() != c2.length())
		{
			System.out.print("NO");
		}

		else
		{
			for (i = 0;i < c1.length() - 1;i++)
			{
				for (j = 0;j < c1.length() - 1 - i;j++)
				{
					if (c1.charAt(j) > c1.charAt(j + 1))
					{
						temp1 = c1.charAt(j);
						c1 = tangible.StringFunctions.changeCharacter(c1, j, c1.charAt(j + 1));
						c1 = tangible.StringFunctions.changeCharacter(c1, j + 1, temp1);
					}
				}
			}
			for (i = 0;i < c2.length() - 1;i++)
			{
				for (j = 0;j < c2.length() - 1 - i;j++)
				{
					if (c2.charAt(j) > c2.charAt(j + 1))
					{
						temp2 = c2.charAt(j);
						c2 = tangible.StringFunctions.changeCharacter(c2, j, c2.charAt(j + 1));
						c2 = tangible.StringFunctions.changeCharacter(c2, j + 1, temp2);
					}
				}
			}

			for (i = 0;i < c1.length();i++)
			{
				if (c1.charAt(i) == c2.charAt(i))
				{
					n++;
				}

			}
			if (n == c1.length())
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}


		}
	}


}

