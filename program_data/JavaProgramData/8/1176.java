package <missing>;

public class GlobalMembers
{
	public static int shu1;
	public static int shu2;
	public static int[] sum = new int[max];
	public static int[] sum2 = new int[max];
	public static int comp(Object a, Object b)
	{
		return *(int)a - (int)b;
	}
	public static void input()
	{
		shu1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		shu2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	public static void input1()
	{
		int i;
		for (i = 0; i < shu1; i++)
		{
			sum[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < shu2; i++)
		{
			sum2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void pai()
	{
		qsort(sum, shu1,(Integer.SIZE / Byte.SIZE),comp);
		qsort(sum2, shu2,(Integer.SIZE / Byte.SIZE),comp);
	}
	public static void print()
	{
		int i;
		int k = 0;
		for (i = 0; i < shu1; i++)
		{
		if (k == 0)
		{
		System.out.print(sum[i]);
		k++;
		}
		else
		{
			System.out.print(" ");
			System.out.print(sum[i]);
		}
		}
		for (i = 0; i < shu2;i++)
		{
		if (k == 0)
		{
		System.out.print(sum2[i]);
		k++;
		}
		else
		{
			System.out.print(" ");
			System.out.print(sum2[i]);
		}
		}
	}
	public static int Main()
	{
		input();
		input1();
		pai();
		print();

	}
}

