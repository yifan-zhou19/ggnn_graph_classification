public class zuobiao
{
	public int x;
	public int y;
	public int z;
}
public class dis
{
	public int[] left = new int[3];
	public int[] right = new int[3];
	public float d;
}

package <missing>;

public class GlobalMembers
{
	public static zuobiao[] zuo = tangible.Arrays.initializeWithDefaultzuobiaoInstances(10);
	public static dis[] di = tangible.Arrays.initializeWithDefaultdisInstances(100);
	public static dis e = new dis();
	public static int Main()
	{
		int l;
		int n;
		int ld;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		l = n * (n - 1) / 2;
		ld = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zuo[i].x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				zuo[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				zuo[i].z = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				di[ld++].d = Math.sqrt(Math.pow(zuo[i].x - zuo[j].x,2) + Math.pow(zuo[i].y - zuo[j].y,2) + Math.pow(zuo[i].z - zuo[j].z,2));
				di[ld - 1].left[0] = zuo[i].x;
				di[ld - 1].left[1] = zuo[i].y;
				di[ld - 1].left[2] = zuo[i].z;
				di[ld - 1].right[0] = zuo[j].x;
				di[ld - 1].right[1] = zuo[j].y;
				di[ld - 1].right[2] = zuo[j].z;
			}
		}
			for (i = 1;i < l;i++)
			{
				for (j = 0;j < l - i;j++)
				{
					if (di[j].d < di[j + 1].d)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: e=di[j];
						e.copyFrom(di[j]);
						di[j] = di[j + 1];
						di[j + 1] = e;
					}
				}
			}
					for (i = 0;i < l;i++)
					{
						System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",di[i].left[0],di[i].left[1],di[i].left[2],di[i].right[0],di[i].right[1],di[i].right[2],di[i].d);
					}






					return 0;
	}

}

