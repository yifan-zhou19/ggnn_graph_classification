package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] c = new char[100][100];
		int i = 0;
		int t;
		while (scanf("%s",c[i]) != EOF)
		{
			c[i];
			i++;
		}
		t = i - 1;
		for (i = t;i >= 0;i--)
		{
			if (i != 0)
			{
			System.out.printf("%s ",c[i]);
			}
			else
			{
				System.out.printf("%s",c[0]);
			}
		}
	}

}
