package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int tmp;
		int i;
		int j;
		int t;
		int[][] a = new int[50001][3];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][2] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i < n;i++)
		{
			t = i;
			for (j = i + 1;j <= n;j++)
			{
				if (a[j][1] < a[t][1])
				{
				   t = j;
				}
			}
			if (t != i)
			{
				tmp = a[i][1];
				a[i][1] = a[t][1];
				a[t][1] = tmp;
				tmp = a[i][2];
				a[i][2] = a[t][2];
				a[t][2] = tmp;
			}
		}

		t = 1;
		tmp = a[1][2];
		for (i = 2;i <= n;i++)
		{
			if (a[i][1] > tmp)
			{
				t = 0;
			}
			else if (a[i][2] > tmp)
			{
				tmp = a[i][2];
			}
		}

		if (t == 1)
		{
			System.out.printf("%d %d",a[1][1],tmp);
		}
		else
		{
			System.out.print("no");
		}

		return 0;
	}

}

