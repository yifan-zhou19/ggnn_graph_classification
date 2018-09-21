package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int t;
		int n = 0;
		int m = 0;
		int k = 0;
		String a = new String(new char[100]);
		char[][] b = new char[100][100];
		a = new Scanner(System.in).nextLine();
		t = a.length();
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				b[i][j] = 0;
			}
		}

		for (i = 0;i < t;i++)
		{
			if ((a.charAt(i) >= 65 && a.charAt(i) <= 90) || (a.charAt(i) >= 97 && a.charAt(i) <= 122))
			{
				j = k;
				b[j][n] = a.charAt(i);
				n++;
				m = 1;
			}
			else if (m == 1)
			{
				k++;
				b[j][n] = 0;
				n = 0;
				m = 0;
			}
		}
		System.out.printf("%s",b[j]);
		for (i = j - 1;i >= 0;i--)
		{
		System.out.printf(" %s",b[i]);
		}
	}

}
