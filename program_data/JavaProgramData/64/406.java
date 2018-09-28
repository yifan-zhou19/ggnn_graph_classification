public class Line
{
	public int n1;
	public int n2;
	public double dis;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double distance = new double(double a[3],double b[3]);
		Line[] l = tangible.Arrays.initializeWithDefaultLineInstances(55);
		double[][] num = new double[10][3];
		double td;
		int n;
		int i;
		int j;
		int k;
		int p;
		int q;
		int t;
		int[][] num1 = new int[10][3];
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
				num[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i][1] = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				num[i][2] = Double.parseDouble(tempVar4);
			}
		}
		k = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				l[k].dis = distance(num[i], num[j]);
				l[k].n1 = i;
				l[k].n2 = j;
				k++;
			}
		}
		for (q = 1;q < k;q++)
		{
			for (p = 0;p < k - q;p++)
			{
				if (l[p].dis < l[p + 1].dis)
				{
					t = l[p].n1;
					l[p].n1 = l[p + 1].n1;
					l[p + 1].n1 = t;
					t = l[p].n2;
					l[p].n2 = l[p + 1].n2;
					l[p + 1].n2 = t;
					td = l[p].dis;
					l[p].dis = l[p + 1].dis;
					l[p + 1].dis = td;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			num1[i][0] = (int)num[i][0];
			num1[i][1] = (int)num[i][1];
			num1[i][2] = (int)num[i][2];
		}
		for (i = 0;i < k;i++)
		{
			p = l[i].n1;
			q = l[i].n2;
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",num1[p][0],num1[p][1],num1[p][2],num1[q][0],num1[q][1],num1[q][2],l[i].dis);
		}
		return 0;
	}

	public static double distance(double[] a, double[] b)
	{
		double m;
		m = Math.sqrt((a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]) + (a[2] - b[2]) * (a[2] - b[2]));
		return m;
	}

}

