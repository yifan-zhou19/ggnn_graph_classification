package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[500]);
		char[][] string = new char[2][250];
		int n;
		int i;
		int j;
		int k;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (str.charAt(j) == str.charAt(j + i))
				{
					for (k = 0;k < i + 1;k++)
					{
						String[0][k] = str.charAt(j + k);
						String[0][i + 1] = '\0';
					}
					for (k = i;k >= 0;k--)
					{
						String[1][i - k] = str.charAt(j + k);
						String[1][i + 1] = '\0';
					}
					if (strcmp(String[0],string[1]) == 0)
					{
						System.out.printf("%s\n",string[0]);
					}
				}
			}
		}
	}
}
