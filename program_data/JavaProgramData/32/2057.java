package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int as;
		int bs;
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
			System.in.read();
		}
		for (i = 1;i <= n;i++)
		{
			as = String.valueOf(a[i]).length();
			bs = String.valueOf(b[i]).length();
			for (j = 0;j < as;j++)
			{
				a[i][j] -= '0';
			}
			for (j = 0;j < bs;j++)
			{
				b[i][j] -= '0';
			}
			for (j = 1;j <= bs;j++)
			{
				a[i][as - j] -= b[i][bs - j];
				if (a[i][as - j] < 0)
				{
					a[i][as - j - 1]--;
					do
					{
					a[i][as - j] += 10;
					} while (a[i][as - j] < 0);
				}
			}
			t = 0;
			while (a[i][t] == 0)
			{
				t++;
			}
			for (j = t;j < as;j++)
			{
				System.out.printf("%d",a[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

