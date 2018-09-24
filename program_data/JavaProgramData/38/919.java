package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p[100][1000],*q[100],*a[100];
		double[][] p = new double[100][1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *q[100];
		double[] q = new double[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *a[100];
		double[] a = new double[100];
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *num[100];
		int[] num = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			num[i] = (int)malloc((Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			a[i] = (double)malloc((Double.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			q[i] = (double)malloc((Double.SIZE / Byte.SIZE));
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = tempVar2;
			}
			for (j = 0;j < num[i];j++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				*(*(p + i) + j) = (double)malloc((Double.SIZE / Byte.SIZE));
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					*(*(p + i) + j) = tempVar3;
				}
			}
			for (j = 0,a[i] = 0;j < num[i];j++)
			{
				a[i] = a[i] + **(*(p + i) + j);
			}
			a[i] = a[i] / (num[i]);
			for (j = 0,q[i] = 0;j < num[i];j++)
			{
				q[i] = q[i] + Math.pow((**(*(p + i) + j) - a[i]),2);
			}
			q[i] = q[i] / (num[i]);
			q[i] = Math.sqrt(q[i]);
			System.out.printf("%.5f\n",q[i]);
		}
	}

}

