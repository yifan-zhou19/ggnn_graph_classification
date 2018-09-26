package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[100];
		float[] b = new float[100];
		float[] c = new float[100];
		float d = 0F;
		int i;
		int n;
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
				a[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
			if (i == 0)
			{
				c[i] = b[i] / a[i];
				d = c[i];
			}

		}
		for (i = 1;i < n;i++)
		{
				c[i] = (float)(b[i] / a[i]);
				if ((c[i] - d) > 0.05)
				{
					System.out.print("better\n");
				}
				else if ((c[i] - d) < -0.05)
				{
					System.out.print("worse\n");
				}
				else
				{
				System.out.print("same\n");
				}
		}
		return 0;
	}

}

