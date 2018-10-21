package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int n;
	//		double a[100];
	//		double s,c,sum;
	//		double m;
	//	}
	//	b[100];
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i].n = tempVar2;
			}
			b[i].s = 0;
			for (j = 0;j < b[i].n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i].a[j] = tempVar3;
				}
				b[i].s += b[i].a[j];
			}
			b[i].c = b[i].s / b[i].n;
			b[i].sum = 0;
			for (j = 0;j < b[i].n;j++)
			{
				b[i].sum += (b[i].a[j] - b[i].c) * (b[i].a[j] - b[i].c);
			}
			b[i].m = Math.sqrt(b[i].sum / b[i].n);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5lf\n", b[i].m);
		}
	}

}

