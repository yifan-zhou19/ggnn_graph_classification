package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[110][110];
		int j = 0;
		int i;
		while (scanf("%s", s[j]) != EOF)
		{
			j++;
		}
		System.out.printf("%s",s[j - 1]);
		for (i = j - 2;i >= 0;i--)
		{
		System.out.printf(" %s",s[i]);
		}
		System.out.print("\n");
		System.in.read();
		System.in.read();
	}

}
