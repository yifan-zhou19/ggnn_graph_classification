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
//ORIGINAL LINE: double *S,*a,b;
		double S;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *a;
		double a;
		double b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		S = (double)malloc((Double.SIZE / Byte.SIZE) * k);
		for (i = 0;i < k;i++)
		{
			*(S + i) = 0;
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			a = (double)malloc((Double.SIZE / Byte.SIZE) * n);
			b = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a + j = Double.parseDouble(tempVar3);
				}
				b += *(a + j);
			}
			b = b / n;
			for (j = 0;j < n;j++)
			{
				*(S + i) += (*(a + j) - b) * (*(a + j) - b);
			}
			*(S + i) /= n;
			*(S + i) = Math.sqrt(*(S + i));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(a);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5f\n",*(S + i));
		}
	}
}

