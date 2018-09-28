package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double[] x = new double[50];
		double[] y = new double[50];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * px;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * py;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * px2;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * py2;
		double temp;
		double max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (px = x,py = y;px < x + n;px++,py++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				px = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				py = Double.parseDouble(tempVar3);
			}
		}
		max = 0;
		for (px = x,py = y;px < x + n;px++,py++)
		{
			for (px2 = px + 1, py2 = py + 1;px2 < x + n && py2 < y + n;px2++, py2++)
			{
					temp = (*px - *px2) * (*px - *px2) + (*py - *py2) * (*py - *py2);
				max = (max < temp)?temp:max;
			}
		}

		System.out.printf("%.4lf\n",Math.sqrt(max));
		return 0;

	}

}

