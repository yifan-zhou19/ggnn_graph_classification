package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[50]);
		int i;
		int j = 0;
		int k;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != ' ';i++)
		{
			;
		}

		if (a.length() == 2 * i + 1)
		{
			for (i = i + 1;i < a.length();i++,j++)
			{
			b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
			}

			for (i = 0;i < a.length() / 2;i++)
			{
				for (j = 0;j < a.length() / 2;j++)
				{
					if (b.charAt(j) == a.charAt(i))
					{
						b = tangible.StringFunctions.changeCharacter(b, j, a[i] = 2);
					}
				}
			}
			k = a.length();
			for (i = 0;i < a.length() / 2 && b.charAt(i) == a.charAt(i);i++)
			{
				;
			}
			if (i == a.length() / 2)
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

