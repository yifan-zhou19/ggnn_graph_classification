package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int n;
			int[] shiyan = new int[999];
			int[] youxiao = new int[999];
			double xo;
			double x;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (int i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					shiyan[i] = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					youxiao[i] = Integer.parseInt(tempVar3);
				}
			}
			xo = 1.0 * youxiao[0] / shiyan[0];
			for (int w = 1;w < n;w++)
			{
			   x = 1.0 * youxiao[w] / shiyan[w];
			   if (xo - x > 0.05)
			   {
					System.out.print("worse\n");
			   }
			   else if (x - xo > 0.05)
			   {
					System.out.print("better\n");
			   }
			   else if (x - xo <= 0.05 && xo - x <= 0.05)
			   {
					System.out.print("same\n");
			   }
			}
			return 0;
	}

}

