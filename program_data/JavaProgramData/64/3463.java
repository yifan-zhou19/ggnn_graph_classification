package <missing>;

public class GlobalMembers
{
	public static int r(int k,int n)
	{
		int i;
		for (i = n - 1;k > i;i--)
		{
			k -= i;
		}
		return (n - i - 1);
	}
	public static int p(int k,int n)
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
		int[] q = new int[50];
		int t;
		int g;
		int h;
		float[] y = new float[50];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int a;
	//	int b;
	//	int c;
	//	}
	//	x[12];
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
				x[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i].b = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				x[i].c = tempVar4;
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
			g = r(q[i] + 1, n);
			h = p(q[i] + 1, n);
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",x[g].a,x[g].b,x[g].c,x[h].a,x[h].b,x[h].c,y[q[i]]);
			}

	}

}

