package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int s;
		int t;
		double l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] q = new int[n];
		int[] p = new int[n];
		for (i = 0;i < n;i = i + 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(q[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(p[i]) = Integer.parseInt(tempVar3);
			}
		}
		a = q[0];
		for (i = 0;i < n;i = i + 1)
		{
			if (q[i] < a)
			{
				a = q[i];
			}
		}
		b = 0;
		for (i = 0;i < n;i = i + 1)
		{
			if (p[i] > b)
			{
				b = p[i];
			}
		}
		s = 0;
		for (l = a + 0.5;l < b;l = l + 1)
		{
			t = 0;
			for (i = 0;i < n;i = i + 1)
			{
				if ((l >= q[i]) && (l <= p[i]))
				{
					t = t + 1;
				}
			}
			if (t > 0)
			{
			s = s + 1;
			}
		}
		if (s == b - a)
		{
			System.out.printf("%d %d\n",a,b);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

