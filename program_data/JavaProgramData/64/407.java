public class dot
{
	public int x;
	public int y;
	public int z;
}

package <missing>;

public class GlobalMembers
{
	public static dot[] point = tangible.Arrays.initializeWithDefaultdotInstances(10);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int t = 0;
		int s = 0;
		float[][] a = new float[10][10];
		float tem;
		float[] b = new float[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				point[i].x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				point[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				point[i].z = Integer.parseInt(tempVar4);
			}
			s = s + i;
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
			a[i][j] = Math.sqrt((point[i].x - point[j].x) * (point[i].x - point[j].x) + (point[i].y - point[j].y) * (point[i].y - point[j].y) + (point[i].z - point[j].z) * (point[i].z - point[j].z));
			b[t] = a[i][j];
			t++;
			}
		}
		for (i = 0;i < s - 1;i++)
		{
			for (j = 0;j < s - i - 1;j++)
			{
				if (b[j] < b[j + 1])
				{
					tem = b[j];
					b[j] = b[j + 1];
					b[j + 1] = tem;
				}
			}
		}
		for (k = 0;k < s;k++)
		{
			if (b[k] == b[k - 1])
			{
				continue;
			}
			else
			{
			for (i = 0;i < n - 1;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (a[i][j] == b[k])
					{
						System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",point[i].x,point[i].y,point[i].z,point[j].x,point[j].y,point[j].z,b[k]);
					}
				}
			}
			}
		}
		return 0;
	}







}

