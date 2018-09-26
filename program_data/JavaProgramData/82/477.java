package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int r;
		int t = 0;
		int[] gy = new int[100];
		int[] dy = new int[100];
		int[] tx = new int[100];
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
				gy[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				dy[i] = Integer.parseInt(tempVar3);
			}
			if (gy[i] >= 90 && gy[i] <= 140 && dy[i] >= 60 && dy[i] <= 90)
			{
				t++;
				tx[i] = t;
			}
			else
			{
				t = 0;
				tx[i] = t;
			}
		}
		for (j = n - 1;j > 0;j--)
		{
			for (r = 0;r < j;r++)
			{
				if (tx[r] < tx[r + 1])
				{
					int tmp;
					tmp = tx[r + 1];
					tx[r + 1] = tx[r];
					tx[r] = tmp;
				}
			}
		}
		System.out.printf("%d",tx[0]);
	return 0;
	}


}

