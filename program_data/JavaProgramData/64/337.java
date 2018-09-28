package <missing>;

public class GlobalMembers
{
	public static double h(int x1,int y1,int z1,int x2,int y2,int z2)
	{
	double s;
	int x;
	int y;
	int z;
	x = x1 - x2;
	y = y1 - y2;
	z = z1 - z2;
	s = Math.sqrt(x * x + y * y + z * z);
	return s;
	}

	public static int Main()
	{
		int n;
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		int i;
		int k;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct shizi
	//	{
	//		int x1;
	//		int x2;
	//		int y1;
	//		int y2;
	//		int z1;
	//		int z2;
	//		double l;
	//	}
	//	s[50],tmp;
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
		k = 0;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				s[k].x1 = a[i];
				s[k].x2 = a[j];
				s[k].y1 = b[i];
				s[k].y2 = b[j];
				s[k].z1 = c[i];
				s[k].z2 = c[j];
				s[k].l = h(a[i], b[i], c[i], a[j], b[j], c[j]);
				k++;
			}
		}
		for (i = 1;i <= k;i++)
		{
			for (j = 0;j < k - 1;j++)
			{
				if (s[j].l < s[j + 1].l)
				{
					tmp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = tmp;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",s[i].x1,s[i].y1,s[i].z1,s[i].x2,s[i].y2,s[i].z2,s[i].l);
		}
		return 0;
	}
}

