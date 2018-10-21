package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
		String a = new String(new char[400]);
		char[][] b = new char[40][20];
		int i = 0;
		int j;
		int k = 0;
		int t = 0;
		c = System.in.read();
		while (c != '\n')
		{
			a = tangible.StringFunctions.changeCharacter(a, i, c);
			i++;
			c = System.in.read();
		}
		a = tangible.StringFunctions.changeCharacter(a, i, ' ');
		for (j = 0;j <= i;j++)
		{
			b[k][t] = a.charAt(j);
			t++;
			if (a.charAt(j) == ' ')
			{
				b[k][t - 1] = '\0';
				k++;
				t = 0;
			}
		}
		for (i = k - 1;i > 0;i--)
		{
			System.out.printf("%s ",b[i]);
		}
		System.out.printf("%s\n",b[0]);
	}
}

