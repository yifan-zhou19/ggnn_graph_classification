package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int t;
		int k;

	for (i = 0;;i++)

	{
		for (j = 0;j <= 15;j++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[j] = Integer.parseInt(tempVar);
		}
		if (a[j] == 0)
		{
			break;
		}
	if (a[0] == -1)
	{
		System.out.print("\n");
		return 0;
	}
		}

		for (j = 0,t = 0;j <= 14;j++)
		{
			for (k = j + 1;k <= 15;k++)
			{
			if (a[k] != 0 && a[j] != 0 && (2 * a[j] == a[k] || 2 * a[k] == a[j]))
			{
			t = t + 1;
			}
			}
		  a[j] = 0;
		}
		System.out.printf("%d\n",t);


	}
		System.out.print("\n");


	  return 0;
	}
}

