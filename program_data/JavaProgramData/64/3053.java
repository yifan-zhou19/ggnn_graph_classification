public class distant
{
	   public int x1;
	   public int x2;
	   public float dis;
}

package <missing>;

public class GlobalMembers
{
	public static float dist(int[] x, int[] y)
	{
		  float d;
		  d = (x[0] - y[0]) * (x[0] - y[0]) + (x[1] - y[1]) * (x[1] - y[1]) + (x[2] - y[2]) * (x[2] - y[2]);
		  d = Math.sqrt(d);
		  return d;
	}
	public static int Main()
	{
		int n;
		int[][] x = new int[10][3];
		distant[] d = tangible.Arrays.initializeWithDefaultdistantInstances(50);
		distant temp = new distant();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k;
		for (i = 0;i < n;i++)
		{
						for (j = 0;j < 3;j++)
						{
							String tempVar2 = ConsoleInput.scanfRead();
							if (tempVar2 != null)
							{
								x[i][j] = Integer.parseInt(tempVar2);
							}
						}
		}
		for (i = 0,k = 0;i < n;i++)
		{
						for (j = i + 1;j < n;j++,k++)
						{
							d[k].x1 = i;
							d[k].x2 = j;
							d[k].dis = dist(x[i], x[j]);
						}
		}
		for (i = 1;i < k;i++)
		{
						for (j = 0;j < k - i;j++)
						{
							if (d[j].dis < d[j + 1].dis)
							{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=d[j];
							temp.copyFrom(d[j]);
							d[j] = d[j + 1];
							d[j + 1] = temp;
							}
						}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",x[d[i].x1][0],x[d[i].x1][1],x[d[i].x1][2],x[d[i].x2][0],x[d[i].x2][1],x[d[i].x2][2],d[i].dis);
		}
	}

}

