package <missing>;

public class GlobalMembers
{
	public static int compare1(Object a, Object b)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p = (int *)a;
		int p = (int)a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q = (int *)b;
		int q = (int)b;
		if (p > q)
		{
			return 1;
		}
		else if (p == q)
		{
			return 0;
		}
		else
		{
			return -1;
		}
	} //nv

	public static int compare2(Object a, Object b)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p = (int *)a;
		int p = (int)a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q = (int *)b;
		int q = (int)b;
		if (p > q)
		{
			return -1;
		}
		else if (p == q)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	} //nan

	public static void Main(String[] args)
	{
		int male = 0;
		int female = 0;
		int n;
		int i;
		float[] a = new float[40];
		float[] b = new float[40];
		String c = new String(new char[10]);
		float d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0 ; i < n ; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (!strcmp(c, "male"))
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					d = Float.parseFloat(tempVar3);
				}
				a[male] = d;
				male++;
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					d = Float.parseFloat(tempVar4);
				}
				b[female] = d;
				female++;
			}
		}
		//painansheng
		qsort(a, male, (Float.SIZE / Byte.SIZE), compare1);
		qsort(b, female, (Float.SIZE / Byte.SIZE), compare2);
		for (i = 0 ; i < male ; i++)
		{
			System.out.printf("%.2f ", a[i]);
		}
		for (i = 0 ; i < female ; i++)
		{
			System.out.printf("%.2f", b[i]);
			if (i != female-1)
			{
				System.out.print(" ");
			}
		}
		System.out.print("\n");


	}
}

