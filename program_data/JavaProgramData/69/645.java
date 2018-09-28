package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
		char c;
		String temp = new String(new char[251]);
		final String add = "";
		int i;
		int j;
		int k;
		int la;
		int lb;

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

		la = a.length();
		lb = b.length();

		add = tangible.StringFunctions.changeCharacter(add, 0, '0');

		if (la > lb)
		{
			k = la;
			la = lb;
			lb = k;
			temp = a;
			a = b;
			b = temp;
		}


		j = lb - 1;
		i = la - 1;

		for (i = la - 1;i >= 0;i--)
		{


			c = a.charAt(i) + b.charAt(j) - 48;
			if (c <= '9')
			{
				add = tangible.StringFunctions.changeCharacter(add, j + 1, add.charAt(j + 1) + c);

				if (add.charAt(j + 1) > '9')
				{
					add = tangible.StringFunctions.changeCharacter(add, j + 1, add.charAt(j + 1) - 10);
				   if (j == 0)
				   {
				add = tangible.StringFunctions.changeCharacter(add, j, '1');
				   }
				else
				{
					add = tangible.StringFunctions.changeCharacter(add, j, '1' - 48);
				}
				}
			}


			else
			{
				add = tangible.StringFunctions.changeCharacter(add, j + 1, add.charAt(j + 1) + c - 10);
				if (j == 0)
				{
				add = tangible.StringFunctions.changeCharacter(add, j, '1');
				}
				else
				{
					add = tangible.StringFunctions.changeCharacter(add, j, '1' - 48);
				}
			}
			j--;
		}

		k = j;
	if (lb > la)
	{
		for (j = k;j >= 0;j--)

		{
			add = tangible.StringFunctions.changeCharacter(add, j + 1, add.charAt(j + 1) + b.charAt(j));
		if (add.charAt(j + 1) > '9')
		{
			add = tangible.StringFunctions.changeCharacter(add, j + 1, add.charAt(j + 1) - 10);
		if (j == 0)
		{
				add = tangible.StringFunctions.changeCharacter(add, j, '1');
		}
				else
				{
					add = tangible.StringFunctions.changeCharacter(add, j, '1' - 48);
				}
		}
		}
	}



	for (i = 0;i < lb + 1;i++)
	{
		if (add.charAt(i) != '0')
		{
			break;
		}
	}
		if (i != lb + 1)
		{
			 k = i;
			for (i = k;i < lb + 1;i++)
			{
				System.out.printf("%c",add.charAt(i));
			}
		}
		else
		{
			System.out.print("0");
		}

				return 0;
	}



}

