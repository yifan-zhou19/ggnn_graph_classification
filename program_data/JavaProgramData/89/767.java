package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l = 0;
		int w = 0;
		int[] x = new int[10000];
		int[] y = new int[10000];
		int s;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n * (n + 1);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			w++;
			if (x[i] == 0 && y[i] == 0)
			{
			break;
			}
		}
		for (k = 0;k < n;k++)
		{
			s = 0;
			d = 0;
			for (i = 0;i < w - 1;i++)
			{
					if (x[i] == k)
					{
						s++;
					}
					if (y[i] == k)
					{
						d++;
					}
			}
			if (s == 0 && d == n - 1)
			{
				System.out.printf("%d\n",k);
				l = 1;
			}
		}
		 if (l != 1)
		 {
			 System.out.print("NOT FOUND");
		 }
		return 0;
	}
}

