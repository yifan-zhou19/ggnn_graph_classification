package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		double s;
		double temp;
		double a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p[1000];
		double[] p = new double[1000];

		for (i = 0;i <= 999;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (double)malloc((Double.SIZE / Byte.SIZE));
		}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= k - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j <= n - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[j] = tempVar3;
				}
			}
			a = 0;
			for (j = 0;j <= n - 1;j++)
			{
				a = a + p[j];
			}
			a = a / n;
			temp = 0;
			for (j = 0;j <= n - 1;j++)
			{
				temp = temp + Math.pow((p[j] - a),2);
			}
			s = Math.sqrt(temp / n);
			System.out.printf("%.5f\n",s);
		}
	}
}

