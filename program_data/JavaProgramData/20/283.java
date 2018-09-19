package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		char[][] s = new char[100][100];
		int i = 0;
		int j = 0;
		int k;
		int m;
		int n;
		int count;
		int[] lon = new int[100];
		s[0] = new Scanner(System.in).nextLine();
		lon[0] = String.valueOf(s[0]).length();
		n = 1;
		for (i = 1;s[i - 1][0] != '\0';i++)
		{
			s[i] = new Scanner(System.in).nextLine();
			lon[i] = String.valueOf(s[i]).length();
			n++;
		}
		n--;
		for (i = 0;i < n;i++)
		{
			k = 0;
			for (j = 1;s[i][j] != 32;j++)
			{

				if (s[i][j] > s[i][k])
				{
					k = j;
				}
			}
			for (j = 0;j <= k;j++)
			{
				System.out.printf("%c",s[i][j]);
			}
			for (j = lon[i] - 3;j < lon[i];j++)
			{
				System.out.printf("%c",s[i][j]);
			}
			for (j = k + 1;s[i][j] != 32;j++)
			{
				System.out.printf("%c",s[i][j]);
			}
			System.out.print("\n");
		}
	}





}
