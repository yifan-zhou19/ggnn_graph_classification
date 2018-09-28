package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int b;
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
		a[i - 1] = Integer.parseInt(tempVar2);
	}
	}


	for (i = 1;i <= n;i++)
	{
		if (a[i - 1] == 0)
		{
	continue;
		}
					   for (j = i + 1;j <= n;j++)
					   {
											if (a[j - 1] == a[i - 1])
											{
											a[j - 1] = 0;
											}
					   }
	}

	for (i = 0,b = 0;i <= n - 1;i++)
	{
					   if (a[i] != 0 && b == 0)
					   {
						   System.out.printf("%d",a[i]);
					   b = 1;
					   continue;
					   }
						if (a[i] != 0 && b != 0)
						{
						System.out.printf(",%d",a[i]);
						}
	}






		return 0;
	}

}

