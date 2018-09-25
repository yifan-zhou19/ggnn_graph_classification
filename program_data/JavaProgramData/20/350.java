package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[100][15];
		char[][] substr = new char[100][4];
		char c;
		char max = 0;
		int i;
		int j;
		int k;
		i = 0;
		while (scanf("%s %s",str[i],substr[i]) != EOF)
		{
			for (j = 0;(c = str[i][j]) != '\0';j++)
			{
				if (max < c)
				{
					max = c;
					k = j;
				}
			}
			for (j = 0;j < k + 1;j++)
			{
				System.out.printf("%c",str[i][j]);
			}
			System.out.printf("%c%c%c",substr[i][0],substr[i][1],substr[i][2]);
			for (j = k + 1;(c = str[i][j]) != '\0';j++)
			{
			System.out.printf("%c",str[i][j]);
			}
			System.out.print("\n");
			i = i++;
			max = 0;
		}

	}

}
