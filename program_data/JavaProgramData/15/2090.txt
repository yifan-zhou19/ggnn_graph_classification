package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int h;
		int l;
		int s;
		int i;
		int j;
		int p;
		int sum;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sum = 0;
		j = 0;
		for (h = 1;h <= n;h++)
		{
			i = 0;
			for (l = 1;l <= n;l++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					s = Integer.parseInt(tempVar2);
				}
				if (s == 0)
				{
					i++;
				}
			}
			sum = sum + i;
			if (i != 0)
			{
				j++;
			}
		}
		if (j <= 2 || sum <= 2 * j)
		{
			System.out.print("0");
		}
		else
		{
			p = (sum - 2 * j) / 2;
			m = p * (j - 2);
			System.out.printf("%d",m);
		}
		return 0;
	}


}

