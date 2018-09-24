package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *a;
		double a;
		double s;
		double t;
		int n;
		int i;
		int j;
		int k;
		int l;
		int m;
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
			s = 0.0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			a = (double)malloc((Double.SIZE / Byte.SIZE) * (n + 1));

			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(a + j) = Double.parseDouble(tempVar3);
				}
				s = s + *(a + j);
			}
			s = s / n;
			t = 0.0;
			for (j = 0;j < n;j++)
			{
				t = t + (*(a + j) - s) * (*(a + j) - s);
			}
			t = Math.sqrt(t / n);
			System.out.printf("%.5f\n",t);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(a);
		}
	}
}

