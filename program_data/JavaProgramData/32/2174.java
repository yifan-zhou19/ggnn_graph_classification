package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i = 0;
		int j = 0;
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		char[][] c =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int len1;
		int len2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m < n;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[m] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[m] = tempVar3.charAt(0);
			}
			len1 = String.valueOf(a[m]).length();
			len2 = String.valueOf(b[m]).length();
			for (i = len1 - 1,j = len2 - 1;i >= len1 - len2,j >= 0;i--,j--)
			{
				if (a[m][i] - b[m][j] >= 0)
				{
					c[m][i] = a[m][i] - b[m][j] + '0';
				}
				else
				{
					a[m][i - 1] = a[m][i - 1] - '1'+'0';
					c[m][i] = a[m][i] - b[m][j] + '0' + 10;
				}
			}
			for (i = len1 - len2 - 1;i >= 0;i--)
			{
				if (a[m][i] >= 0)
				{
					c[m][i] = a[m][i];
				}
				else
				{
					a[m][i - 1] = a[m][i - 1] - '1'+'0';
					c[m][i] = a[m][i] + '0' + 10;
				}

			}
		}
		for (m = 0;m < n;m++)
		{
			System.out.printf("%s\n",c[m]);
		}
	}
}

