package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int num;
		int k;
		double S;
		double[] sz = new double[1000];
		double ave;
		double s;
		double sum;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * ptr;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
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
				num = Integer.parseInt(tempVar2);
			}
			for (k = 0;k < num;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[k] = Double.parseDouble(tempVar3);
				}
			}
			ptr = sz[0];
			sum = ptr;
			ptr++;
			for (k = 1;k < num;k++)
			{
				sum = sum + *ptr;
				ptr++;
			}
			ave = sum / num;
			p = sz[0];
			s = Math.pow(*p - ave,2);
			p++;
			for (k = 1;k < num;k++)
			{
				s = s + Math.pow(*p - ave,2);
				p++;
			}
			S = Math.sqrt(s / num);
			System.out.printf("%.5lf\n",S);
		}
	}

}

