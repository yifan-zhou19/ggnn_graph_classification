public class distance
{
	public int sp1x;
	public int sp1y;
	public int sp1z;
	public int sp2x;
	public int sp2y;
	public int sp2z;
	public double dis;
}

package <missing>;

public class GlobalMembers
{
	public static distance[] dis = tangible.Arrays.initializeWithDefaultdistanceInstances(999999);
	public static distance temp = new distance();
	public static int Main()
	{
		int n;
		int[][] spot = new int[9999][3];
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			spot[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			spot[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			spot[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n - 1;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				dis[t].sp1x = spot[i][0];
				dis[t].sp1y = spot[i][1];
				dis[t].sp1z = spot[i][2];
				dis[t].sp2x = spot[j][0];
				dis[t].sp2y = spot[j][1];
				dis[t].sp2z = spot[j][2];
				dis[t].dis = Math.sqrt(Math.pow(spot[i][0] - spot[j][0],2.0) + Math.pow(spot[i][1] - spot[j][1],2.0) + Math.pow(spot[i][2] - spot[j][2],2.0));
				t++;
			}
		}
		for (int i = 0;i <= t - 2;i++)
		{
			for (int j = 0;j <= t - 2 - i;j++)
			{
				if (dis[j].dis < dis[j + 1].dis)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=dis[j];
					temp.copyFrom(dis[j]);
					dis[j] = dis[j + 1];
					dis[j + 1] = temp;
				}
			}
		}
		for (int i = 0;i < t;i++)
		{
			System.out.print("(");
			System.out.print(dis[i].sp1x);
			System.out.print(",");
			System.out.print(dis[i].sp1y);
			System.out.print(",");
			System.out.print(dis[i].sp1z);
			System.out.print(")-(");
			System.out.print(dis[i].sp2x);
			System.out.print(",");
			System.out.print(dis[i].sp2y);
			System.out.print(",");
			System.out.print(dis[i].sp2z);
			System.out.print(")=");
			System.out.printf("%.2f", dis[i].dis);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

