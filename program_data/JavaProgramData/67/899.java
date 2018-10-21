package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int t = 0;
	char[][] xm = new char[300][10];
	float[] tw = new float[300];
	double[] z = new double[300];
	double[] yx = new double[300];
	double[] x = new double[300];

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
			z[i] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			yx[i] = Double.parseDouble(tempVar3);
		}
		x[i] = yx[i] / z[i];
	}


	for (i = 1;i < n - 1;i++)
	{
		if (x[0] - x[i] > 0.05)
		{

		   System.out.print("worse");
		   System.out.print("\n");
		}
		else if (x[i] - x[0] > 0.05)
		{

		   System.out.print("better");
		   System.out.print("\n");
		}
		else
		{

		   System.out.print("same");
		   System.out.print("\n");
		}



	}


		  if (x[0] - x[n - 1] > 0.05)
		  {

		   System.out.print("worse");

		  }
		else if (x[n - 1] - x[0] > 0.05)
		{

		   System.out.print("better");

		}
		else
		{

		   System.out.print("same");

		}



	return 0;
	}
}

