package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float[] a = new float[1000];
		float[] b = new float[1000];
		float[] c = new float[1000];
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
				a[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
		}
		c[1] = b[1] / a[1];
		for (i = 2;i <= n;i++)
		{
						 c[i] = (b[i] / a[i]);
						 if (c[i] - c[1] > 0.05F)
						 {
										 System.out.print("better\n");
						 }
						 else if (c[1] - c[i] > 0.05F)
						 {
							  System.out.print("worse\n");
						 }
						 else
						 {
							  System.out.print("same\n");
						 }
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}

}

