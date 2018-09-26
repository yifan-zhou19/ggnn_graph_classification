package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int s;
		char[][] a = new char[1000][100];
		for (i = 1;;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			if (strcmp(a[i],"end") == 0)
			{
				break;
			}
		}
		for (s = i - 1;s > 0;s--)
		{
			System.out.printf("%s\n",a[s]);
		}
		return 0;
	}
}
