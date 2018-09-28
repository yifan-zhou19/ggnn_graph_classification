package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		char[][] a = new char[MAX][MAX];
		for (i = 0; ;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			if (strcmp(a[i],"end") == 0)
			{
				break;
			}
		}
		for (n = i - 1;n >= 0;n--)
		{
			System.out.println(a[n]);
		}
		return 0;
	}

}
