package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int x;
	  int y;
	  void forget(int,int);
	  forget(x, y);
	  return 0;
	}
	public static void forget(int x,int y)
	{
	   int i;
	   int j;
	   int k;
	   int t;
	   int T;
	   int[] a = new int[max];
	   int[] b = new int[max];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < x;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < y;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < x - 1;i++)
		{
		for (j = i + 1;j < x;j++)
		{
			if (a[i] > a[j])
			{
				t = a[j];
				a[j] = a[i];
				a[i] = t;
			}
		}
		}


		for (i = 0;i < y - 1;i++)
		{
		for (j = i + 1;j < y;j++)
		{
			if (b[i] > b[j])
			{
				T = b[j];
				b[j] = b[i];
				b[i] = T;
			}
		}
		}
		System.out.printf("%d",a[0]);
		for (j = 1;j < x;j++)
		{
		System.out.printf(" %d",a[j]);
		}
		for (j = 0;j < y;j++)
		{
		System.out.printf(" %d",b[j]);
		}


	}
}

