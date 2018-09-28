package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int p = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		for (i = 0;i < k;i++)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p,a=0,s=0;
			double p;
			double a = 0;
			double s = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			p = (double)calloc(n,(Double.SIZE / Byte.SIZE));
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p + j = Double.parseDouble(tempVar3);
				}
			a = a + *(p + j);
			}
			a = a / n;
			for (j = 0;j < n;j++)
			{
				s = s + (*(p + j) - a) * (*(p + j) - a);
			}
			s = Math.sqrt(s / n);
			System.out.printf("%.5f\n",s);

		}
	}
}

