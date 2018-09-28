public class point
{
	public int x;
	public int y;
	public int z;
}
public class distance
{
	public double dist;
	public int x1;
	public int y1;
	public int z1;
	public int x2;
	public int y2;
	public int z2;
}

package <missing>;

public class GlobalMembers
{
	public static point[] po = tangible.Arrays.initializeWithDefaultpointInstances(10);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		distance[] dis = tangible.Arrays.initializeWithDefaultdistanceInstances(50);
		distance temp = new distance();
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			po[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			po[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			po[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dis[k].dist = Math.sqrt((po[i].x - po[j].x) * (po[i].x - po[j].x) + (po[i].y - po[j].y) * (po[i].y - po[j].y) + (po[i].z - po[j].z) * (po[i].z - po[j].z));
				dis[k].x1 = po[i].x;
				dis[k].y1 = po[i].y;
				dis[k].z1 = po[i].z;
				dis[k].x2 = po[j].x;
				dis[k].y2 = po[j].y;
				dis[k].z2 = po[j].z;
				k++;
			}
		}
		for (i = 0;i < n * (n - 1) / 2 - 1;i++)
		{
			for (j = 0;j < n * (n - 1) / 2 - i - 1;j++)
			{
				if (dis[j].dist < dis[j + 1].dist)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=dis[j+1];
					temp.copyFrom(dis[j + 1]);
					dis[j + 1] = dis[j];
					dis[j] = temp;
				}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			System.out.print("(");
			System.out.print(dis[i].x1);
			System.out.print(",");
			System.out.print(dis[i].y1);
			System.out.print(",");
			System.out.print(dis[i].z1);
			System.out.print(")");
			System.out.print("-");
			System.out.print("(");
			System.out.print(dis[i].x2);
			System.out.print(",");
			System.out.print(dis[i].y2);
			System.out.print(",");
			System.out.print(dis[i].z2);
			System.out.print(")");
			System.out.print("=");
			System.out.printf("%.2f", dis[i].dist);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

