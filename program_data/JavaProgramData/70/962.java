package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] x;
		double[] y;
		double t;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		x = (double)(malloc(n * (Integer.SIZE / Byte.SIZE)));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		y = (double)(malloc(n * (Integer.SIZE / Byte.SIZE)));
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x[i] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y[i] = Double.parseDouble(tempVar3);
		}
		}
		t = Math.pow((x[1] - x[0]),2) + Math.pow((y[1] - y[0]),2);
		for (i = 0;i < n - 1;i++)
		{
				for (j = i + 1;j < n;j++)
				{
					  if (Math.pow((x[j] - x[i]),2) + Math.pow((y[j] - y[i]),2) > t)
					  {
					t = Math.pow((x[j] - x[i]),2) + Math.pow((y[j] - y[i]),2);
					  }
				}
		}
		   System.out.printf("%.4f\n",Math.sqrt(t));
	  return 0;
	}

}

