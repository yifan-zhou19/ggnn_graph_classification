package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		final String c = "";
		char enter;
		int i;
		int j;
		int k;
		int n;
		int m;
		int len1;
		int len2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[0] = tempVar3.charAt(0);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b[i] = tempVar5.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			len1 = String.valueOf(a[i]).length();
			len2 = String.valueOf(b[i]).length();
			for (j = 0;j < len1;j++)
			{
				c.charAt(i)[j] = '0';
			}
			for (j = 0;j < len2;j++)
			{
				c.charAt(i)[j + len1 - len2] = b[i][j];
			}
			for (j = len1 - 1;j >= 0;j--)
			{
				if (c.charAt(i)[j] <= a[i][j])
				{
					a[i][j] = a[i][j] - c.charAt(i)[j] + '0';
				}
				else
				{
					a[i][j] = a[i][j] - c.charAt(i)[j] + '0' + 10;
					a[i][j - 1]--;
				}
			}
			System.out.printf("%s\n",a[i]);
		}
	}

}

