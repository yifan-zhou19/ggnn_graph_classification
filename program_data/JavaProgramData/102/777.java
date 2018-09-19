package <missing>;

public class GlobalMembers
{
	public static int[] male = new int[45];
	public static int[] female = new int[45];
	public static String ch = new String(new char[20]);
	public static int cmp1(Object a, Object b)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *temp1 = (int *)a;
		int temp1 = (int)a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *temp2 = (int *)b;
		int temp2 = (int)b;

		return (int)(temp1 - temp2);
	}
	public static int cmp2(Object a, Object b)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *temp1 = (int *)a;
		int temp1 = (int)a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *temp2 = (int *)b;
		int temp2 = (int)b;

		return (int)(temp2 - temp1);
	}


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int m = 0;
		int f = 0;
		double h;
		for (int i = 0; i < n ; i++)
		{
			ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (strcmp(ch, "male") == 0)
			{
				h = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				male[m] = (int)(h * 10000);
				m++;
			}
			else
			{
				h = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				female[f] = (int)(h * 10000);
				f++;
			}

		}
		qsort(male, m, (Integer.SIZE / Byte.SIZE), cmp1);
		qsort(female, f, (Integer.SIZE / Byte.SIZE), cmp2);

		for (int i = 0; i < m; i++)
		{
			System.out.printf("%3.2lf ",male[i] / 10000.0);
		}
		for (int i = 0; i < f - 1; i++)
		{
			System.out.printf("%3.2lf ",female[i] / 10000.0);
		}
		System.out.printf("%3.2lf",female[f - 1] / 10000.0);
		return 0;
	}
}

