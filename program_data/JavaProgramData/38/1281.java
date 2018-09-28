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
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			double sum = 0;
			double ave;
			int num;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			double[] s = new double[101];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			double * p;
			p = s;
			for (j = 0;j < num;j++,p++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p = Double.parseDouble(tempVar3);
				}
				sum += *p;
			}

			ave = sum / num;
			p = s;
			double total = 0;
			for (j = 0;j < num;j++,p++)
			{
				total += (*p - ave) * (*p - ave);
			}
			double result;
			result = Math.sqrt(total / num);
			System.out.printf("%.5lf\n",result);
		}
		return 0;
	}

}

