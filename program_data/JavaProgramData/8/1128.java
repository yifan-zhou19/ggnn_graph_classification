package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int[] c = new int[2000];
	public static int m;
	public static int n;
	public static int i;
	public static int j;
	public static int t;
	public static void read()
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
	   for (i = 0;i < m;i++)
	   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a[i] = Integer.parseInt(tempVar3);
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   b[i] = Integer.parseInt(tempVar4);
		   }
	   }
	}
	public static void sort()
	{
		for (i = 0;i < m;i++)
		{
			   for (j = i + 1;j < m;j++)
			   {
			if (a[j] < a[i])
			{
				t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
			   }
		}
	for (i = 0;i < n;i++)
	{
			   for (j = i + 1;j < n;j++)
			   {
			if (b[j] < b[i])
			{
				t = b[i];
				b[i] = b[j];
				b[j] = t;
			}
			   }
	}
	}
	public static void cat()
	{
		for (i = 0;i < m;i++)
		{
			c[i] = a[i];
		}
		for (i = m;i < m + n;i++)
		{
			c[i] = b[i - m];
		}
	}
	public static void print()
	{
		for (i = 0;i < m + n - 1;i++)
		{
	System.out.printf("%d ",c[i]);
		}
	System.out.printf("%d",c[m + n - 1]);
	}

	public static int Main()
	{
		read();
		sort();
		cat();
		print();


	}
}

