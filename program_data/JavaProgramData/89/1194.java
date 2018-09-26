package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int e;
	int n;
	int[] a = new int[10000];
	int[] b = new int[10000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	e = 0;
	i = 1;
	j = 1;
	for (int k = 0;k < n;k++)
	{
			a[k] = 0;
			b[k] = 0;
	}


	while (i != 0 || j != 0)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				i = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
			a[i]++;
			b[j]++;
	}
			a[0]--;
			b[0]--;
	for (int k = 0;k < n;k++)
	{
		if (a[k] == 0 && b[k] == n - 1)
		{
						   e = 1;
						   System.out.printf("%d",k);
		}
	}
		if (e == 0)
		{
				 System.out.print("NOT FOUND");
		}




	return 0;
	}

}

