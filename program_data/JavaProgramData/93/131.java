package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = {3, 5, 7};
	int[] b = new int[3];
	int i;
	int t = 100;
	for (i = 0;i < 3;i++)
	{
	if (n % a[i] == 0)
	{
	b[i] = a[i];
	}
	}
	for (i = 0;i < 3;i++)
	{
	if (b[i] != 0)
	{
	t = i;
	break;
	}
	}
	if (t != 100)
	{
	System.out.printf("%d",b[t]);
	}
	for (i = t + 1;i < 3;i++)
	{
	if (b[i] != 0)
	{
	System.out.printf(" %d",b[i]);
	}
	}
	if (n % 3 != 0 && n % 5 != 0 && n % 7 != 0)
	{
	System.out.print("n");
	}
	}
}

