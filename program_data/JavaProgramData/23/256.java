package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		char[][] b = new char[101][101];
		int i;
		int j;
		int k;
		int t;
		a = new Scanner(System.in).nextLine();
		for (i = 0,j = 0,k = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) != ' ')
			{
				b[j][k] = a.charAt(i);
				k++;
				if (a.charAt(i + 1) == ' ')
				{
					b[j][k] = '\0';
					j++;
					k = 0;
				}
				else
				{
					if (a.charAt(i + 1) == '\0')
					{
						 b[j][k] = '\0';
						j++;
						k = 0;
					}
				}
			}

		}
		for (t = j - 1;t >= 0;t--)
		{
			System.out.printf("%s",b[t]);
			if (t != 0)
			{
				System.out.print(" ");
			}
		}
		System.out.print("\n");
		return 0;
	}

}
