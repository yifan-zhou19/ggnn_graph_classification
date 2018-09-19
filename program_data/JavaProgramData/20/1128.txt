package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String str = "";
		char[][] substr = new char[20][3];
		int i = 0;
		int j;
		int max;
		int k;
		while (scanf("%s%s",str.charAt(i),substr[i]) != EOF)
		{
			i++;
		}
		for (i = 0;str.charAt(i)[0] != '\0';i++)
		{
			k = 0;
			max = str.charAt(i)[0];
			for (j = 0;str.charAt(i)[j] != '\0';j++)
			{
				if (str.charAt(i)[j] > max)
				{
					max = str.charAt(i)[j];
					k = j;
				}
			}
			for (j = 0;j <= k;j++)
			{
				System.out.printf("%c",str.charAt(i)[j]);
			}
			for (j = 0;j < 3;j++)
			{
				System.out.printf("%c",substr[i][j]);
			}
			for (j = k + 1;str.charAt(i)[j] != '\0';j++)
			{
				System.out.printf("%c",str.charAt(i)[j]);
			}
			System.out.print("\n");
		}
	}
}
