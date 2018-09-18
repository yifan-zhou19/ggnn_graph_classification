package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int s = 0;
		int n;
		int i;
		int j;
		int[] b = new int[26];
		int t;
		int x;
		int m;
		int q;
		char[][] a = new char[1000][27];
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
			t = String.valueOf(a[i]).length();
			for (j = 4;j < t;j++)
			{
				x = a[i][j];
				b[x - 65] = b[x - 65] + 1;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (b[i] > s)
			{
				s = b[i];
				x = i;
			}
		}
		System.out.printf("%c\n",x + 65);
		System.out.printf("%d\n",s);
		for (i = 0;i < n;i++)
		{
			t = String.valueOf(a[i]).length();
			for (j = 4;j < t;j++)
			{
				m = a[i][j];
				if (m == x + 65)
				{
					for (q = 0;q < 2;q++)
					{
						System.out.printf("%c",a[i][q]);
					}
					System.out.printf("%c\n",a[i][2]);
				}
			}
		}





	}
}

