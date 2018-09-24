package <missing>;

public class GlobalMembers
{
	public static float[] man = new float[40];
	public static float[] woman = new float[40];

	public static int n;

	public static int compare1(Object a, Object b)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float * p = (float *)a;
		float p = (float)a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float * q = (float *)b;
		float q = (float)b;

		if (p > q)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int compare2(Object a, Object b)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float * p = (float *)a;
		float p = (float)a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float * q = (float *)b;
		float q = (float)b;

		if (p > q)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}

	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int x = 0;
		int y = 0;
		String sex = new String(new char[10]);
		float height;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; ++i)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				height = Float.parseFloat(tempVar3);
			}
			if (strcmp(sex, "female") == 0)
			{
				woman[j] = height;
				j += 1;
			}
			else
			{
				man[k] = height;
				k += 1;
			}
		}

		qsort(man, k, (Float.SIZE / Byte.SIZE), compare1);
		qsort(woman, j, (Float.SIZE / Byte.SIZE), compare2);

		for (i = 0; i < k; ++i)
		{
			System.out.printf("%.2f ", man[i]);
		}
		for (i = 0; i < j - 1; ++i)
		{
			System.out.printf("%.2f ", woman[i]);
		}
		System.out.printf("%.2f\n",woman[i]);
		return 0;
	}
}

