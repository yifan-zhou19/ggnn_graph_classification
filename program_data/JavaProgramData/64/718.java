package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] spot = new int[11][3];
		int i;
		int j;
		int n;
		int count = 0;
		int x;
		int y;
		int z;
		float[][] dis = new float[4951][3];
		float k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
		   for (j = 0;j < 3;j++)
		   {
			  spot[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
		}
		for (i = 1;i < n;i++)
		{
		   for (j = i + 1;j <= n;j++)
		   {
				 count++;
				 x = spot[i][0] - spot[j][0];
				 y = spot[i][1] - spot[j][1];
				 z = spot[i][2] - spot[j][2];
				 dis[count][0] = Math.sqrt(x * x + y * y + z * z);
				 dis[count][1] = i;
				 dis[count][2] = j;
		   } //????????
		}
		for (i = 1;i < count;i++)
		{
			for (j = 1;j <= count - i;j++)
			{
				  if (dis[j][0] < dis[j + 1][0])
				  {
						  k = dis[j][0];
						  dis[j][0] = dis[j + 1][0];
						  dis[j + 1][0] = k;
						  k = dis[j][1];
						  dis[j][1] = dis[j + 1][1];
						  dis[j + 1][1] = k;
						  k = dis[j][2];
						  dis[j][2] = dis[j + 1][2];
						  dis[j + 1][2] = k;
				  } //??
			}
		}
		for (i = 1;i <= count;i++)
		{
			   System.out.print("(");
			   System.out.print(spot[(int)dis[i][1]][0]);
			   System.out.print(",");
			   System.out.print(spot[(int)dis[i][1]][1]);
			   System.out.print(",");
			   System.out.print(spot[(int)dis[i][1]][2]);
			   System.out.print(")");
			   System.out.print("-");
			   System.out.print("(");
			   System.out.print(spot[(int)dis[i][2]][0]);
			   System.out.print(",");
			   System.out.print(spot[(int)dis[i][2]][1]);
			   System.out.print(",");
			   System.out.print(spot[(int)dis[i][2]][2]);
			   System.out.print(")");
			   System.out.print("=");
			   System.out.printf("%.2f",dis[i][0]);
			   System.out.print("\n");
		}
		return 0;
	}

}

