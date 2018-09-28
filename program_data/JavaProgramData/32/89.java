package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
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
		}
		int p;
		int q;
		int j;
		int k;
		for (i = 0;i < n;i++)
		{
			p = String.valueOf(a[i]).length();
			q = String.valueOf(b[i]).length();
			for (j = q - 1,k = p - 1;j >= 0;j--,k--)
			{
				if (a[i][k] >= b[i][j])
				{
					a[i][k] = a[i][k] - b[i][j] + 48;
				}
				else if (a[i][k] < b[i][j])
				{
					a[i][k] = a[i][k] - b[i][j] + 58;
					a[i][k - 1] = a[i][k - 1] - 1;
				}
			}
			for (k = 0;k < p;k++)
			{
				if (a[i][k] != 0)
				{
					System.out.printf("%c",a[i][k]);
					j = k;
					break;
				}
			}
			for (k = j + 1;k < p;k++)
			{
				System.out.printf("%c",a[i][k]);
			}
			System.out.print("\n");
		}
	}
}

