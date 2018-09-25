package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int n; //??????n,i,j
		int i;
		int j;
		float distance = 0F; //??????distance????0
		float[] x = new float[1024]; //???????????????????
		float[] y = new float[1024];
		float[][] d = new float[1024][1024];
		float[][] dis = new float[1024][1024];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			y[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		} //??????
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				d[i][j] = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
				dis[i][j] = Math.sqrt(d[i][j]);
			} //???????????
		}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (distance < dis[i][j])
					{
						distance = dis[i][j];
					}
				} //??????
			}
				System.out.printf("%.4f\n",distance); //??????4????????distance
				return 0;
	} //?????

}

