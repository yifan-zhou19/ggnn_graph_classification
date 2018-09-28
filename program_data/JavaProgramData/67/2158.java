package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double x;
		int[] a = new int[100];
		int[] b = new int[100];
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		x = (double)(b[0]) / (double)(a[0]);
		for (i = 1;i < n;i++)
		{
			if ((double)(b[i]) / (double)(a[i]) - x > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (x - (double)(b[i]) / (double)(a[i]) > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
		return 0;

	}

}

