package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int k;
		int[] l = new int[100];
		char[][] a = new char[100][100];
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 2 * N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		for (j = 0;j < 2 * N;j++)
		{
			for (i = 0;a[j][i] != '\0';i++)
			{
				l[j]++;
			}
		}
		for (i = 0;i < N;i++)
		{
			for (j = 0;j <= 99;j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, '\0');
			}
			for (j = 0;j <= l[2 * i + 1];j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, l[2 * i] - l[2 * i + 1] + j, a[2 * i + 1][j]);
			}
			for (j = 0;j <= 99;j++)
			{
				a[2 * i + 1][j] = b.charAt(j);
			}
		}
		for (j = 0;j < N;j++)
		{
			for (i = (l[2 * j] - 1);i >= 0;i--)
			{
				if (a[2 * j][i] < '0')
				{
					a[2 * j][i] = '9';
					a[2 * j][i - 1]--;
				}
				if (a[2 * j + 1][i] == '\0')
				{
					;
				}
				else if (a[2 * j][i] >= a[2 * j + 1][i])
				{
					a[2 * j][i] = a[2 * j][i] - a[2 * j + 1][i] + '0';
				}
				else if (a[2 * j][i] < a[2 * j + 1][i])
				{
					a[2 * j][i] = a[2 * j][i] - a[2 * j + 1][i] + 10 + '0';
					a[2 * j][i - 1]--;
				}
			}
		}
		for (j = 0;j < N;j++)
		{
			k = 0;
			for (i = 0;i < l[2 * j];i++)
			{
				if ((a[2 * j][i] != '0') || (k == 1))
				{
				k = 1;
				System.out.printf("%c",a[2 * j][i]);
				}
			}
			if (k == 0)
			{
				System.out.print("0");
			}
		System.out.print("\n");
		}
	}

}

