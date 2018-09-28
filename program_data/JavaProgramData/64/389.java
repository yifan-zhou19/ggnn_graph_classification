public class dist
{
	public int i;
	public int j;
	public float d;
}

public class node
{
	public int x;
	public int y;
	public int z;
}

package <missing>;

public class GlobalMembers
{
	public static dist[] d = tangible.Arrays.initializeWithDefaultdistInstances(45); //??i?j?????
	public static node[] a = tangible.Arrays.initializeWithDefaultnodeInstances(10); //????????

	public static void Main()
	{
		int n;
		int i;
		int j;
		int count = 0;
		dist temp = new dist(); //????????
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 45;i++)
		{
			d[i].d = 0.0F; //????
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].z = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[count].i = i;
				d[count].j = j;
				d[count].d = Math.sqrt((a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y) + (a[i].z - a[j].z) * (a[i].z - a[j].z));
				count++;
			} //??i?j?????
		}
		count = n * (n - 1) / 2;
		for (i = 0;i < count - 1;i++)
		{
			for (j = 0;j < count - i - 1;j++)
			{
				if (d[j].d < d[j + 1].d)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=d[j];
					temp.copyFrom(d[j]);
					d[j] = d[j + 1];
					d[j + 1] = temp;
				}
			} //????
		}
		for (i = 0;i < count;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",a[d[i].i].x,a[d[i].i].y,a[d[i].i].z,a[d[i].j].x,a[d[i].j].y,a[d[i].j].z,d[i].d);
		}
	}


}

