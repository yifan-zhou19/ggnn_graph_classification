package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] a = new int[100][2];
		int[] b = new int[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
		}
		j = 0;
		b[j] = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i][0] <= 140 && a[i][0] >= 90 && a[i][1] <= 90 && a[i][1] >= 60)
			{
				b[j] = b[j] + 1;
			}
			else
			{
				j++;
				b[j] = 0;
			}
		}

			t = b[0];
		for (i = 0;i < j;i++)
		{
		t = (t > b[i + 1] != 0?t:b[i + 1]);
		}

	 System.out.printf("%d\n",t);
		return 0;
	}

}

