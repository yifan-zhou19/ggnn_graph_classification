package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int m;
		String a = new String(new char[550]);
		a = new Scanner(System.in).nextLine();
		k = a.length();
		for (i = k;i >= 1;i--)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i - 1));
		}
		i = 2;
		while (i < k)
		{
			j = 1;
			while (j <= k - i + 1)
			{
				m = j;
				while (m <= j + i - 1)
				{
					if (a.charAt(m) != a.charAt(2 * j + i - 1 - m))
					{
						break;
					}
					m = m + 1;
				}
				if (m == i + j)
				{
					for (m = j;m <= j + i - 1;m++)
					{
						System.out.printf("%c",a.charAt(m));
					}
					System.out.print("\n");
				}
				j = j + 1;
			}
			i = i + 1;
		}
		return 0;
	}
}

