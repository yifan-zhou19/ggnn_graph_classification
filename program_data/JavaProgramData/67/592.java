package <missing>;

public class GlobalMembers
{
	//?????




	public static int Main()
	{
		int n;
		int all;
		int valid;
		int i;
		double x;
		double y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 all = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 valid = Integer.parseInt(tempVar3);
		 }
		 x = (double)valid / all;
		for (i = 1;i < n;i++)
		{
						String tempVar4 = ConsoleInput.scanfRead();
						if (tempVar4 != null)
						{
							all = Integer.parseInt(tempVar4);
						}
						String tempVar5 = ConsoleInput.scanfRead(" ");
						if (tempVar5 != null)
						{
							valid = Integer.parseInt(tempVar5);
						}
						y = (double)valid / all;
						if (x - y > 0.05)
						{
						System.out.print("worse\n");
						}
						if (y - x > 0.05)
						{
						System.out.print("better\n");
						}
						if (x - y < 0.05 && y - x < 0.05)
						{
						System.out.print("same\n");
						}
		}
		 System.in.read();
		 System.in.read();

	}




}

