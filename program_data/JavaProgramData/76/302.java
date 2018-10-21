package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
		int n;
		int i;
		int j;
		int e;
		int f;
		int l;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  (a[j]) = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  (b[j]) = Integer.parseInt(tempVar3);
		  }
		}
		for (i = 0;i < (n - 1);i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					e = a[j + 1];
					a[j + 1] = a[j];
					a[j] = e;
					f = b[j + 1];
					b[j + 1] = b[j];
					b[j] = f;
				}
			}
		}
	x = a[0];
	y = b[0];
	for (i = 0;i < n - 1;i++)
	{
		if (a[i + 1] <= y)
		{
		if (y < b[i + 1])
		{
			y = b[i + 1];
		}
		}
		else
		{
			break;
		}
	}
	if (i < n - 1)
	{
		System.out.print("no\n");
	}
	else if (i == n - 1)
	{
		System.out.printf("%d %d\n",x,y);
	}
	return 0;
	}


}

