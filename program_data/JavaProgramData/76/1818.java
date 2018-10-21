package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] q = new int[100000];
		int[] z = new int[100000];
		int k;
		int e;
		int f;
		int g;
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
				q[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				z[i] = Integer.parseInt(tempVar3);
			}
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (q[i] > q[i + 1])
				{
					e = q[i + 1];
					q[i + 1] = q[i];
					q[i] = e;
					e = z[i + 1];
					z[i + 1] = z[i];
					z[i] = e;
				}
			}
		}
		e = z[0];
		for (k = 1;k < n;k++)
		{
		for (i = 0;i < k;i++)
		{
			if (z[i] >= e)
			{
				e = z[i];
			}
		}
		if (q[k] <= e)
		{
		  f = e;
		  g = 1;
		}
		else
		{
			g = 0;
			break;
		}
		}
		if (g == 1)
		{
		  System.out.printf("%d %d",q[0],f);
		}
		if (g == 0)
		{
			System.out.print("no\n");
		}
		return 0;
	}







}

