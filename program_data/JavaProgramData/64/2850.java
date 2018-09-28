public class distance
{
	public int[] p1 = new int[3];
	public int[] p2 = new int[3];
	public float dis;
}

package <missing>;

public class GlobalMembers
{
	public static distance[] d = tangible.Arrays.initializeWithDefaultdistanceInstances(50);
	public static distance t = new distance();
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[10][3];
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < 3;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int p = 0;
		for (int i = 0;i < n;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
					d[p].p1[0] = a[i][0];
				 d[p].p1[1] = a[i][1];
				 d[p].p1[2] = a[i][2];
				 d[p].p2[0] = a[j][0];
				 d[p].p2[1] = a[j][1];
				 d[p].p2[2] = a[j][2];
				 d[p].dis = Math.sqrt(Math.pow((double)(d[p].p1[0] - d[p].p2[0]),2) + Math.pow((double)(d[p].p1[1] - d[p].p2[1]),2) + Math.pow((double)(d[p].p1[2] - d[p].p2[2]),2));
				 p++;
			}
		}
		for (int i = 0;i < n * (n - 1) / 2;i++)
		{
			for (int j = n * (n - 1) / 2 - 1;j > i;j--)
			{
				if (d[j].dis > d[j - 1].dis)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=d[j];
					t.copyFrom(d[j]);
					d[j] = d[j - 1];
					d[j - 1] = t;
				}
			}
		}
		for (int i = 0;i < n * (n - 1) / 2;i++)
		{
				System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f",d[i].p1[0],d[i].p1[1],d[i].p1[2],d[i].p2[0],d[i].p2[1],d[i].p2[2],d[i].dis);
		System.out.print("\n");
		}
		return 0;
	}
}

