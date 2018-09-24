package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		char[][] a = new char[501][500];
		for (i = 0;;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			if (a[i][0] == 'e')
			{
				m = i;
				break;
			}
		}
		for (i = m - 1;i >= 0;i--)
		{
			System.out.println(a[i]);
		}
		return 0;
	}

}
