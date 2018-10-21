package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p; //m?????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * q;
		double f;
		double sum1;
		double sum2;
		double s;
		double m;
		double[] a = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			p = a;
			sum1 = 0;
			sum2 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= n;j++,p++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p = Double.parseDouble(tempVar3);
				}
				sum1 += *p;
			}
			m = sum1 / n;
			p = a;
			for (q = p;q != p + n;q++)
			{
				sum2 += (*q - m) * (*q - m);
			}
			s = Math.sqrt(sum2 / n);
			System.out.printf("%.5f\n",s);
		}
	}





}

