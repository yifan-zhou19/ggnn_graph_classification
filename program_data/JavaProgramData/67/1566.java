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
		  float p0;
		  float q0;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  p0 = Float.parseFloat(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  q0 = Float.parseFloat(tempVar3);
		  }
		  for (int i = 1;i <= n - 1;i++)
		  {
				float p;
				float q;
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					p = Float.parseFloat(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead(" ");
				if (tempVar5 != null)
				{
					q = Float.parseFloat(tempVar5);
				}
				if ((q / p - q0 / p0) <= 0.05 && (q0 / p0 - q / p) <= 0.05)
				{
					 System.out.print("same\n");
				}
				else if ((q / p - q0 / p0) > 0.05)
				{
					 System.out.print("better\n");
				}
				else if ((q0 / p0 - q / p) > 0.05)
				{
					 System.out.print("worse\n");
				}
		  }
	}
}

