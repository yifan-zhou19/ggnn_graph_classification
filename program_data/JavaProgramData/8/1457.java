package <missing>;

public class GlobalMembers
{
	public static void sheng(int[] a, int n)
	{
			int i;
			int j;
			int b;
			for (i = 0;i < n;i++)
			{
			for (j = i;j < n;j++)
			{
			if (a[j] < a[i])

			{
			  b = a[i];
			  a[i] = a[j];
			  a[j] = b;
			}
			}
			}
	}
	public static int hebing(int[] a, int n, int[] b, int m, int[] c)
	{

		   int i;
		   for (i = 0;i < n;i++)
		   {
		   c[i] = a[i];
		   }
		   for (i = n;i < m + n;i++)
		   {
		   c[i] = b[i - n];
		   }
		   return *c;
	}
	public static int Main()
	{
	int n;
	int m;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	int[] a = new int[n];
	int[] b = new int[m];
	int[] c = new int[(m + n)];
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < m;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		b[i] = Integer.parseInt(tempVar4);
	}
	}
	sheng(a, n);
	sheng(b, m);
	hebing(a, n, b, m, c);
	System.out.printf("%d",c[0]);
	for (i = 1;i < m + n;i++)
	{
	System.out.printf(" %d",c[i]);
	}

	}

}

