package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] c1 = new char[50][100];
		char[][] c2 = new char[50][100];
		char[][] ch1 = new char[50][200];
		char[][] ch2 = new char[50][100];
		int i;
		int j;
		int m;
		int n = 0;
		int[] a = new int[50];
		while (scanf("%s%s",c1[n],c2[n]) != EOF)
		{
			m = c1[n][0];
			for (j = 1;c1[n][j] != '\0';j++)
			{
				if (m < c1[n][j])
				{
					a[n] = j;
					m = c1[n][j];
				}
			}
			n++;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j <= a[i];j++)
			{
				ch1[i][j] = c1[i][j];
			}
			for (;j < String.valueOf(c1[i]).length();j++)
			{
				ch2[i][j - a[i] - 1] = c1[i][j];
			}
			ch1[i] += c2[i];
			ch1[i] += ch2[i];
		}
		for (i = 0;i < n;i++)
		{
			System.out.println(ch1[i]);
		}
		return 0;
	}

}
