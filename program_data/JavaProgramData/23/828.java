package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		int k1 = 0;
		int k2;
		int l;
		String a = new String(new char[102]);
		char[][] b = new char[50][20];
		a = new Scanner(System.in).nextLine();
		l = a.length();
		a = tangible.StringFunctions.changeCharacter(a, l, ' ');
		a = tangible.StringFunctions.changeCharacter(a, l + 1, '\0');
		for (i = 0;i <= l;i++)
		{
			if (a.charAt(i) == ' ')
			{
				k2 = 0;
				for (;j < i;j++)
				{
					b[k1][k2++] = a.charAt(j);
				}
				j++;
				b[k1][k2++] = '\0';
				k1++;
			}
		}
		for (i = k1 - 1;i > 0;i--)
		{
			System.out.printf("%s ",b[i]);
		}
		System.out.printf("%s",b[0]);
	}
}

