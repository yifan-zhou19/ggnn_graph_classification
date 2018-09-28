package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int m;
		int c;
		int h;
		double e;
		int[] p = new int[50001];
		int[] q = new int[50001];
		int[] s = new int[5001];
		int[] t = new int[50001];
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
				p[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				q[i] = Integer.parseInt(tempVar3);
			}
			s[i] = p[i];
			t[i] = q[i];
		}
		for (k = 1;k < n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (p[i] > p[i + 1])
				{
				   m = p[i];
				   p[i] = p[i + 1];
				   p[i + 1] = m;
				}
				if (q[i] < q[i + 1])
				{
					c = q[i];
					q[i] = q[i + 1];
					q[i + 1] = c;
				}
			}
		}
		for (e = 1.0 * p[0];e <= 1.0 * q[0];e = e+0.5)
		{
			h = 0;
			for (k = 0;k < n;k++)
			{
				if (e >= 1.0 * s[k] && e <= 1.0 * t[k])
				{
					break;
				}
				else
				{
					h++;
				}
			}
			if (h == n)
			{
				System.out.print("no");
				return 0;
			}
		}
		System.out.printf("%d %d",p[0],q[0]);

		return 0;
	}
}

