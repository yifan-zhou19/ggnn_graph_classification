package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sen = new String(new char[5000]);
		char[][] sz = new char[50][100];
		int i;
		int j;
		int k;
		int n;
		int max = 0;
		int min = 0;
		sen = new Scanner(System.in).nextLine();
		n = sen.length();
		for (i = 0,k = 0;i < n;i++)
		{
			for (j = 0;sen.charAt(i) != ' ' && i < n;i++, j++)
			{
				sz[k][j] = sen.charAt(i);
			}
			sz[k][j] = '\0';
			k++;
		}

		for (i = 0;i < k;i++)
		{
			if (String.valueOf(sz[i]).length() > String.valueOf(sz[max]).length())
			{
				max = i;
			}
			if (String.valueOf(sz[i]).length() < String.valueOf(sz[min]).length())
			{
				min = i;
			}
		}
		System.out.printf("%s\n%s\n",sz[max],sz[min]);
		return 0;
	}
}
