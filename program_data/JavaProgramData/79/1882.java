package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int m;
	int p;
	int w;
	int x = 0;
	int[] a = new int[10000];
	for (w = 1;w < 100;w++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	if (n == 0 && m == 0)
	{
	break;
	}
	int[] next = new int[n + 1];
	for (i = 1;i < n;i++)
	{
	next[i] = i + 1;
	}
	next[n] = 1;
	p = n;
	for (i = 1;n > 0;i++)
	{
	if (i % m == 0)
	{
		next[p] = next[next[p]];
	   --n;
	}
	   else
	   {
	   p = next[p];
	   }
	}
	a[w] = p;
	  x++;
	}
	   for (w = 1;w <= x;w++)

	   {
			System.out.printf("%d\n",a[w]);
	   }

	return 0;
	}

}

