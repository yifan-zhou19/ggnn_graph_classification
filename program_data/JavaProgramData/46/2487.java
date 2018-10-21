package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] sz = new int[number][number];
		int j;
		int k;
		int i;
		int l;
		int mc;
		int a;
		int b;
		int go;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (go = 0;go < a;go++)
		{
			for (i = 0;i < b;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(sz[go][i]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			if (a < b && a % 2 == 0 && i * 2 + 2 >= a)
			{
				for (l = i;l <= b - i - 1;l++)
				{
					System.out.printf("%d\n", sz[i][l]);
				}
				 for (l = i + 1;l <= a - i - 1;l++)
				 {
					System.out.printf("%d\n", sz[l][b - 1 - i]);
				 }
				for (l = b - i - 2;l >= i;l--)
				{
					System.out.printf("%d\n", sz[a - 1 - i][l]);
				}
				break;
			}
			if (a < b && a % 2 != 0 && i * 2 + 2 >= a)
			{
				for (l = i;l <= b - i - 1;l++)
				{
					System.out.printf("%d\n", sz[i][l]);
				}
				break;
			}
			if (a > b && b % 2 != 0 && i * 2 + 2 >= b)
			{
				for (l = i;l <= b - i - 1;l++)
				{
					System.out.printf("%d\n", sz[i][l]);
				}
				for (l = i + 1;l <= a - i - 1;l++)
				{
					System.out.printf("%d\n", sz[l][b - 1 - i]);
				}
				break;
			}
			for (l = i;l <= b - i - 1;l++)
			{
				System.out.printf("%d\n", sz[i][l]);
			}
			for (l = i + 1;l <= a - i - 1;l++)
			{
				System.out.printf("%d\n", sz[l][b - 1 - i]);
			}
			for (l = b - i - 2;l >= i;l--)
			{
				System.out.printf("%d\n", sz[a - 1 - i][l]);
			}
			for (l = a - i - 2;l > i;l--)
			{
				System.out.printf("%d\n", sz[l][i]);
			}
		}
		return 0;
	}
}

