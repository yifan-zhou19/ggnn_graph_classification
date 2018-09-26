package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[234][2];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		int k;
		int l;
		k = 0;
		l = 0;

		for (i = 0;i < n;i++)
		{
			if (sz[i][0] == 0)
			{
				if (sz[i][1] == 1)
				{
					k++;
				}
				if (sz[i][1] == 2)
				{
					l++;
				}
			}
			else if (sz[i][0] == 1)
			{
				if (sz[i][1] == 0)
				{
					l++;
				}
				if (sz[i][1] == 2)
				{
					k++;
				}
			}
			else
			{
				if (sz[i][1] == 0)
				{
					k++;
				}
				if (sz[i][1] == 1)
				{
					l++;
				}
			}
		}
		if (k > l)
		{
			System.out.print("A");
		}
		else if (k < l)
		{
			System.out.print("B");
		}
		else
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

