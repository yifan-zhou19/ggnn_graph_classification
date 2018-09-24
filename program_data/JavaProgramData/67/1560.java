package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float[] a = new float[100];
		float[] b = new float[100];
		float[] c = new float[100];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
			c[i] = b[i] / a[i];
		}
		for (i = 1;i < n;i++)
		{
			if (c[i] - c[0] > 0.05F)
			{
			System.out.print("better");
			}
			else if (c[i] - c[0] < -0.05F)
			{
			System.out.print("worse");
			}
			else
			{
			System.out.print("same");
			}
			System.out.print("\n");
		}
	}
}

