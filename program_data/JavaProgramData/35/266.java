package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a;
		int b;
		int n1;
		int n2;
		int k1 = 0;
		int k2 = 0;
		int[][] fa = new int[8][8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
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
					fa[i][j] = Integer.parseInt(tempVar3);
				}
			}
			System.out.print("\n");
		}
		n1 = fa[0][0];
		for (j = 0;j < b;j++)
		{
			if (fa[0][j] > n1)
			{
				n1 = fa[0][j];
				k2 = j;
			}
		}

		for (i = 0,n2 = fa[0][k2];i < a;i++)
		{
			if (fa[i][k2] < n2)
			{
				n2 = fa[i][k2];
				k1 = i;
			}
		}


		if (n2 == n1)
		{
			System.out.printf("%d+%d\n",k1,k2);
		}
		else
		{
			System.out.print("No\n");
		}
		return 0;
	}

}

