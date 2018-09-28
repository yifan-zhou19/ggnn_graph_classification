package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[3000]);
		int i;
		int x;
		int t;
		int num = 0;
		a = new Scanner(System.in).nextLine();
		for (t = 0;a.charAt(t) == ' ';)
		{
			t++;
		}
		for (i = 0;a.charAt(i + t) != '\0';i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i + t));
		}
		a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		for (i = 0,x = 0;a.charAt(i) != 0;i++)
		{
			if (a.charAt(i) != ' ')
			{
				num = num + 1;
			}
			else if (a.charAt(i) == ' ')
			{
				if (a.charAt(i - 1) == ' ')
				{
					continue;
				}
				else if (x == 0)
				{
					System.out.printf("%d",num);
					num = 0;
				}
				else
				{
					System.out.printf(",%d",num);
					num = 0;
				}
				x++;
			}
		}
		if (a.charAt(i - 1) != ' ' && x != 0)
		{
			System.out.printf(",%d",num);
		}
		else if (a.charAt(i - 1) != ' ' && x == 0)
		{
			System.out.printf("%d",num);
		}

		System.out.print("\n");
		return 0;
	}
}

