package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[300][50];
		int i = 0;
		int n;
		int m;
		while (scanf("%s",str[i]) != EOF)
		{
			i++;
		}
		n = i;
		for (i = 0;i < n;i++)
		{
			m = String.valueOf(str[i]).length();
			if (i < n - 1)
			{
				System.out.printf("%d,",m);
			}
			if (i == n - 1)
			{
				System.out.printf("%d",m);
			}
		}
	}
}
