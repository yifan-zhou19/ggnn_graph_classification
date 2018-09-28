package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		char c;
		int i;
		int k;
		int numa;
		int numb;
		int n;
		int j;
		int j0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i <= 100;i++)
		{
			for (j = 0;j <= 100;j++)
			{
				a[i][j] = '\0';
				b[i][j] = '\0';
			}
		}

		for (i = 1;i <= n;i++)
		{
			k = 1;
			while ((c = System.in.read()) != '\n')
			{
				a[i][k++] = c;
			}
			k = 1;
			while ((c = System.in.read()) != '\n')
			{
				b[i][k++] = c;
			}
			System.in.read();
		}

		for (i = 1;i <= n;i++)
		{
			for (numa = 1;;numa++)
			{
				if (a[i][numa] == '\0')
				{
					break;
				}
			}
			for (numb = 1;;numb++)
			{
				if (b[i][numb] == '\0')
				{
					break;
				}
			}
			numa--;
			numb--;
			for (j = 0;j <= numa - 1 && b[i][numb - j] >= '0' && b[i][numb - j] <= '9';j++)
			{
				a[i][numa - j] = a[i][numa - j] - b[i][numb - j];
				if (a[i][numa - j] < 0)
				{
					a[i][numa - j] = a[i][numa - j] + 10;
					a[i][numa - j - 1] = a[i][numa - j - 1] - 1;
				}
				a[i][numa - j] = a[i][numa - j] + '0';
			}
		}

		for (i = 1;i <= n;i++)
		{
			for (j0 = 1;;j0++)
			{
				if (a[i][j0] != '0')
				{
					break;
				}
			}
			for (j = j0;a[i][j] != '\0';j++)
			{
				System.out.printf("%c",a[i][j]);
			}
			System.out.print("\n");
		}
	}
}

