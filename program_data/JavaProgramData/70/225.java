package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int g;
		float x;
		float y;
		float t = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		float[] a = new float[100];
		float[] b = new float[100];
		float c = 0F;
		float d;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y = Float.parseFloat(tempVar3);
			}
			a[i] = x;
			b[i] = y;
		}

			for (j = 0;j < n;j++)
			{
			   for (g = 0;g < n;g++)
			   {
				d = Math.sqrt((a[j] - a[g]) * (a[j] - a[g]) + (b[j] - b[g]) * (b[j] - b[g]));
				if (d > c)
				{
					c = d;
				}
			   }
			}

		System.out.printf("%.4f",c);
		return 0;
	}

}

