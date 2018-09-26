public class point
{
	public float x;
	public float y;
}

package <missing>;

public class GlobalMembers
{
	public static float d(point a, point b)
	{
		return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		float m = 0F;
		point[] a = tangible.Arrays.initializeWithDefaultpointInstances(100);
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
			   a[i].x = Float.parseFloat(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   a[i].y = Float.parseFloat(tempVar3);
		   }
		}
		for (i = 0;i < n - 1;i++)
		{
		   for (j = i + 1;j < n;j++)
		   {
			  if (d(a[i], a[j]) > m)
			  {
				 m = d(a[i], a[j]);
			  }
		   }
		}
		System.out.printf("%.4f\n",m);
	}

}

