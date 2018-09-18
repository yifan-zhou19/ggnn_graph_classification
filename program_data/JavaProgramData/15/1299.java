package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int k;
		int s;
		s = 0;
		int e;
		int b;
		int c;
		int d;
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(a[i][k]) = Integer.parseInt(tempVar2);
				}
				if (a[i][k] == 0)
				{
				s = s + 1;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
				if (a[i][k] == 0)
				{
					e = i;
					b = k;
					break;
				}
			}
		}
		for (k = b;k < n;k++)
		{
			if (a[e][k] == 255)
			{
				break;
			}
		}
		c = k - 1;
		d = (s - 2 * (c - b + 1)) / 2;
		int S;
		S = d * (c - b - 1);
		System.out.printf("%d",S);
		return 0;
	}

}

