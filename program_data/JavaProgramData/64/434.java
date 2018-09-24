package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int[] x = new int[20];
		int[] y = new int[20];
		int[] z = new int[20];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int x1,y1,z1;
	//		int x2,y2,z2;
	//		double dis;
	//	}
	//	out[50],h;
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
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		k = 0;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				out[k].x1 = x[i];
				out[k].y1 = y[i];
				out[k].z1 = z[i];
				out[k].x2 = x[j];
				out[k].y2 = y[j];
				out[k].z2 = z[j];
				k++;
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			out[i].dis = Math.sqrt((out[i].x1 - out[i].x2) * (out[i].x1 - out[i].x2) + (out[i].y1 - out[i].y2) * (out[i].y1 - out[i].y2) + (out[i].z1 - out[i].z2) * (out[i].z1 - out[i].z2));
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			for (j = n * (n - 1) / 2 - 1;j > i;j--)
			{
				if (out[j].dis > out[j - 1].dis)
				{
					h = out[j];
					out[j] = out[j - 1];
					out[j - 1] = h;
				}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",out[i].x1, out[i].y1,out[i].z1,out[i].x2,out[i].y2,out[i].z2,out[i].dis);
		}
		return 0;
	}

}

