package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int a;
		int b;
		int[][] s = new int[100][100];
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
		for (j = 0;j < a;j++)
		{
			for (i = 0;i < b;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[j][i] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 0;j < b;j++)
		{
			k = j;
			for (i = 0;;i++)
			{
				if (i == a)
				{
					break;
				}
				System.out.printf("%d\n",s[i][k]);
				k--;
				if (k < 0)
				{
					break;
				}
			}
		}
		for (j = 1;j < a;j++)
		{
			k = j;
			for (i = b - 1;i >= 0;i--)
			{
				System.out.printf("%d\n",s[k][i]);
				k++;
				if (k == a)
				{
					break;
				}
			}
		}
		return 0;
	}
}

