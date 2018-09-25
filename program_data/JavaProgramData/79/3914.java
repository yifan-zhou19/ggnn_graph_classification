package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int k;
		int m;
		int n;
		for (;;)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
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
			for (i = 0,j = 0,k = 0;i < n - 1;j++)
			{
				if (j >= n)
				{
				j -= n;
				}
				if (a[j] == 0)
				{
				k++;
				}
				if (k == m)
				{
					a[j] = 1;
					k = 0;
					i++;
				}
			}
			for (i = 0;i < n;i++)
			{
				if (a[i] == 0)
				{
				System.out.printf("%d\n",i + 1);
				}
			}
		}
	}

}

