package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][15];
		int[] b = new int[100];
		int i;
		int j;
		int k;
		int s;
		int m = 0;
		int x;
		for (i = 0;;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i][0] = Integer.parseInt(tempVar);
		}
		if (a[i][0] == -1)
		{
			break;
		}
		else
		{
		  for (j = 1;;j++)
		  {
			  b[m]++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][j] = Integer.parseInt(tempVar2);
			}
			if (a[i][j] == 0)
			{
				break;
			}
			else
			{
				continue;
			}
		  }
			m++;
		}
		}

			for (i = 0;i < m;i++)
			{
				x = 0;
			for (j = 0;j < b[i];j++)
			{
				s = 0;
			for (k = 0;k < b[i];k++)
			{
				if (a[i][k] * 2 == a[i][j])
				{
			s = s + 1;
				}
			}
			x = x + s;
			}
			System.out.printf("%d\n",x);
			}

			return 0;
	}

}

