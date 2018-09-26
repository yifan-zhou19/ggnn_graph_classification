package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int k = 1;
		int p = 0;
		int[] a = new int[1000];
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
			if (m == 0 && n == 0)
			{
				break;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Integer.SIZE / Byte.SIZE));
			k = 1,p = 0;
			for (i = 1;;i++)
			{
				if (i > n)
				{
					i = i % n;
				}
				if (p == n - 1)
				{
					break;
				}
				if (a[i] == 1)
				{
					continue;
				}

				if (k == m)
				{
					a[i] = 1;
					p++;
					k = 1;
				}
				else
				{
					k++;
				}
				//printf("%d %d %d\n",a[1],a[2],a[3]);
			}
			for (i = 1;i <= n;i++)
			{
			   if (a[i] == 0)
			   {
					System.out.printf("%d\n",i);

					break;
			   }
			}
		}
		return 0;
	}

}

