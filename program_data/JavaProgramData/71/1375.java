package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int nian;
		int[] y = new int[2];
		int[] q = {0, 0};
		int k;
		int a;
		int e;
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
				nian = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[0] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				y[1] = Integer.parseInt(tempVar4);
			}
			for (k = 0;k < 2;k++)
			{
				for (e = 1;e < y[k];e++)
				{
			if (e == 1 || e == 3 || e == 5 || e == 7 || e == 8 || e == 10 || e == 12)
			{
				  q[k] += 3;
			}
			else if (e == 4 || e == 6 || e == 9 || e == 11)
			{
				q[k] += 2;
			}
			else if (e == 2)
			{
				if (nian % 400 == 0 || (nian % 4 == 0 && nian % 100 != 0))
				{
					q[k] += 1;
				}
				else
				{
					q[k] += 0;
				}
			}
				}
			}
			a = (q[1] - q[0]) % 7;
			q[0] = 0;
	q[1] = 0;
			if (a == 0)
			{
				System.out.print("YES\n");

			}
			else
			{
				System.out.print("NO\n");

			}

		}

		return 0;
	}
}

