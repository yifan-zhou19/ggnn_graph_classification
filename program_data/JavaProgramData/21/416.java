package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int j = 0;
		int[] v = new int[2];
		double p;
		double u;
		double w;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			j = j + a[i];
		}
		p = (float)j / (float)n;
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				v[0] = i;
				v[1] = i;
				if ((float)a[i] >= p)
				{
					u = (float)a[i] - p;
				}
				else
				{
					u = p - (float)a[i];
				}
			}
			else
			{
				if ((float)a[i] >= p)
				{
					w = (float)a[i] - p;
				}
				else
				{
					w = p - (float)a[i];
				}
				if (w > u)
				{
					v[0] = i;
					v[1] = i;
					u = w;
				}
				else if (w == u)
				{
					v[1] = i;
				}
			}
		}
		if (a[v[0]] == a[v[1]])
		{
			System.out.printf("%d",a[v[0]]);
		}
		else
		{
			System.out.printf("%d,%d",a[v[0]],a[v[1]]);
		}
	}






}

