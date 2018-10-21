package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] m = new int[50000];
		int[] q = new int[50000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				q[i] = Integer.parseInt(tempVar3);
			}
		}
		int a;
		int b;
		a = m[0];
		b = q[0];
		for (i = 1;i < n;i++)
		{
			if (m[i] < a)
			{
				a = m[i];
			}
			if (q[i] > b)
			{
				b = q[i];
			}
		}
		int k;
		int[] c = new int[50000];
		int[] d = new int[50000];
		for (i = 10 * a;i <= 10 * b;i++)
		{
			c[i] = 1;
		}
		for (i = 0;i < n;i++)
		{
			for (k = 10 * m[i];k <= 10 * q[i];k++)
			{
				d[k] = 1;
			}
		}
		int f = 1;
		for (i = 10 * a;i <= 10 * b;i++)
		{
			if (c[i] != d[i])
			{
				f = 0;
				break;
			}
		}
		if (f == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.printf("%d %d",a,b);
		}

		return 0;
	}
}

