package <missing>;

public class GlobalMembers
{
	public static float sqr(float x)
	{
		  float ans;
		  ans = x * x;
		  return (ans);
	}

	public static float work(float[] a, float[] b)
	{
		  float ans;
		  ans = Math.sqrt(sqr(a[0] - b[0]) + sqr(a[1] - b[1]) + sqr(a[2] - b[2]));
		  return (ans);
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int x;
		int num;
		int[][] a = new int[101][3];
		float[] dis = new float[101];
		float[][] d = new float[11][3];
		float x1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		 for (j = 0;j < 3;j++)
		 {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  d[i][j] = Float.parseFloat(tempVar2);
		  }
		 }
		}
		num = 0;
		for (i = 0;i < n;i++)
		{
		 for (j = i + 1;j < n;j++)
		 {
			 dis[num] = work(d[i], d[j]);
			 a[num][1] = i;
			 a[num][2] = j;
			 num++;
		 }
		}
		for (i = 0;i < num - 1;i++)
		{
		 for (j = 0;j < num - 1;j++)
		 {
		 if (dis[j] < dis[j + 1])
		 {
			  x1 = dis[j];
			  dis[j] = dis[j + 1];
			  dis[j + 1] = x1;
		   x = a[j][1];
		   a[j][1] = a[j + 1][1];
		   a[j + 1][1] = x;
		   x = a[j][2];
		   a[j][2] = a[j + 1][2];
		   a[j + 1][2] = x;
		 }
		 }
		}
		for (i = 0;i < num;i++)
		{
			x = a[i][1];
			j = a[i][2];
		 System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",(int)d[x][0],(int)d[x][1],(int)d[x][2],(int)d[j][0],(int)d[j][1],(int)d[j][2],dis[i]);
		}

	}

}

