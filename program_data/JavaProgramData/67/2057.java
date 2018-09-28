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
		int[] a = new int[n];
		int[] b = new int[n];
		double x;
		double y;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (i == 0)
			{
				x = (double)b[i] / a[i];
			}
			else
			{
				y = (double)b[i] / a[i];
			}
			if (i != 0)
			{
				if (i != 1)
				{
					System.out.print("\n");
				}
				if ((y - x) > 0.05)
				{
					System.out.print("better");
				}
				else if ((x - y) > 0.05)
				{

					System.out.print("worse");
				}
				else
				{
					System.out.print("same");
				}

			}






		}


		//scanf("%d",&n);





		return 0;
	}
}

