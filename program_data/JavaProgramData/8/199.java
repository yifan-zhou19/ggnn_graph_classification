package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int[] aa = new int[100];
	int[] bb = new int[100];
	int[] cc = new int[200];
	int la;
	int lb;
	void scan(int a[],int la,int b[],int lb);
	void sort(int a[],int n);
	void combine(int a[],int la,int b[],int lb,int c[]);

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		la = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		lb = Integer.parseInt(tempVar2);
	}

	scan(aa, la, bb, lb);
	sort(aa, la);
	sort(bb, lb);


	combine(aa, la, bb, lb, cc);

	}

	public static void scan(int[] a, int la, int[] b, int lb)
	{
		int i;

		for (i = 0;i < la;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < lb;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}

	}

	public static void sort(int[] a, int n)
	{
		int i;
		int j;
		int k;
		int temp;

	  for (i = 0;i < n - 1;i++)
	  {
	  k = i;
	  for (j = i + 1;j < n;j++)
	  {
	   if (a[j] < a[k])
	   {
		   k = j;
	   }
	  }
	  temp = a[k];
	  a[k] = a[i];
	  a[i] = temp;

	  }

	}

	public static void combine(int[] a, int la, int[] b, int lb, int[] c)
	{
	int i;

	for (i = 0;i < lb;i++)
	{
	  a[la + i] = b[i];
	}
	for (i = 0;i < la + lb;i++)
	{
	c[i] = a[i];
	}
	System.out.printf("%d",c[0]);
	for (i = 1;i < la + lb;i++)
	{
	System.out.printf(" %d",c[i]);
	}
	}


}

