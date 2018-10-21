package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		char x;
		int n;
		int i;
		int j = 0;
		int m;
		int k;
		int b;
		int g;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		x = a.charAt(0);
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != x)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, j);
				j = j + 1;
			}
		}
		for (j = 0;j < (n / 2);j++)
		{
			for (i = 0;i < n;i++)
			{
				 if (a.charAt(i) == j)
				 {
					for (k = i - 1;k >= 0;k--)
					{
						if (a.charAt(k) == x)
						{
							a = tangible.StringFunctions.changeCharacter(a, k, j);
							break;
						}
					}
				 }
			}
		}
		for (j = 0;j < (n / 2);j++)
		{
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) == j)
				{
					b = i;
					break;
				}
			}
			for (i = b + 1;i < n;i++)
			{
				if (a.charAt(i) == j)
				{
					g = i;
					break;
				}
			}
			System.out.printf("%d %d\n",b,g);
		}
		return 0;
	}
}

