package <missing>;

public class GlobalMembers
{
	public static void inputarray(int[] array, int n)
	{
		for (int i = 0; i < n; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				array[i] = Integer.parseInt(tempVar);
			}
		}
	}
	public static void place(int[] array, int n)
	{
		int mininum;
		int temp;
		for (int i = 0; i < n - 1; i++)
		{
			mininum = i;
			for (int j = i + 1; j < n; j++)
			{
				mininum = array[j] < array[mininum] != 0? j : mininum;
			}
			temp = array[i];
			array[i] = array[mininum];
			array[mininum] = temp;
		}
	}
	public static void combine(int[] array1, int[] array2, int m, int n)
	{
		for (int i = m; i < m + n; i++)
		{
			array1[i] = array2[i - m];
		}
	}
	public static void printarray(int[] array, int n)
	{
		System.out.printf("%d", array[0]);
		for (int i = 1; i < n; i++)
		{
			System.out.printf(" %d", array[i]);
		}
		System.out.print("\n");
	}

	public static int Main()
	{
		int[] array1 = new int[100];
		int[] array2 = new int[100];
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		inputarray(array1, m);
		inputarray(array2, n);
		place(array1, m);
		place(array2, n);
		combine(array1, array2, m, n);
		printarray(array1, m + n);
		return 0;
	}
}

