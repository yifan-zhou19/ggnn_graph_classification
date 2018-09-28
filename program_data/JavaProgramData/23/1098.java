package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[100][100];
		int i;
		int n;
		i = 0;
		while (scanf("%s",*(s + i)) != EOF)
		{
			i++;
		}
		n = i;
		for (i = n - 1;i >= 1;i--)
		{
			System.out.printf("%s ",*(s + i));
		}
		System.out.printf("%s", s);
	}

}
