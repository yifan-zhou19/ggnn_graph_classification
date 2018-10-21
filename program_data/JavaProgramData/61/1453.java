package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[20];
	int[] b = new int[20];
	int[] c = new int[20];
	int i;
	int t;
	int k;
	int w;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (k = 0;k < n;k++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[k] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0;i < n;i++)
	{
	b[i] = 0;
	c[i] = 1;
		for (w = 0;w < a[i] - 1;w++)
		{

	t = b[i];
	b[i] = c[i];
	c[i] = b[i] + t;

		}
		System.out.printf("%d\n",c[i]);
	}
	return 0;



	}
}

