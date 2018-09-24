package <missing>;

public class GlobalMembers
{
	public static int f(tangible.RefObject<Integer> p, tangible.RefObject<Integer> t, int n)
	{
		int i;
		int j;
		int s = 0;
	t.argValue = p.argValue;
	for (i = 1;i <= n - 1;i++)
	{
		for (j = 0;j <= s;j++)
		{
		if (*(p.argValue + i) == *(t.argValue + j))
		{
	   break;
		}

		}
	  if (j == s + 1)
	  {
		  *(t.argValue + j) = *(p.argValue + i);
	   s++;

	  }
	}
	return s;


	}
	public static void Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int n;
		int i;
		int s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n - 1;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
tangible.RefObject<Integer> tempRef_b = new tangible.RefObject<Integer>(b);
	s = f(tempRef_a, tempRef_b, n);
	b = tempRef_b.argValue;
	a = tempRef_a.argValue;
	for (i = 0;i <= s - 1;i++)
	{
	System.out.printf("%d,",b[i]);
	}
	System.out.printf("%d\n",b[s]);

	}
}

