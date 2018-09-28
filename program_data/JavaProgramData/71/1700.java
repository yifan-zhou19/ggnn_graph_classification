package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[200][3];
		int[] ping = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] run = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int a;
		int b;
		int m;
		int p;
		int sum;
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
				sz[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				sz[i][2] = Integer.parseInt(tempVar4);
			}
		}
		for (int q = 0;q < n;q++)
		{
			if ((sz[q][0] % 400 == 0) || (sz[q][0] % 100 != 0 && sz[q][0] % 4 == 0))
			{
				if (sz[q][1] > sz[q][2])
				{
					sum = 0;
					for (p = sz[q][2];p < sz[q][1];p++)
					{
						sum = sum + run[p - 1];
					}
				}
				else
				{
					sum = 0;
					for (m = sz[q][1];m < sz[q][2];m++)
					{
						sum = sum + run[m - 1];
					}
				}
			}
			else
			{
				if (sz[q][1] > sz[q][2])
				{
					sum = 0;
					for (p = sz[q][2];p < sz[q][1];p++)
					{
						sum = sum + ping[p - 1];
					}
				}
				else
				{
					sum = 0;
					for (m = sz[q][1];m < sz[q][2];m++)
					{
						sum = sum + ping[m - 1];
					}
				}
			}
			if (sum % 7 == 0)
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

