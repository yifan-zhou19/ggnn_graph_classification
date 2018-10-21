package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] str = new int[105][105];
		int i = 0;
		int j;
		while (scanf("%s",str[i]) != EOF)
		{
			str[i];
		   i++;
		}
		for (j = i - 1;j >= 0;j--)
		{
			if (j != 0)
			{
				System.out.printf("%s ",str[j]);
			}
			else
			{
				System.out.printf("%s",str[j]);
			}
		}
	}

}
