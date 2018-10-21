package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *a[100],b,sum,e;
		double[] a = new double[100];
		double b;
		double sum;
		double e;
		int i;
		int n;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		k = 0;
		while (k < m)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			if (n == 0)
			{
				System.out.print("0");
			}
			else
			{
			for (i = 0;i <= n - 1;i++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				a[i] = (double)malloc((Double.SIZE / Byte.SIZE));
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Double.parseDouble(tempVar3);
				}
			}
			sum = 0;
			for (i = 0;i <= n - 1;i++)
			{
				sum = sum + a[i];
			}

			b = sum / n;
			sum = 0;
			for (i = 0;i <= n - 1;i++)
			{
				sum = sum + Math.pow(a[i] - b,2.0);
			}
			e = Math.sqrt(sum / n);
			System.out.printf("%.5f\n", e);
			k++;
			}
		}

	}
}

