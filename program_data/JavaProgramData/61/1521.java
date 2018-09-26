package <missing>;

public class GlobalMembers
{
	public static int F(int n)
	{
	int a;
	int b;
	int i;
	int s;
	if (n == 1)
	{
		s = 1;
	}
	else if (n == 2)
	{
		s = 1;
	}
	else
	{
		  a = 1;
		  b = 1;
		  for (i = 3;i <= n;i++)
		  {
		  s = a + b;
		  a = b;
		  b = s;
		  }
	}
	return s;
	}
	public static int Main()
	{
	int[] a = new int[10000];
	int i;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
	}
	for (i = 1;i <= n;i++)
	{
		System.out.printf("%d\n",F(a[i]));
	}
	return 0;
	}
}

