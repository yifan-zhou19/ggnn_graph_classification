// ?????? ???1000010500 
// ???? 
// 2010-12-20

public class point // ?????
{
	   public int x;
	   public int y;
	   public int z;
}

package <missing>;

public class GlobalMembers
{
	public static point[] dot = tangible.Arrays.initializeWithDefaultpointInstances(10);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p;
		int q;
		double[][] distance = new double[10][10];
		double t;
		double max;
		double min = 200;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) // ????
		{
			dot[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			dot[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			dot[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++) // ???i??j???
		{
			for (j = i + 1;j < n;j++)
			{
				distance[i][j] = Math.sqrt((dot[i].x - dot[j].x) * (dot[i].x - dot[j].x) + (dot[i].y - dot[j].y) * (dot[i].y - dot[j].y) + (dot[i].z - dot[j].z) * (dot[i].z - dot[j].z));
				// ?????????? 
				min = (distance[i][j] < min) ? distance[i][j] : min;
			}
		}
		for (k = 0;k < n * (n - 1) / 2;k++) // ?????????
		{
			max = min;
			for (i = n - 2;i >= 0;i--)
			{
				for (j = n - 1;j >= i + 1;j--)
				{
					if (max <= distance[i][j])
					{
									 max = distance[i][j];
									 p = i;
									 q = j;
					}
				}
			}
			System.out.print("(");
			System.out.print(dot[p].x);
			System.out.print(",");
			System.out.print(dot[p].y);
			System.out.print(",");
			System.out.print(dot[p].z);
			System.out.print(")-(");
			System.out.print(dot[q].x);
			System.out.print(",");
			System.out.print(dot[q].y);
			System.out.print(",");
			System.out.print(dot[q].z);
			System.out.print(")=");
			System.out.printf("%.2f", distance[p][q]);
			System.out.printf("%.2f", "\n");
			distance[p][q] = 0;
		}
		return 0;
	}


}

