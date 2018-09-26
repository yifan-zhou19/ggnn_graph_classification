package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[1000][100];
		char[][] b = new char[1000][100];
		String[] c = {""};
		int n;
		int i;
		int j;
		int[] r = new int[1000];
		int[] l = new int[1000];
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
			System.out.print("\n");
			l[i] = String.valueOf(a[i]).length();
			r[i] = String.valueOf(b[i]).length();
			for (j = 0;j < r[i];j++)
			{
				b[i][l[i] - j - 1] = b[i][r[i] - j - 1];
			}
			for (j = 0;j < l[i] - r[i];j++)
			{
				b[i][j] = '0';
			}
			for (j = l[i] - 1;j >= 0;j--)
			{
				c[i][j] = a[i][j] - b[i][j];
				if (c[i][j] < 0)
				{
					a[i][j - 1]--;
					c[i][j] = c[i][j] + 10;
				}
				c[i][j] = c[i][j] + 48;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",c[i]);
		}
	}
}

