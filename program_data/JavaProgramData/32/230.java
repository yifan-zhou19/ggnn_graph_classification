package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		int n;
		int l1;
		int l2;
		int j = 48;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i < n;i++)
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
		for (i = 1;i <= n;i++)
		{
			l1 = String.valueOf(a[i]).length();
			l2 = String.valueOf(b[i]).length();
			for (j = 0;j < l2;j++)
			{
				a[i][l1 - j - 1] = '0' + a[i][l1 - j - 1] - b[i][l2 - j - 1];
				if ((a[i][l1 - j - 1]) < '0')
				{
					a[i][l1 - j - 2] = a[i][l1 - j - 2] - 1;
					a[i][l1 - j - 1] = a[i][l1 - j - 1] + 10;
				}
			}
			System.out.printf("%s\n",a[i]);
		}
	}
}

