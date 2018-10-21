package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[1000];
		int[][] a = new int[1000][30];
		int i;
		int j;
		int b;
		int c = 0;
		int n;
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
				m[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0;i < n;i++)
		{
				j = 0;
			for (b = 1;b <= 60;b++)
			{
				c++;
			   if (c == a[i][j])
			   {
				   b += 3;
				   j++;
			   }
			}
			System.out.printf("%d\n",c);
			c = 0;
		}

		return 0;
	}

}

