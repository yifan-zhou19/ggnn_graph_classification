package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int case_num;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
		double sumx2 = 0;
		double sumx = 0;
		double[] a = new double[1001];
		double S;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			case_num = Integer.parseInt(tempVar);
		}
		for (;case_num > 0;case_num--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (p = a;p < a + n;p++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p = Double.parseDouble(tempVar3);
				}
			}
			for (p = a;p < a + n;p++)
			{
				sumx += *p;
				sumx2 += ((*p) * (*p));
			}
			S = Math.sqrt(sumx2 / n - (sumx / n) * (sumx / n));
			System.out.printf("%.5f\n",S);
			sumx2 = 0;
			sumx = 0;
		}

	}

}

