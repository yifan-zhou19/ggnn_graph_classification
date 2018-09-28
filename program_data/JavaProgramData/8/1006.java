package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[MAX];
	public static int[] b = new int[MAX];
	public static int al;
	public static int bl;

	public static void input()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			al = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			bl = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < al;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < bl;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}

	}

	public static void Qsort(int start, int length, int[] a)
	{
		int x = a[start];
		int i;
		int j;
		i = start;
		j = length - 1;
		while (i < j)
		{
			if (x < a[j])
			{
				j--;
			}
			else if (x > a[j])
			{
				a[i] = a[j];
				a[j] = x;
				i++;
			}
			else if (x < a[i])
			{
				a[j] = a[i];
				a[i] = x;
				j--;
			}
			else
			{
				i++;
			}
		}
		if (start < length - 1)
		{
			Qsort(start, i, a);
			Qsort(i + 1, length, a);
		}
	}

	public static void sort()
	{
		Qsort(0, al, a);
		Qsort(0, bl, b);
	}

	public static void combine()
	{
		int i;
		for (i = 0;i < bl;i++)
		{
			a[i + al] = b[i];
		}
	}

	public static void output()
	{
		int i;
		for (i = 0;i < bl + al - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
	System.out.printf("%d",a[i]);


	}
	//????????????main??????????????????
	public static void Main()
	{
		input();
		sort();
		combine();
		output();

	}


}

