package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct jl
	//	{
	//		int a1;
	//		int b1;
	//		int c1;
	//		int a2;
	//		int b2;
	//		int c2;
	//		float d;
	//	}
	//	hz[100],t;
		int n;
		int i;
		int j;
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		int k = 0;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				w = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]) + (c[i] - c[j]) * (c[i] - c[j]));
				hz[k].a1 = a[i];
				hz[k].b1 = b[i];
				hz[k].c1 = c[i];
				hz[k].a2 = a[j];
				hz[k].b2 = b[j];
				hz[k].c2 = c[j];
				hz[k].d = w;
				k++;
			}
		}
		if (k == 1)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[0],b[0],c[0],a[1],b[1],c[1],w);
		}
		else
		{
			for (i = 0;i < k - 1;i++)
			{
			for (j = 0;j < k - i - 1;j++)
			{
				if (hz[j].d < hz[j + 1].d)
				{
					t = hz[j];
					hz[j] = hz[j + 1];
					hz[j + 1] = t;
				}
			}
			}
			for (i = 0;i < k;i++)
			{
				System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",hz[i].a1,hz[i].b1,hz[i].c1,hz[i].a2,hz[i].b2,hz[i].c2,hz[i].d);
			}
		}
		return 0;
	}
}

