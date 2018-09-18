package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[11][13];
		char[][] substr = new char[11][3];
		int[] l = new int[11];
		int i;
		int j;
		int n = 0;
		int[] max = new int[11];
		while (scanf("%s %s",str[n],substr[n]) != EOF)
		{
			n++;
		}
		for (i = 0;i < n;i++)
		{
			l[i] = String.valueOf(str[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			max[i] = 0;
			for (j = 1;j < l[i];j++)
			{
				if (str[i][j] > str[i][max[i]])
				{
					max[i] = j;
				}
				else
				{
					max[i] = max[i];
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = l[i] - 1;j >= max[i] + 1;j--)
			{
				str[i][j + 3] = str[i][j];
			}
		}
		for (i = 0;i < n;i++)
		{
			str[i][max[i] + 1] = substr[i][0];
			str[i][max[i] + 2] = substr[i][1];
			str[i][max[i] + 3] = substr[i][2];
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < l[i] + 2;j++)
			{
				System.out.printf("%c",str[i][j]);
			}
			System.out.printf("%c\n",str[i][l[i] + 2]);
		}
	}
}
