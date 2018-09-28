package <missing>;

public class GlobalMembers
{
	public static int[] u = new int[100];
	public static int[] p = new int[100];
	public static int[] w = new int[100];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum = 0;
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
				u[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				w[i] = Integer.parseInt(tempVar4);
			}
			if (p[i] > w[i])
			{
				e = p[i];
				p[i] = w[i];
				w[i] = e;
			}
			for (j = p[i];j < w[i];j++)
			{
				if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
				{
					sum += 3;
				}
				if (j == 4 || j == 6 || j == 9 || j == 11)
				{
					sum += 2;
				}
				if (j == 2 && u[i] % 4 == 0 && u[i] % 100 != 0)
				{
					sum += 1;
				}
				if (j == 2 && u[i] % 400 == 0)
				{
					sum += 1;
				}
				if (j == 2 && u[i] % 4 != 0)
				{
					sum += 0;
				}
				if (j == 2 && u[i] % 100 == 0 && u[i] % 400 != 0)
				{
					sum += 0;
				}
			}
			if (sum % 7 == 0)
			{
				System.out.print("YES\n");
				sum = 0;
			}
			else
			{
				System.out.print("NO\n");
				sum = 0;
			}
		}
		return 0;
	}


}

