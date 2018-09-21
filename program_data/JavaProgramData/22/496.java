package <missing>;

public class GlobalMembers
{
	public static void selectionsort(int[] a, int s, int e)
	{
		int i;
		int j;
		int t;
		int min;
	for (i = s;i < e;i++)
	{
		min = i;
	for (j = i + 1;j < e;j++)
	{
	if (a[min] > a[j])
	{
		min = j;
	}
	}
	t = a[i];
	a[i] = a[min];
	a[min] = t;
	}
	}
	public static void Main()
	{
		int[] a = new int[300];
		int n = 1;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while (scanf(",%d", a[n++]))
		{
			;
		}
		n--;
	i = n - 1;
		selectionsort(a, 0, n);
		while (a[n - 1] == a[i] && i > 0)
		{
			i--;
		}
		if (i != 0)
		{
			System.out.printf("%d",a[i]);
		}
		else if (a[0] < a[n - 1])
		{
			System.out.printf("%d",a[0]);
		}
		else
		{
			System.out.print("No");
		}
	}
}

