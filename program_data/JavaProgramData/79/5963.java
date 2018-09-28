package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a[20000];
		int[] a = new int[20000];
		int i;
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *k;
		int k;
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
			if (n == 0)
			{
				return 0;
			}
			for (i = 1;i < n;i++)
			{
				a[i] = a[i + 1];
			}
			a[n] = a[1];
			k = a[1];
			if (m == 1)
			{
				System.out.printf("%d\n",n);
			}
			else
			{
			while (k != k)
			{
				for (i = 1;i < m - 1;i++)
				{
					k = k;
				}
				k = (int)(k);
				k = k;
			}
			System.out.printf("%d\n", k - (int) a[1] + 1);
			}
		}
	}
}

