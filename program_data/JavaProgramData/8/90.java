package <missing>;

public class GlobalMembers
{
	//???????????????

	public static int num1;
	public static int num2;
	public static int[] array1 = new int[20];
	public static int[] array2 = new int[20];
	public static int[] array = new int[40];

	public static void input(int[] array1, int[] array2)
	{
		int i;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			num2 = Integer.parseInt(tempVar2);
		}

		for (i = 0;i <= num1 - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				array1[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j <= num2 - 1;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				array2[j] = Integer.parseInt(tempVar4);
			}
		}
	}

	public static void sort(int[] array, int n)
	{
		int i;
		int j;
		int t;

		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (array[j] > array[j + 1]) //????
				{
					t = array[j];
					array[j] = array[j + 1];
					array[j + 1] = t;
				}
			}
		}
	}

	public static void link(int[] array1, int[] array2, int[] array, int n1, int n2)
	{
		int i;

		for (i = 0;i < n1;i++)
		{
			array[i] = array1[i];
		}
		for (i = 0;i < n2;i++)
		{
			array[i + n1] = array2[i];
		}
	}

	public static void output(int[] array, int n)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d%c",array[i],i < n - 1?' ':'\n');
		}
	}

	public static void Main()
	{
		 input(array1, array2);
		sort(array1, num1);
		sort(array2, num2);
		link(array1, array2, array, num1, num2);
		output(array, num1 + num2);
	}
}

