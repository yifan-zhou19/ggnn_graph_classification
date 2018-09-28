public class point
{
	public int[] x = new int[3];
}
public class str
{
	public point[] po = tangible.Arrays.initializeWithDefaultpointInstances(2);
	public float distance;
}

package <missing>;

public class GlobalMembers
{
	public static point[] pt = tangible.Arrays.initializeWithDefaultpointInstances(10);
	public static str[] dis = tangible.Arrays.initializeWithDefaultstrInstances(50);
	public static str temp = new str();
	public static void Main()
	{
		int n;
		int i;
		int j;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j <= 2; j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					pt[i].x[j] = Integer.parseInt(tempVar2);
				}
			}
		}
		//??????
		for (i = 0; i < 50; i++)
		{
			dis[i].distance = 0.0F;
		}
		for (i = 0, num = 0; i < n - 1; i++) //????
		{
			for (j = i + 1; j < n; j++)
			{
				dis[num].po[0] = pt[i];
				dis[num].po[1] = pt[j];
				dis[num].distance = Math.sqrt(Math.abs(pt[i].x[0] - pt[j].x[0]) * Math.abs(pt[i].x[0] - pt[j].x[0]) + Math.abs(pt[i].x[1] - pt[j].x[1]) * Math.abs(pt[i].x[1] - pt[j].x[1]) + Math.abs(pt[i].x[2] - pt[j].x[2]) * Math.abs(pt[i].x[2] - pt[j].x[2]));
				num++;
			}
		}

		for (num = 0, i = 0; dis[i].distance > 0.01F; i++) //?num????????
		{
			num++;
		}
		for (j = 1; j < num ; j++) //????
		{
			for (i = 0; i < num - j; i++)
			{
				if ((dis[i + 1].distance - dis[i].distance) > 0.01)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=dis[i];
					temp.copyFrom(dis[i]);
					dis[i] = dis[i + 1];
					dis[i + 1] = temp;
				}
			}
		}
		for (i = 0; i < num; i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",dis[i].po[0].x[0],dis[i].po[0].x[1],dis[i].po[0].x[2],dis[i].po[1].x[0],dis[i].po[1].x[1],dis[i].po[1].x[2],dis[i].distance);
		}
	}
}

