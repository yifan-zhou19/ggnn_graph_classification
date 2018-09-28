package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] c = new char[50][100];
		int[] len = new int[50];
		int i;
		int j;
		int n;
		for (i = 0;scanf("%s",c[i]) != EOF;i++)
		{
			len[i] = String.valueOf(c[i]).length();
		}
		n = i;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (len[i] < len[j])
				{
					break;
				}
			}
			if (j == n)
			{
				System.out.printf("%s\n",c[i]);
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (len[i] > len[j])
				{
					break;
				}
			}
			if (j == n)
			{
				System.out.printf("%s\n",c[i]);
				break;
			}
		}

	}
}
