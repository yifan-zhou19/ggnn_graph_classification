package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[2000]);
		int i;
		int j;
		int k;
		int c;
		for (i = 0;i <= 500;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		}
		a = new Scanner(System.in).nextLine();
		for (i = 2;i <= 500;i = i + 2)
		{
			for (j = 0;j <= 500;j++)
			{
				if (a.charAt(j) != '\0')
				{
					c = 1;
					for (k = 0;k <= i / 2;k++)
					{
						if (a.charAt(j + k) != a.charAt(j + i - k - 1))
						{
							c = 0;
							break;
						}
					}
				}
				if (c == 1)
				{
					for (k = j;k <= j + i - 1;k++)
					{
						System.out.printf("%c",a.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

