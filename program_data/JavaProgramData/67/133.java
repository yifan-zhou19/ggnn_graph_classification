package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] zong = new int[100];
		int[] hao = new int[100];
		double[] yx = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zong[0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			hao[0] = Integer.parseInt(tempVar3);
		}
		yx[0] = 1.0 * hao[0] / zong[0];
		for (i = 1;i < n;i++)
		{
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  zong[i] = Integer.parseInt(tempVar4);
			  }
			  String tempVar5 = ConsoleInput.scanfRead(" ");
			  if (tempVar5 != null)
			  {
				  hao[i] = Integer.parseInt(tempVar5);
			  }
			  yx[i] = 1.0 * hao[i] / zong[i];
		}
		for (i = 1;i < n;i++)
		{
			  if (yx[i] - yx[0] > 0.05)
			  {
				  System.out.print("better\n");
			  }
			  else if (yx[0] - yx[i] > 0.05)
			  {
				  System.out.print("worse\n");
			  }
			  else if (yx[i] - yx[0] <= 0.05 && yx[0] - yx[i] <= 0.05)
			  {
				  System.out.print("same\n");
			  }
		}
	return 0;
	}
}

