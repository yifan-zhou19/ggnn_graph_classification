package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j = 0;
		int t;
		char[][] a = new char[20][20];
		char c;
		while ((c = System.in.read()) != '\n')
		{
			if (c != ' ')
			{
				a[i][j] = c;
				j++;
			}
			else
			{
				a[i][j] = '\0';
				j = 0;


				i++;
			}
		}
		a[i][j] = '\0';
		for (t = i;t > 0;t--)
		{
			System.out.printf("%s ",a[t]);
		}
		System.out.printf("%s",a[0]);
	}
}
