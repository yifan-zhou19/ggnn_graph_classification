package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int i;
		int j;
		char[][] num = new char[101][101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < (2 * n);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = tempVar2.charAt(0);
			}
		}
		a = 0;
		b = 0;
		for (i = 0;i < (2 * n - 1);i = i + 2)
		{
			a = String.valueOf(num[i]).length();
			b = String.valueOf(num[i + 1]).length();
			for (j = b;j >= 0;j--)
			{
				num[i + 1][a - b + j] = num[i + 1][j];
			}
			for (j = 0;j < a - b;j++)
			{
				num[i + 1][j] = '0';
			}
				c = 0;
				d = 0;
			for (j = a - 1;j >= 0;j--)
			{
				c = (10 + num[i][j] - '0') - (num[i + 1][j] - '0') - d;
				num[i][j] = c % 10 + '0';
				if (c < 10)
				{
					d = 1;
				}
				else
				{
					d = 0;
				}
			}
			System.out.printf("%s\n",num[i]);

		}

	}
}

