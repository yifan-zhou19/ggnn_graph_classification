package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int d;
		int b;
		int c = 0;
		d = a.length();
		for (i = 0;i < d;i++)
		{
			if (a.charAt(i) == ' ')
			{
				b = i;
				break;
			}
		}
		if ((d - 2 * b - 1) != 0)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			for (j = 0;j < b;j++)
			{
				for (k = i + 1;k < d;k++)
				{
					if (a.charAt(j) == a.charAt(k))
					{
						c++;
						a = tangible.StringFunctions.changeCharacter(a, k, ' ');
						break;
					}
				}
			}
			if (c == b)
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

