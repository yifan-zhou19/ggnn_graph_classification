package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int m = 0;
		int n = 0;
			double t = 0;
			double x = 0;
			double y = 0;
			double a = 0;
			double b = 0;
			double e = 0;
			double d = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				e = Double.parseDouble(tempVar3);
			}
			x = e / d;
			for (i = 0;i < n - 1;i++)
			{
				 String tempVar4 = ConsoleInput.scanfRead();
				 if (tempVar4 != null)
				 {
					 a = Double.parseDouble(tempVar4);
				 }
				 String tempVar5 = ConsoleInput.scanfRead();
				 if (tempVar5 != null)
				 {
					 b = Double.parseDouble(tempVar5);
				 }
				 y = b / a;
				 if (x - y > 0.05)
				 {
					  System.out.print("worse\n");
				 }
				 if (x - y < 0.05 && y - x < 0.05)
				 {
					  System.out.print("same\n");
				 }
				 if (y - x > 0.05)
				 {
					  System.out.print("better\n");
				 }
			}
		return 0;
	}

}

