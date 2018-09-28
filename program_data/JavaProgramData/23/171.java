package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String A = new String(new char[101]);
		char[][] B = new char[101][101];
		A = new Scanner(System.in).nextLine();
		int i;
		int l;
		int j;
		int k;
		int m;
		l = A.length();
		j = 0;
		m = 0;
		for (i = 0;i <= l;i++)
		{
			if (A.charAt(i) == 32 || i == l)
			{
				for (k = m;k < i;k++)
				{
					B[j][k - m] = A.charAt(k);
				}
				B[j][k - m] = '\0';
				j++;
				m = i + 1;
			}
		}
		for (i = j - 1;i > 0;i--)
		{
			for (k = 0;B[i][k] != '\0';k++)
			{
				System.out.printf("%c",B[i][k]);
			}
			System.out.print(" ");
		}
		for (k = 0;B[i][k] != '\0';k++)
		{
			System.out.printf("%c",B[i][k]);
		}
	}
}
