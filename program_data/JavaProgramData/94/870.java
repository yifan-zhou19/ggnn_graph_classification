package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] as = new int[500];
		int[] k = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(as[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (int j = 0;j < n;j++)
		{
			for (int t = 0;t < n - j;t++)
			{
				if (as[t] > as[t + 1])
				{
					int e = as[t + 1];
					as[t + 1] = as[t];
					as[t] = e;
				}
			}
		}
		int y = 0;
		for (int g = 0;g < n;g++)
		{
			if (as[g] % 2 != 0)
			{
				k[y] = as[g];
				y++;
			}
		}
		for (int a = 0;a < y;a++)
		{
			if (a != y - 1)
			{
				System.out.printf("%d,",k[a]);
			}
			else
			{
				System.out.printf("%d",k[a]);
			}
		}
		return 0;
	}





}

