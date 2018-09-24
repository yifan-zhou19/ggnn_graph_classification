package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  float b;
		  float c;
		  float p;
		  float q;
		  float j;
		  float k;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  p = Float.parseFloat(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  q = Float.parseFloat(tempVar3);
		  }
		  b = q / p;
		  for (i = 0;i < n - 1;i++)
		  {
							String tempVar4 = ConsoleInput.scanfRead();
							if (tempVar4 != null)
							{
								j = Float.parseFloat(tempVar4);
							}
							String tempVar5 = ConsoleInput.scanfRead(" ");
							if (tempVar5 != null)
							{
								k = Float.parseFloat(tempVar5);
							}
							c = k / j;
							if (Math.abs(b - c) > 0.05)
							{
											  if (b - c > 0.05F)
											  {
											  System.out.print("worse\n");
											  }
											  else
											  {
											  System.out.print("better\n");
											  }
							}
							else
							{
							System.out.print("same\n");
							}
		  }
		  System.in.read();
		  System.in.read();
	}

}

