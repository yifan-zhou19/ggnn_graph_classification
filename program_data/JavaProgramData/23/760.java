package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int n = 1;
		int[] c = new int[100];
		String a = new String(new char[101]);
		char[][] b = new char[100][100];
		a = new Scanner(System.in).nextLine();

		for (i = 0;i <= a.length() - 1;i++)
		{
			if (a.charAt(i) == ' ')
			{
				c[n] = k;
				n++;
				k = 0;
			}
			else
			{
				k++;
				b[n][k] = a.charAt(i);
			}
		}
		c[n] = k;
		for (i = n;i >= 1;i--)
		{
			for (j = 1;j <= c[i];j++)
			{
				System.out.printf("%c",b[i][j]);
			}
			if (i != 1)
			{
				System.out.print(" ");
			}
		}
	}
}
