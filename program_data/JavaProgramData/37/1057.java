package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int t;
		int l;
		char[][] a = new char[100][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			l = -1;
			t = String.valueOf(a[i]).length();
			for (j = 0;j < t;j++)
			{
				m = 1;
				for (k = 0;k < t;k++)
				{
					if (k != j && a[i][j] == a[i][k])
					{
						m = 0;
					}
				}
				if (m == 1)
				{
					l += 1;
					System.out.printf("%c\n",a[i][j]);
					break;
				}
			}
			if (l == -1)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

