package <missing>;

public class GlobalMembers
{
	public static int[] array_a = new int[100];
	public static int[] array_b = new int[100];
	public static int n_a;
	public static int n_b;
	public static void input()
	{
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n_a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n_b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n_a;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				array_a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n_b;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				array_b[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void order()
	{
		int i;
		int j;
		int temp;

		for (i = 1;i < n_a;i++)
		{
			for (j = 1;j < n_a + 1 - i;j++)
			{
				if (array_a[j] < array_a[j - 1])
				{
					temp = array_a[j];
					array_a[j] = array_a[j - 1];
					array_a[j - 1] = temp;
				}
			}
		}
		for (i = 1;i < n_b;i++)
		{
			for (j = 1;j < n_b - i + 1;j++)
			{
				if (array_b[j] < array_b[j - 1])
				{
					temp = array_b[j];
					array_b[j] = array_b[j - 1];
					array_b[j - 1] = temp;
				}
			}
		}
	}
	public static void catenate()
	{
		int i;
		for (i = 0;i < n_b;i++)
		{
			array_a[n_a + i] = array_b[i];
		}
	}
	public static void print()
	{
		int i;
		for (i = 0;i < n_a + n_b;i++)
		{
			System.out.printf("%d%c",array_a[i],(i == n_a + n_b - 1)?'\n':' ');
		}
	}
	public static int Main()
	{
		input();
		order();
		catenate();
		print();
		return 0;
	}
}

