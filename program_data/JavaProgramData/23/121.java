package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m = 0;
		int n = 0;
		int p = 0;
		String a = new String(new char[100]);
		char[][] b = new char[100][100];
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) != ' ')
			{
				m++;
			}
			if (a.charAt(i) == ' ' || i == a.length() - 1)
			{
				for (j = 0;j < m;j++)
				{
				b[n][j] = a.charAt(j + p);
				}
				m = 0;
				p = i + 1;
				n++;
			}
		}
		System.out.printf("%s",b[n - 1]);
		for (i = n - 2;i >= 0;i--)
		{
			System.out.printf(" %s",b[i]);
		}
	}




}
