public class po
{
	public float x;
	public float y;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		po[] p = tangible.Arrays.initializeWithDefaultpoInstances(10);
		int n;
		int i;
		int j;
		double d = 0;
		double a;
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
				p[i].x = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].y = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i;j < n;j++)
			{
				a = Math.sqrt(Math.pow(p[i].x - p[j].x,2) + Math.pow(p[i].y - p[j].y,2));
				if (a > d)
				{
					d = a;
				}
			}
		}
		System.out.printf("%.4f\n",d);
	}

}

