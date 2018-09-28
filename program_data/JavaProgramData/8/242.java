package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[200];

	public static void enter(int[] array0, int p)
	{
	int i;
	for (i = 0;i < p;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		array0[i] = Integer.parseInt(tempVar);
	}
	}
	}

	public static void sort(int[] array, int p1)
	{
	int i;
	int j;
	int k;
	for (i = 0;i < p1 - 1;i++)
	{
	for (j = 0;j < p1 - 1 - i;j++)
	{
	if (array[j] > array[j + 1])
	{
	k = array[j];
	array[j] = array[j + 1];
	array[j + 1] = k;
	}
	}
	}
	}

	public static void paste(int[] array1, int[] array2)
	{
	int i;
	for (i = 0;i < m;i++)
	{
	c[i] = array1[i];
	}
	for (i = m;i < m + n;i++)
	{
	c[i] = array2[i - m];
	}
	}

	public static void out(int[] array3, int p2)
	{
	int i;
	System.out.printf("%d",array3[0]);
	for (i = 1;i < p2;i++)
	{
	System.out.printf(" %d",array3[i]);
	}
	}

	public static void Main()
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	enter(a, m);
	enter(b, n);
	sort(a, m);
	sort(b, n);
	paste(a, b);
	out(c, m + n);
	}


}

