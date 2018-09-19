package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 0;
		int j;
		int[] l = new int[100];
		int[] m = new int[100];
		char[][] str = new char[100][13];
		char[][] substr = new char[100][13];
		while (scanf("%s%s",substr[i],str[i]) != EOF)
		{
			i++;
		}
		n = i;
		for (i = 0;i < n;i++)
		{
			l[i] = String.valueOf(substr[i]).length();
			for (j = 1;j < l[i];j++)
			{
				if (substr[i][j] > substr[i][m[i]])
				{
					m[i] = j;
				}
			}
			for (j = l[i] - 1;j > m[i];j--)
			{
				substr[i][j + 3] = substr[i][j];
			}
			substr[i][m[i] + 1] = str[i][0];
			substr[i][m[i] + 2] = str[i][1];
			substr[i][m[i] + 3] = str[i][2];
			System.out.printf("%s\n",substr[i]);
		}
	}
}
