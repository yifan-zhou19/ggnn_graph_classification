public class dis
{
	public int[] from = new int[4];
	public int[] to = new int[4];
	public double d;
}

package <missing>;

public class GlobalMembers
{
	public static dis[] dis = tangible.Arrays.initializeWithDefaultdisInstances(6000); //???????
	public static int Main()
	{
		int n;
		int[][] p = new int[11][4];
		int i;
		int j;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
		 for (j = 1;j <= 3;j++)
		 {
		  p[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		}
		for (i = 1;i <= n - 1;i++)
		{
		 for (j = i + 1;j <= n;j++)
		 {
		   t++;
		   dis[t].from[1] = p[i][1];
		   dis[t].from[2] = p[i][2];
		   dis[t].from[3] = p[i][3];
		   dis[t].to[1] = p[j][1];
		   dis[t].to[2] = p[j][2];
		   dis[t].to[3] = p[j][3]; //??????????
		   dis[t].d = Math.sqrt(Math.pow(p[i][1] - p[j][1],2.0) + Math.pow(p[i][2] - p[j][2],2.0) + Math.pow(p[i][3] - p[j][3],2.0)); //??????????????????
		 }
		}
		for (i = 1;i <= t - 1;i++)
		{
		 for (j = 1;j <= t - i;j++)
		 {
			 if (dis[j].d < dis[j + 1].d)
			 {
				 dis[0] = dis[j];
				 dis[j] = dis[j + 1];
				 dis[j + 1] = dis[0];
			 } //????????
		 }
		}
		for (i = 1;i <= t;i++)
		{
		 System.out.print("(");
		 System.out.print(dis[i].from[1]);
		 System.out.print(",");
		 System.out.print(dis[i].from[2]);
		 System.out.print(",");
		 System.out.print(dis[i].from[3]);
		 System.out.print(")");
		 System.out.print("-");
		 System.out.print("(");
		 System.out.print(dis[i].to[1]);
		 System.out.print(",");
		 System.out.print(dis[i].to[2]);
		 System.out.print(",");
		 System.out.print(dis[i].to[3]);
		 System.out.print(")");
		 System.out.print("=");
		 System.out.printf("%.2f", dis[i].d);
		 System.out.printf("%.2f", "\n");

		}
		 return 0;
	}

}

