package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;

		String a = new String(new char[101]);
		char[][] b = new char[10][100];
		a = new Scanner(System.in).nextLine();


		n = m = 0;
		i = 0;
		while (a.charAt(i) != '\0')
		{
			while ((a.charAt(i) != ' ') && (a.charAt(i) != '\0'))
			{
				b[n][m] = a.charAt(i);
				i++;
				m++;
			}
			b[n][m] = '\0';
			n++;
			m = 0;
			while (a.charAt(i) == ' ')
			{

				b[n][m] = a.charAt(i);
				m++;
				i++;
			}
			b[n][m] = '\0';
			n++;
			m = 0;
		}
		for (i = n - 1;i >= 0;i--)
		{
			System.out.printf("%s",b[i]);
		}

		return 0;
	}


}
