package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		int l;
		int m;
		int y;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p[100],*pp[100],a,x=0,b=0,c;
		double[] p = new double[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *pp[100];
		double[] pp = new double[100];
		double a;
		double x = 0;
		double b = 0;
		double c;
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (double)malloc(100 * (Double.SIZE / Byte.SIZE));
			x = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[i]++ = Double.parseDouble(tempVar3);
				}
				x = x + *(p[i] - 1);
			}
			a = x / n;
			p[i] = p[i] - n;
			b = 0;
			for (y = 0;y < n;y++)
			{
				b = b + Math.pow((*(p[i] + y) - a),2);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			pp[i] = (double)malloc((Double.SIZE / Byte.SIZE));
			pp[i] = Math.sqrt(b / n);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5f\n",pp[i]);
		}
	}
}

