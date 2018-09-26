package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[100];
	int i;
	int key = 0;
	int n;
	int j;
	int p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a[key] = 1;
	for (i = 1;i <= n;i++)
	{
	   for (j = 0;j < 100;j++)
	   {
		if (a[j] != 0)
		{
		a[j] = a[j] * 2;
		}
	   }
	   for (j = 0;j < 100;j++)
	   {
		if (a[j] >= 10)
		{
			a[j] = a[j] % 10;
			a[j + 1] = a[j + 1] + 1;
		}
	   }
	}

	for (i = 99;i >= 0;i--)
	{
	if (a[i] != 0)
	{
		p = i;
		break;
	}
	}
	for (i = p;i >= 0;i--)
	{
	System.out.printf("%d",a[i]);
	}
	System.out.print("\n");
	return 0;
	}

}

