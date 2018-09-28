package <missing>;

public class GlobalMembers
{
	public static int[] s = new int[100];
	public static int sl(int i, int n)
	{
		int r;
	s[0] = 1;
	s[1] = 1;
	for (i = 2;i < n;i++)
	{
	   s[i] = s[i - 1] + s[i - 2];
	}
	r = s[n - 1];
	return r;
	}
	public static int Main()
	{
	int i;
	int n;
	int[] s = new int[100];
	int[] a = new int[100];
	int[] b = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}

	for (i = 0;i < n;i++)
	{
	  b[i] = sl(i, a[i]);
	System.out.printf("%d\n",b[i]);
	}
	return 0;
	}


}

