package <missing>;

public class GlobalMembers
{
	public static void sort(int[] array, int n)
	{
		int i;
		int j;
		int k;
		int t;
		for (i = 0;i < n - 1;i++)
		{
			k = i;
			for (j = i + 1;j < n;j++)
			{
				if (array[j] < array[k])
				{
					k = j;
				}
			}
				t = array[k];
				array[k] = array[i];
				array[i] = t;
		}
	}

	public static void add(int[] array1, int[] array2, int x, int y)
	{
		int[] array = new int[100];
		int i;
		int j;
		for (i = 0;i < x;i++)
		{
			array[i] = array1[i];
		}
		for (i = x,j = 0;j < y;i++,j++)
		{
			array[i] = array2[j];
		}
		System.out.printf("%d",array[0]);
		for (i = 1;i < x + y;i++)
		{
			System.out.printf(" %d",array[i]);
		}

	}


	public static void Main()
	{
		int i;
		int x;
		int y;
		int[] xarray = new int[50];
		int[] yarray = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < x;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				xarray[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < y;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				yarray[i] = Integer.parseInt(tempVar4);
			}
		}
		sort(xarray, x);
		sort(yarray, y);
		add(xarray, yarray, x, y);

	}


}

