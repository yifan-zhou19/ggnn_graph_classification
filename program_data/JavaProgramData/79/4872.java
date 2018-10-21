package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int k;
		int i;
		int j;
		int r;
		int num;
	  int[] a = new int[500];
	  int[] b = new int[300];

	for (;;)
	{
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
	 for (i = 1;i <= n;i++)
	 {
		 a[i] = 1;
	 }
	j = 0;
	k = 0;
	for (i = 1;i <= n;i++)
	{
		if (a[i] == 1)
		{
			j = j + a[i];
	if (j == m)
	{
		j = 0;
		a[i] = 0;
		k++;
	}
	if (k == n)
	{
		num = i;
		System.out.printf("%d\n",num);
		break;
	}
		}
	if (i == n)
	{
		i = 0;
	}
	}

	if (n == 0 && m == 0)
	{
	break;
	}


	}
	return 0;
	}
}

