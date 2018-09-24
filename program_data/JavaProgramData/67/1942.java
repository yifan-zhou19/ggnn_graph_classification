package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] za = new double[n];
		int[] a = new int[n];
		int[] b = new int[n];
		if (i == 0)
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
			za[i] = 1.0 * b[i] / a[i];
		}
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b[i] = Integer.parseInt(tempVar5);
			}
			za[i] = 1.0 * b[i] / a[i];
			if (za[i] - za[0] > 0.05)
			{
				System.out.print("better\n");
			}
			else if (za[0] - za[i] > 0.05)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(za);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(b);

		return 0;
	}
}

