package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		int i;
		double f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *c=(double *)malloc(sizeof(double)*n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			double c = (double)malloc((Double.SIZE / Byte.SIZE) * n); //????c?????????????
		int[] a = new int[n]; //a??????
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b=(int *)malloc(sizeof(int)*n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int b = (int)malloc((Integer.SIZE / Byte.SIZE) * n); //b????????
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum += a[i];
		}
		f = (double)sum / n; //??????????????
		for (i = 0;i < n;i++)
		{
			c[i] = (a[i] - f) > 0?a[i] - f:f - a[i]; //??????????
		}
		int m = 0;
		for (i = 0;i < n;i++)
		{
			if (c[i] > c[m])
			{
				m = i; //????????
			}
		}
		int x = 0;
		for (i = 0;i < n;i++)
		{
			if (c[i] == c[m])
			{
				b[x] = a[i]; //????????????????????b?
				x++;
			}

		}
		if (x == 1)
		{
			System.out.printf("%d",b[0]); //?????
		}
		else
		{
			System.out.printf("%d",b[0]);
			for (i = 1;i < x;i++)
			{
				System.out.printf(",%d",b[i]);
			}
		}

		return 0;
	}

}

