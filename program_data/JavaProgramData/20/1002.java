package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int j;
		int n;
		int max;
		int maxspot;
		int k = 0;
		int l;
		char[][] str = new char[100][11];
		char[][] substr = new char[100][4];

		while (scanf("%s%s",str[k],substr[k]) != EOF)
		{
		k++;
		}


		for (l = 0;l < k;l++)
		{

		n = String.valueOf(str[l]).length();
		max = str[l][0];
		maxspot = 0;
		for (i = 0;i < n;i++)
		{
			if (str[l][i] > max)
			{
				max = str[l][i];
				maxspot = i;
			}
		}
		for (j = 0;j < maxspot + 1;j++)
		{
			System.out.printf("%c",str[l][j]);
		}
		System.out.printf("%s",substr[l]);
		for (j = maxspot + 1;j < n;j++)
		{
			System.out.printf("%c",str[l][j]);
		}
		System.out.print("\n");

		}



		return 0;
	}







}
