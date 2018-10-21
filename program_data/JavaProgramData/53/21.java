package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		   int i;
		   int j;
		   int n;
		   int m;
		   int x;
		   int[] a = new int[301];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i = i + 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (m = 0,i = 0;i <= n - 2;i = i + 1)
		{
			for (j = i + 1;a[i] != 10000 && j <= n - 1;j = j + 1)
			{
				if (a[i] == a[j])
				{
					a[j] = 10000;
				}
			}
		}
		for (i = 0;i <= n - 1;i = i + 1)
		{
			if (a[i] != 10000)
			{
				System.out.printf("%d",a[i]);
			}
			x = i;
			break;
		}
		for (i = x + 1;i <= n - 1;i = i + 1)
		{
		  if (a[i] != 10000)
		  {
			  System.out.printf(",%d",a[i]);
		  }
		}

	}

}

