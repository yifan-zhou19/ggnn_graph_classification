package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] q = new int[10000];
		int[] m = new int[10000];
		int h;
		int i;
		int a;
		int b;
		int p;
		int s;
		int j;
		int o;
		int k;
		double l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		i = 0;
		s = 0;
		for (i = 0;i < h;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				q[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m[i] = Integer.parseInt(tempVar3);
			}

		}
		a = q[0];
		b = m[0];
		for (o = 0;o < h;o++)
		{
			if (q[o] < a)
			{
				a = q[o];
			}
		}
		for (k = 0;k < h;k++)
		{
			if (m[k] > b)
			{
				b = m[k];
			}
		}
			for (l = a + 0.5;l < b;l++)
			{
				p = 0;
			for (j = 0;j < h;j++)
			{
				if (l >= q[j] != 0 && l <= m[j])
				{
				p++;
				}
			}
				if (p > 0)
				{
					s++;
				}


			}
		if (s == b - a)
		{
			System.out.printf("%d %d",a,b);
		}
			else
			{
				System.out.print("no");
			}
			return 0;
	}



}

