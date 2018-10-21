package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		char[][] b = new char[100][20];
		char c;
		int n;
		int i;
		int j = 0;
		int k = 0;
		int w;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		a = tangible.StringFunctions.changeCharacter(a, n, ' ');
		for (i = 0;i <= n;i++)
		{
			if (a.charAt(i) != ' ')
			{
				b[j][k] = a.charAt(i);
				k++;
			}
			else
			{
				b[j][k] = a.charAt(i);
				j++;
				k = 0;
			}
		}
		w = j - 1;
		for (i = w;i > 0;i--)
		{
			for (j = 0;(c = b[i][j]) != ' ';j++)
			{
				System.out.printf("%c",b[i][j]);
			}
			System.out.print(" ");
		}
		for (j = 0;(c = b[i][j]) != ' ';j++)
		{
			System.out.printf("%c",b[0][j]);
		}
	}


}

