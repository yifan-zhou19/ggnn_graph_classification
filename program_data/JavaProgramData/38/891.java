package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int i;
		int j;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p,total,ave,total2,res;
		double p;
		double total;
		double ave;
		double total2;
		double res;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			total = 0;
			ave = 0;
			total2 = 0;
			res = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			p = (double)calloc(100,(Double.SIZE / Byte.SIZE));
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p + j = Double.parseDouble(tempVar3);
				}
				total = total + (*(p + j));
			}
			ave = total / n;
			for (j = 0;j < n;j++)
			{
			total2 = total2 + ((*(p + j)) - ave) * ((*(p + j)) - ave);
			}
			res = Math.sqrt(total2 / n);
			System.out.printf("%.5f\n",res);
		}
	}
}

