package <missing>;

public class GlobalMembers
{
	public static int row(int a,int n)
	{
		int i = n - 1;
		while (a > i)
		{
			a -= i;
			i -= 1;
		}
		return (n - 1 - i);
	}
	public static int col(int a,int n)
	{
		int i = n - 1;
		while (a > i)
		{
			a -= i;
			i -= 1;
		}
		return (n - 1 - i + a);
	}
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct spot
	//	{
	//		int x;
	//	int y;
	//	int z;
	//	}
	//	a[11];
		int n;
		int i;
		int j;
		int l = 0;
		int[] c = new int[55];
		int temp;
		int h;
		int g;
		double[] b = new double[55];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 55;i++)
		{
			c[i] = i;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].y = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].z = tempVar4;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
			b[l] = (double)Math.sqrt((a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y) + (a[i].z - a[j].z) * (a[i].z - a[j].z));
			l++;
			}
		}
		for (i = 0;i < l - 1;i++)
		{
			for (j = 0;j < l - i - 1;j++)
			{
				if (b[c[j]] < b[c[j + 1]])
				{
					temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			h = col(c[i] + 1, n);
		g = row(c[i] + 1, n);
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[g].x,a[g].y,a[g].z,a[h].x,a[h].y,a[h].z,b[c[i]]);
		}
			return 0;
	}


}

