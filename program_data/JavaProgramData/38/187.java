package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *a=(double *)malloc(n *sizeof(double)),E=0,D=0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			double a = (double)malloc(n * (Double.SIZE / Byte.SIZE));
			double E = 0;
			double D = 0;
			for (j = 0;j < n;E += *(a + j - 1))
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a + j++ = Double.parseDouble(tempVar3);
				}
			}
			E /= n;
			for (j = 0;j < n;j++)
			{
				D += (*(a + j) - E) * (*(a + j) - E);
			}
			D /= n;
			System.out.printf("%.5lf\n",Math.sqrt(D));
		}

	}
}

