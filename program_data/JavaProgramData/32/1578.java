package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int la;
		int lb;
		int i;
		int j;
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
			la = String.valueOf(a[i]).length();
			lb = String.valueOf(b[i]).length();
			for (j = 1;j <= lb;j++)
			{
				if (a[i][la - j] >= b[i][lb - j])
				{
					a[i][la - j] = a[i][la - j] - b[i][lb - j];
				}
				else
				{
					a[i][la - j] = a[i][la - j] + 10 - b[i][lb - j];
					a[i][la - j - 1] -= 1;
				}
			}
			for (j = 0;j < la - lb;j++)
			{
				a[i][j] = a[i][j] - '0';
			}
			for (j = 0;j < la;j++)
			{
			System.out.printf("%d",a[i][j]);
			}
			System.out.print("\n");
		}

	}
}

