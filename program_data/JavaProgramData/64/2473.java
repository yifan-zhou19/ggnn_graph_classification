package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		float[] l = new float[46];
		int[] p1 = new int[46];
		int[] p2 = new int[46];
		int zz = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				l[zz] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				p1[zz] = i;
				p2[zz] = j;
				zz++;
			}

		}
		float lamp2;
		int lamp;
		for (i = 0;i < zz;i++)
		{
			for (j = i + 1;j < zz;j++)
			{
				if (l[j] > l[i])
				{
					lamp2 = l[j];
					l[j] = l[i];
					l[i] = lamp2;
					lamp = p1[j];
					p1[j] = p1[i];
					p1[i] = lamp;
					lamp = p2[j];
					p2[j] = p2[i];
					p2[i] = lamp;
				}
				if (l[j] == l[i])
				{
					if (p1[i] > p1[j] || (p1[i] == p1[j] && p2[i] > p2[j]))
					{
					lamp2 = l[j];
					l[j] = l[i];
					l[i] = lamp2;
					lamp = p1[j];
					p1[j] = p1[i];
					p1[i] = lamp;
					lamp = p2[j];
					p2[j] = p2[i];
					p2[i] = lamp;
					}
				}
			}
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",x[p1[i]],y[p1[i]],z[p1[i]],x[p2[i]],y[p2[i]],z[p2[i]],l[i]);
		}

	}

}

