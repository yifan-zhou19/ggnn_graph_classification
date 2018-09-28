package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] z = new int[100];
	int[] h = new int[100];
	int i;
	float u;
	float t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		z[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		h[i] = Integer.parseInt(tempVar3);
	}
	}
	t = 1.0 * h[1] / z[1];
	for (i = 2;i <= n;i++)
	{
	   u = 1.0 * h[i] / z[i] - t;
	   if (u > 0.05F)
	   {
		   System.out.print("better\n");
	   }
	   else
	   {
	if (u < -0.05F)
	{
		System.out.print("worse\n");
	}
	else
	{
		System.out.print("same\n");
	}
	   }


	}
	return 0;
	}
}

