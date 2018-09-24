package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int row;
		int n;
		double[] s = new double[1001];
		double sum;
		double c;
		double ave;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= row;i++)
		{
			sum = 0;
			f = s;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;f++,j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					f = Double.parseDouble(tempVar3);
				}
				sum += *f;
			}
			ave = sum / n;
			f = s;
			sum = 0;
			for (j = 0;j < n;f++,j++)
			{
				sum += (*f - ave) * (*f - ave);
			}
			c = Math.sqrt(sum / n);
			System.out.printf("%.5f\n", c);
		}
	}

}

