package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		char[][] s = new char[100][100];
		while (scanf("%s",s[i]) != -1)
		{
			i++;
		}
		for (j = i - 1;j >= 1;j--)
		{
			System.out.printf("%s ",s[j]);
		}
		System.out.printf("%s",s[0]);

		return 0;
	}

}
