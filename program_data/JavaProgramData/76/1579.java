package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int tmp;
		int i;
		int j;
		int s;
		int t;
		int[][] a = new int[50001][3];
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
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
		}

		for (j = 1;j <= n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (a[i][0] > a[i + 1][0])
				{
				tmp = a[i][0];
				a[i][0] = a[i + 1][0];
				a[i + 1][0] = tmp;
				s = a[i][1];
				a[i][1] = a[i + 1][1];
				a[i + 1][1] = s;
				}
			}
		}
		t = 1;
		tmp = a[0][1];
		for (i = 1;i < n;i++)
		{
			if (a[i][0] > tmp)
			{
				t = 0;
			}
			else if (a[i][1] > tmp)
			{
				tmp = a[i][1];
			}
		}

		if (t == 1)
		{
			System.out.printf("%d %d",a[0][0],tmp);
		}
		else
		{
			 System.out.print("no");
		}

		return 0;
	}

}

