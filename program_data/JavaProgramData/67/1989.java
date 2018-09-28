package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[1000];
		int[] b = new int[1000];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
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
		for (i = 1; i < n; i++)
		{
			if ((b[i] * 1.0) / a[i] - (b[0] * 1.0) / a[0] > 0.05)
			{
				System.out.print("better\n");
			}
			else if ((b[0] * 1.0) / a[0] - (b[i] * 1.0) / a[i] > 0.05)
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

