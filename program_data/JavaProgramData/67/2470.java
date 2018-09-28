package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
	double[] rat = new double[100];
	double[] e = new double[100];
	double[] su = new double[100];
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
				  e[i] = Double.parseDouble(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  su[i] = Double.parseDouble(tempVar3);
			  }
		  rat[i] = su[i] / e[i];
		  if (i > 0)
		  {
			  if (rat[i] - rat[0] > 0.05)
			  {
				  System.out.print("better\n");
			  }
			  else if (rat[i] - rat[0] < -0.05)
			  {
				  System.out.print("worse\n");
			  }
			  else
			  {
				  System.out.print("same\n");
			  }
		  }
		}
	}
}

