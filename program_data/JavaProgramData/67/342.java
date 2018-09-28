package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		float x;
		float y;
		int[] a = new int[100];
		int[] b = new int[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		x = (float)b[0] / (float)a[0];
		for (i = 1;i < n;i++)
		{
			y = (float)b[i] / (float)a[i];
			if (y - x > 0.05F)
			{
				System.out.print("better\n");
				y = 0F;
			}
			else if (x - y > 0.05F)
			{
				System.out.print("worse\n");
				y = 0F;
			}
			else
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}


}

