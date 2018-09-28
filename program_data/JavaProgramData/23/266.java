package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String d = new String(new char[100]);
		int i = 0;
		int t = 0;
		do
		{
			d = tangible.StringFunctions.changeCharacter(d, i, '\0');
			i++;
		}while (i < 100);
		d = new Scanner(System.in).nextLine();
		char[][] c = new char[100][100];
		i = 0;
		do
		{
			t = 0;
			do
			{
			c[i][t] = '\0';
			t++;
			}while (t < 99);
			i++;
		}while (i < 100);
		i = 0;
		int q = 0;

		do
		{
			t = 0;
			do
			{
				if (d.charAt(q) != ' ')
				{
					c[i][t] = d.charAt(q);
					t++;
					q++;
				}
				else
				{
					q++;
					break;
				}
			}while (d.charAt(q) != '\0');
			i++;
		}while (d.charAt(q) != '\0');
		i = i - 1;
		while (i >= 1)
		{
			t = 0;
			while (c[i][t] != '\0')
			{
				System.out.printf("%c",c[i][t]);
				t++;
			}
			System.out.print(" ");
			i--;
		}
		 t = 0;
		while (c[0][t] != '\0')
		{
			System.out.printf("%c",c[0][t]);
			t++;
		}
		return 0;
	}

}

