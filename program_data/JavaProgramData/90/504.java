package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		int[] a = new int[20];
		int[] b = new int[20];
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		int k = new int(int m, int n);
		for (i = 0;i < t;i++)
		{
			System.out.printf("%d\n",k(a[i], b[i]));
		}
	}

	public static int k(int m, int n)
	{
	  if (m < 0)
	  {
		 return 0;
	  }
	  if (m == 0 || n == 1)
	  {
		 return 1;
	  }
	  return k(m - n, n) + k(m, n - 1);
	}
}

