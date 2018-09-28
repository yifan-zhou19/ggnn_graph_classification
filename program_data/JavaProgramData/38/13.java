package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p,x,sum,s;
		double p;
		double x;
		double sum;
		double s;
			/*?????????????????????????*/
		int N;
		int k;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (k = 0;k < N;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (double)malloc((Double.SIZE / Byte.SIZE)); //????
			for (i = 0;i < n;i++)
			{

			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				*(p + i) = tempVar3;
			}
			}
			for (i = 0;i < n;i++)
			{
				sum = sum + *(p + i);
			}
			x = sum / n; //?????
			sum = 0;
			for (i = 0;i < n;i++)
			{
				sum = sum + (*(p + i) - x) * (*(p + i) - x); //?????
			}
			x = sum / n;
			s = Math.sqrt(x); //????
			System.out.printf("%.5lf\n", s);
		}
	}


}

