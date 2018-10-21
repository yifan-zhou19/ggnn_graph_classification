public class point
{
	public int a;
	public int b;
	public int c;
}

package <missing>;

public class GlobalMembers
{
		public static point[] x = tangible.Arrays.initializeWithDefaultpointInstances(10);
	public static int d(int k,int n)
	{
		int i;
		for (i = n - 1;k > i;i--)
		{
			k -= i;
		}
		return (n - i - 1);
	}
	public static int f(int k,int n)
	{
		int i;
		for (i = n - 1;k > i;i--)
		{
			k -= i;
		}
		return (n - i + k - 1);
	}
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int[] q = new int[46];
		int t;
		float[] y = new float[46];
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
				x[i].a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				x[i].b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				x[i].c = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++,k++)
			{
				y[k] = Math.sqrt((x[i].a - x[j].a) * (x[i].a - x[j].a) + (x[i].b - x[j].b) * (x[i].b - x[j].b) + (x[i].c - x[j].c) * (x[i].c - x[j].c));
			}
		}
			for (i = 0;i <= n * (n - 1) / 2;i++)
			{
				q[i] = i;
			}
		for (i = 0;i < n * (n - 1) / 2 - 1;i++)
		{
			for (j = 0;j < n * (n - 1) / 2 - 1 - i;j++)
			{
				if (y[q[j]] < y[q[j + 1]])
				{
					t = q[j];
				q[j] = q[j + 1];
				q[j + 1] = t;
				}
			}
		}
			for (i = 0;i < n * (n - 1) / 2;i++)
			{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",x[d(q[i] + 1, n)].a,x[d(q[i] + 1, n)].b,x[d(q[i] + 1, n)].c,x[f(q[i] + 1, n)].a,x[f(q[i] + 1, n)].b,x[f(q[i] + 1, n)].c,y[q[i]]);
			}
	}

}

