package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *a,*b,s,f,sum,ave;
		double a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *b;
		double b;
		double s;
		double f;
		double sum;
		double ave;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		a = (double)calloc(200,(Double.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		b = (double)calloc(200,(Double.SIZE / Byte.SIZE));
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
				k = Integer.parseInt(tempVar2);
			}
			for (j = 0,sum = 0;j < k;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a + j = Double.parseDouble(tempVar3);
				}
				sum = sum + *(a + j);
			}
			ave = sum / k;
			for (j = 0,f = 0;j < k;j++)
			{
				f = f + (*(a + j) - ave) * (*(a + j) - ave);
			}
			s = Math.sqrt(f / k);
			System.out.printf("%.5f\n",s);
		}

	}
}

