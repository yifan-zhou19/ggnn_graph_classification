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
		int[] a = new int[200];
		int[] b = new int[200];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
		}
		float x = 0F;
		float y = 0F;
		x = b[0] * 1.0 / a[0] * 100;
		for (int j = 1;j < n;j++)
		{
			y = b[j] * 1.0 / a[j] * 100;
			if ((y - x) > 5)
			{
				System.out.print("better\n");
			}
			else if ((x - y) > 5)
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

