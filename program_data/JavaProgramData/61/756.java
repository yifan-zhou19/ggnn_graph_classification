package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
	int c;
	if (n == 1)
	{
	   c = 1;
	}
	else if (n == 2)
	{
	   c = 1;
	}
	else
	{
	   c = f(n - 1) + f(n - 2);
	}
	return c;
	}
	public static void Main()
	{
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[100];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	System.out.print("\n");
	}
	for (i = 0;i < n;i++)
	{
	System.out.printf("%d\n",f(a[i]));
	}

	}

}

