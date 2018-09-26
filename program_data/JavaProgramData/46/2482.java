package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int k;
		int l;
		int m;
		int p;
		int[][] f = new int[num][num];
		p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					f[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;;i++)
		{
			if (p == a * b)
			{
				break;
			}
			for (j = i;j < b - i;j++)
			{
				p++;
				if (p < a * b)
				{
				System.out.printf("%d\n",f[i][j]);
				}
				else
				{
				System.out.printf("%d",f[i][j]);
				break;
				}
			}
			if (p == a * b)
			{
				break;
			}
			for (k = i + 1;k < a - i;k++)
			{
				p++;
				if (p < a * b)
				{
				System.out.printf("%d\n",f[k][b - 1 - i]);
				}
				else
				{
				System.out.printf("%d",f[k][b - 1 - i]);
				break;
				}
			}
			if (p == a * b)
			{
				break;
			}
			for (l = b - 2 - i;l > i - 1;l--)
			{
				p++;
				if (p < a * b)
				{
				System.out.printf("%d\n",f[a - 1 - i][l]);
				}
				else
				{
				System.out.printf("%d",f[a - 1 - i][l]);
				break;
				}
			}
			if (p == a * b)
			{
				break;
			}
			for (m = a - 2 - i;m > i;m--)
			{
					p++;
				if (p < a * b)
				{
				System.out.printf("%d\n",f[m][i]);
				}
				else
				{
				System.out.printf("%d",f[m][i]);
				break;
				}
			}
			if (p == a * b)
			{
				break;
			}
		}
	   return 0;
	}
}

