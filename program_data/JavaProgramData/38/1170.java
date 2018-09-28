package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pm;
		int pm;
		int i;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *pa[100],*psum,*pave,s,t;
		double[] pa = new double[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *psum;
		double psum;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *pave;
		double pave;
		double s;
		double t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		pm = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		psum = (double)malloc((Double.SIZE / Byte.SIZE) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		pave = (double)malloc((Double.SIZE / Byte.SIZE) * n);
		for (k = 0;k < n;k++)
		{
			*(psum + k) = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pm + k = Integer.parseInt(tempVar2);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			pa[k] = (double)malloc((Double.SIZE / Byte.SIZE) * (*(pm + k)));
			for (i = 0;i < *(pm + k);i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					pa[k] + i = Double.parseDouble(tempVar3);
				}
				*(psum + k) = *(psum + k) + *(pa[k] + i);
			}
			*(pave + k) = *(psum + k) / (*(pm + k));
		}
	//	printf("%lf",ave);
		for (k = 0;k < n;k++)
		{
			*(psum + k) = 0;
			for (i = 0;i < *(pm + k);i++)
			{
				*(psum + k) = *(psum + k) + (*(pa[k] + i) - *(pave + k)) * (*(pa[k] + i) - *(pave + k));
			}
			s = Math.sqrt(*(psum + k) / (*(pm + k)));
			System.out.printf("%.5lf\n",s);
		}
	}




}

